/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.n4js.xtext.server.build;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.IFileSystemAccess;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class XSource2GeneratedMapping {
	private final Multimap<URI, URI> source2generated;

	private final Multimap<URI, URI> generated2source;

	private final Map<URI, String> generated2OutputConfigName;

	/**
	 * Default constructor.
	 */
	public XSource2GeneratedMapping() {
		this(HashMultimap.create(), HashMultimap.create(), new HashMap<>());
	}

	/**
	 * Constructor
	 */
	public XSource2GeneratedMapping(Multimap<URI, URI> source2generated,
			Multimap<URI, URI> generated2source, Map<URI, String> generated2OutputConfigName) {
		this.source2generated = source2generated;
		this.generated2source = generated2source;
		this.generated2OutputConfigName = generated2OutputConfigName;
	}

	/**
	 * Create a copy of this mapping.
	 */
	public XSource2GeneratedMapping copy() {
		return new XSource2GeneratedMapping(
				HashMultimap.create(this.source2generated),
				HashMultimap.create(this.generated2source),
				new HashMap<>(this.generated2OutputConfigName));
	}

	/**
	 * Add a mapping in the {@link IFileSystemAccess#DEFAULT_OUTPUT default output}.
	 */
	public void addSource2Generated(URI source, URI generated) {
		addSource2Generated(source, generated, IFileSystemAccess.DEFAULT_OUTPUT);
	}

	/**
	 * Add a source to gen mapping.
	 */
	public void addSource2Generated(URI source, URI generated, String outputCfgName) {
		this.source2generated.put(source, generated);
		this.generated2source.put(generated, source);
		this.generated2OutputConfigName.put(generated,
				outputCfgName == null ? IFileSystemAccess.DEFAULT_OUTPUT : outputCfgName);
	}

	/**
	 * Remove a source to gen mapping.
	 */
	public void removeSource2Generated(URI source, URI generated) {
		this.source2generated.remove(source, generated);
		this.generated2source.remove(generated, source);
		if (!generated2source.containsKey(generated)) {
			this.generated2OutputConfigName.remove(generated);
		}
	}

	/**
	 * Mark the source as deleted and return all the former generated uris.
	 */
	public Set<URI> deleteSource(URI source) {
		Set<URI> generated = new HashSet<>(this.source2generated.removeAll(source));
		for (URI gen : generated) {
			this.generated2source.remove(gen, source);
			if (!generated2source.containsKey(gen)) {
				this.generated2OutputConfigName.remove(gen);
			}
		}
		return generated;
	}

	/**
	 * Mark the source as deleted and return all the former generated uris.
	 */
	public Map<URI, String> deleteSourceAndGetOutputConfigs(URI source) {
		Set<URI> generated = new HashSet<>(source2generated.removeAll(source));
		Map<URI, String> result = new HashMap<>();
		for (URI gen : generated) {
			generated2source.remove(gen, source);
			result.put(gen, generated2OutputConfigName.get(gen));
			if (!generated2source.containsKey(gen)) {
				generated2OutputConfigName.remove(gen);
			}
		}
		return result;
	}

	/**
	 * Remove the generated file from this mapping.
	 */
	public void deleteGenerated(URI generated) {
		this.generated2source.removeAll(generated).forEach((it) -> {
			this.source2generated.remove(it, generated);
		});
		this.generated2OutputConfigName.remove(generated);
	}

	/**
	 * Get the output configuration that led to the given generated URI.
	 */
	public String getOutputConfigName(URI generated) {
		return this.generated2OutputConfigName.get(generated);
	}

	/**
	 * Return all the generated resources for the given source.
	 */
	public List<URI> getGenerated(URI source) {
		return new ArrayList<>(this.source2generated.get(source));
	}

	/**
	 * Return all the source resources for the given generated resource.
	 */
	public List<URI> getSource(URI generated) {
		return new ArrayList<>(this.generated2source.get(generated));
	}

	/**
	 * Return all the generated resources.
	 */
	public List<URI> getAllGenerated() {
		return new ArrayList<>(this.generated2source.keySet());
	}

	/**
	 * @see Externalizable#readExternal(java.io.ObjectInput)
	 */
	public void readExternal(DataInput in) throws IOException {
		int numEntries = in.readInt();
		while (numEntries > 0) {
			numEntries--;
			URI source = URI.createURI(in.readUTF());
			int numGenerated = in.readInt();
			while (numGenerated > 0) {
				numGenerated--;
				URI generated = URI.createURI(in.readUTF());
				String outputConfig = in.readUTF();
				this.addSource2Generated(source, generated, outputConfig);
			}
		}
	}

	/**
	 * @see Externalizable#writeExternal(java.io.ObjectOutput)
	 */
	public void writeExternal(DataOutput out) throws IOException {
		Set<Map.Entry<URI, Collection<URI>>> entries = this.source2generated.asMap().entrySet();
		out.writeInt(entries.size());
		for (Map.Entry<URI, Collection<URI>> it : entries) {
			out.writeUTF(it.getKey().toString());
			out.writeInt(it.getValue().size());
			for (URI value : it.getValue()) {
				out.writeUTF(value.toString());
				out.writeUTF(this.generated2OutputConfigName.get(value));
			}
		}
	}

}
