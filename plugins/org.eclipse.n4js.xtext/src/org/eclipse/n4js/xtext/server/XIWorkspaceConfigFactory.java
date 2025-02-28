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
package org.eclipse.n4js.xtext.server;

import org.eclipse.emf.common.util.URI;
import org.eclipse.n4js.xtext.workspace.XIWorkspaceConfig;

/**
 * @author Jan Koehnlein - Initial contribution and API
 * @since 2.11
 */
public interface XIWorkspaceConfigFactory {
	/**
	 * Create a workspace config at the given location.
	 *
	 * @param workspaceBaseURI
	 *            the location
	 * @return the workspace configuration.
	 */
	XIWorkspaceConfig createWorkspaceConfig(URI workspaceBaseURI);

}
