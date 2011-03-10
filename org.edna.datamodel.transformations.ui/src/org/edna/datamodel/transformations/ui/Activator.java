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
package org.edna.datamodel.transformations.ui;

import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.edna.datamodel.DatamodelRuntimeModule;
import org.edna.datamodel.transformations.ui.util.BundleResourceLoader;
import org.edna.datamodel.ui.DatamodelUiModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
	// The plug-in ID
	public static final String PLUGIN_ID = "org.edna.datamodel.transformations.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private Injector injector;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		configure();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void configure() {
		ResourceLoaderFactory.setCurrentThreadResourceLoader(new BundleResourceLoader("org.edna.datamodel.transformations"));
		injector = Guice.createInjector(Modules2.mixin(new DatamodelRuntimeModule(), new DatamodelUiModule(getDefault()), new SharedStateModule()));
	}

	public Injector getInjector() {
		return injector;
	}
}
