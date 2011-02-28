/*
 *    Project: The EDNA Kernel
 *             http://www.edna-site.org
 *
 *    File: "$Id:$"
 *
 *    Copyright (C) 2008-2009 European Synchrotron Radiation Facility
 *                            Grenoble, France
 *
 *    Principal authors: Marie-Francoise Incardona (incardon@esrf.fr)
 *                       Olof Svensson (svensson@esrf.fr)
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published
 *    by the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    and the GNU Lesser General Public License  along with this program.
 *    If not, see <http://www.gnu.org/licenses/>.
 */
package org.edna.uml2xsd.ui;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.mwe.core.resources.AbstractResourceLoader;
import org.osgi.framework.Bundle;

public class BundleResourceLoader extends AbstractResourceLoader {
	private final Bundle bundle;

	public BundleResourceLoader(String bundleName) {
		this.bundle = Platform.getBundle(bundleName);
	}

	@Override
	protected Class<?> tryLoadClass(final String clazzName) throws ClassNotFoundException {
		return bundle.loadClass(clazzName);
	}

	@Override
    protected URL loadFromContextClassLoader(final String path) {
		return bundle.getResource(path);
	}

	@Override
    protected Class<?> internalLoadClass(final String clazzName) throws ClassNotFoundException {
		return bundle.loadClass(clazzName);
	}
}