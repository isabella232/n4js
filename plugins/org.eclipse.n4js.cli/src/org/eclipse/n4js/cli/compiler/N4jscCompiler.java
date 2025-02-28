/**
 * Copyright (c) 2019 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.cli.compiler;

import java.io.File;
import java.nio.file.Path;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.n4js.cli.N4jscConsole;
import org.eclipse.n4js.cli.N4jscException;
import org.eclipse.n4js.cli.N4jscExitCode;
import org.eclipse.n4js.cli.N4jscExitState;
import org.eclipse.n4js.cli.N4jscFactory;
import org.eclipse.n4js.cli.N4jscOptions;
import org.eclipse.n4js.smith.Measurement;
import org.eclipse.n4js.smith.N4JSDataCollectors;
import org.eclipse.n4js.utils.URIUtils;
import org.eclipse.n4js.xtext.server.LanguageServerFrontend;
import org.eclipse.n4js.xtext.server.ProjectStatePersisterConfig;
import org.eclipse.n4js.xtext.server.XLanguageServerImpl;
import org.eclipse.n4js.xtext.server.build.DefaultBuildRequestFactory;
import org.eclipse.n4js.xtext.server.build.XWorkspaceManager;
import org.eclipse.n4js.xtext.workspace.ProjectConfigSnapshot;

import com.google.common.base.Stopwatch;
import com.google.inject.Injector;

/**
 * The entry point for all cli calls with the goals 'compile' and 'clean'
 */
public class N4jscCompiler {
	private static final Logger LOG = LogManager.getLogger(N4jscCompiler.class);

	private final N4jscOptions options;
	private final XLanguageServerImpl languageServer;
	private final N4jscLanguageClient callback;
	private final XWorkspaceManager workspaceManager;

	/** Starts the compiler for goal COMPILE or CLEAN in a blocking fashion */
	static public N4jscExitState start(N4jscOptions options) throws Exception {
		N4jscCompiler compiler = new N4jscCompiler(options);
		return compiler.start();
	}

	private N4jscCompiler(N4jscOptions options) {
		this.options = options;
		this.languageServer = N4jscFactory.getLanguageServer();
		this.callback = N4jscFactory.getLanguageClient();
		this.workspaceManager = N4jscFactory.getWorkspaceManager();

		/*
		 * Review feedback:
		 *
		 * use a correctly configured Guice module for that purpose.
		 */
		setPersisterOptions();
		this.languageServer.connect(callback);
		setupWorkspaceBuildActionListener();
	}

	/** Starts the compiler in a blocking fashion */
	public N4jscExitState start() throws Exception {
		InitializeParams params = new InitializeParams();
		File baseDir = options.getDir();
		if (baseDir == null) {
			throw new N4jscException(N4jscExitCode.ARGUMENT_DIRS_INVALID, "No base directory");
		}

		params.setRootUri(baseDir.toURI().toString());
		languageServer.initialize(params).get();
		warnIfNoProjectsFound();
		verbosePrintAllProjects();

		switch (options.getGoal()) {
		case clean:
			performClean();
			break;
		case compile:
			performCompile();
			break;
		default:
			break;
		}

		languageServer.shutdown();
		languageServer.exit();

		return determineExitState();
	}

	private void performClean() {
		Stopwatch compilationTime = Stopwatch.createStarted();
		try (Measurement m = N4JSDataCollectors.dcCliClean.getMeasurement()) {
			LanguageServerFrontend frontend = languageServer.getFrontend();
			frontend.clean();
			frontend.join();
		}
		printCleanResults(compilationTime.stop());
	}

	private void performCompile() {
		if (options.isClean()) {
			performClean();
			callback.resetCounters();
		}
		Stopwatch compilationTime = Stopwatch.createStarted();
		try (Measurement m = N4JSDataCollectors.dcBuild.getMeasurement()) {
			languageServer.initialized(new InitializedParams());
			languageServer.joinServerRequests();
		}
		printCompileResults(compilationTime.stop());
	}

	private void setPersisterOptions() {
		Injector injector = N4jscFactory.getOrCreateInjector();
		ProjectStatePersisterConfig persisterConfig = injector.getInstance(ProjectStatePersisterConfig.class);
		persisterConfig.setDeleteState(options.isClean());
		persisterConfig.setWriteToDisk(!options.isNoPersist());
	}

	private void setupWorkspaceBuildActionListener() {
		Injector injector = N4jscFactory.getOrCreateInjector();
		DefaultBuildRequestFactory buildRequestFactory = injector.getInstance(DefaultBuildRequestFactory.class);
		buildRequestFactory.setAfterGenerateListener(callback);
		buildRequestFactory.setAfterDeleteListener(callback);
		buildRequestFactory.setAfterBuildListener(callback);
	}

	private void warnIfNoProjectsFound() {
		Set<? extends ProjectConfigSnapshot> projects = workspaceManager.getProjectConfigs();
		if (projects.isEmpty()) {
			N4jscConsole.println("No projects found at the given location: " + options.getDirs().get(0));
		}
	}

	private void verbosePrintAllProjects() {
		if (options.isVerbose()) {
			Set<? extends ProjectConfigSnapshot> projects = workspaceManager.getProjectConfigs();
			int maxPrjNameLength = projects.stream()
					.filter(p -> p.getName() != null)
					.mapToInt(p -> p.getName().length())
					.max().orElse(10);
			String prjNameWithPadding = "%-" + maxPrjNameLength + "s";

			if (!projects.isEmpty()) {
				Path workspace = options.getDirs().get(0).toPath();

				SortedMap<String, String> projectNameList = new TreeMap<>();
				for (ProjectConfigSnapshot prj : projects) {
					String prjName = prj.getName() == null ? "[no_name]" : prj.getName();
					String locationStr = null;
					if (prj.getPath() == null) {
						locationStr = "[no_location]";
					} else {
						locationStr = workspace.relativize(URIUtils.toPath(prj.getPath())).toString();
						if (locationStr.isBlank()) {
							locationStr = ".";
						}
					}
					String outputLine = String.format(prjNameWithPadding + " at %s", prjName, locationStr);
					projectNameList.put(locationStr, outputLine);
				}

				LOG.info(projects.size() + " projects: \n   " + String.join("\n   ", projectNameList.values()));
			}
		}
	}

	private void printCleanResults(Stopwatch elapsedTime) {
		long deltd = callback.getDeletionsCount();
		String durationStr = elapsedTime.toString();
		String msg = String.format("Clean results - Deleted: %d, Duration: %s", deltd, durationStr);
		N4jscConsole.println(msg);
	}

	private void printCompileResults(Stopwatch elapsedTime) {
		long trsnp = callback.getTranspilationsCount();
		long deltd = callback.getDeletionsCount();
		long errs = callback.getErrorsCount();
		long wrns = callback.getWarningsCount();
		String durationStr = elapsedTime.toString();
		String msg = String.format(
				"Compile results - Transpiled: %d, Deleted: %d, Errors: %d, Warnings: %d, Duration: %s",
				trsnp, deltd, errs, wrns, durationStr);
		N4jscConsole.println(msg);
	}

	private N4jscExitState determineExitState() {
		if (callback.getErrorsCount() > 0) {
			return new N4jscExitState(N4jscExitCode.VALIDATION_ERRORS, true, Long.toString(callback.getErrorsCount()));
		}

		return N4jscExitState.SUCCESS;
	}

}
