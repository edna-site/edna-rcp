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
package org.edna.datamodel.transformations.workflow;

import java.io.File;
import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.mwe.PathTraverser;
import org.eclipse.xtext.mwe.Reader;

import com.google.common.base.Predicate;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

/**
 * An adapter workflow component for Xtext's MWE Reader component. The Xtext
 * Reader component must be configured with subsequent calls of 'path' setters
 * for paths to search Xtext resources on. This component reads the registered
 * platform resource paths from the EcorePlugin to locate the paths where EDNA
 * datamodels can be read from.
 *
 * @author Karsten Thoms
 */
public class ReaderExt extends Reader {
	private String includePaths;

	private String resourceSetSlot = "resourceSet";

	private WorkflowContext ctx;

	public void setResourceSetSlot(String resourceSetSlot) {
		this.resourceSetSlot = resourceSetSlot;
	}

	@Override
	protected void checkConfigurationInternal(Issues issues) {
		checkRequiredConfigProperty("resourceSetSlot", resourceSetSlot, issues);
		for (URI path : EcorePlugin.getPlatformResourceMap().values()) {
			addPath(path.toFileString());
		}
		if (includePaths != null && !"".equals(includePaths)) {
			for (String path : includePaths.split(",")) {
				addPath(path.trim());
			}
		}
		// super must be called last, since paths must be set before
		super.checkConfigurationInternal(issues);
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		try {
			this.ctx = ctx;
			super.invokeInternal(ctx, monitor, issues);
			ctx.set("injectors", getInjectors());
		} catch (RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	protected void populateResourceSet(ResourceSet set,
			Multimap<String, URI> uris) {
		Collection<URI> values = Sets.newHashSet(uris.values());
		for (URI uri : values) {
			set.getResource(uri, true);
		}
		ctx.set(resourceSetSlot, set);
	}

	public void setIncludePaths(String includePaths) {
		this.includePaths = includePaths;
	}

	public String getIncludePaths() {
		return includePaths;
	}

	/**
	 * Avoids a NullPointerException in the default implementation of PathTraverser
	 */
	@Override
	protected PathTraverser getPathTraverser() {
		return new PathTraverser() {
			@Override
			public Set<URI> findAllResourceUris(String path,
					Predicate<URI> isValidPredicate) {
				final String userDir = System.getProperty("user.dir");
				if (userDir!=null && userDir.equals(path)) {
					return Sets.newHashSet();
				}
				final String homeDir = System.getenv("HOME");
				if (homeDir!=null && homeDir.equals(path)) {
					return Sets.newHashSet();
				}

				return super.findAllResourceUris(path, isValidPredicate);
			}
			@Override
			protected Set<URI> traverseDir(File file,
					Predicate<URI> isValidPredicate) {
				Set<URI> result = Sets.newHashSet();
				File[] files = file.listFiles();
				// files must be check for null
				if (files != null) {
					for (File f : files) {
						if (f.isDirectory()) {
							result.addAll(traverseDir(f, isValidPredicate));
						} else {
							URI uri = URI.createFileURI(f.getAbsolutePath());
							if (isValidPredicate.apply(uri)) {
								result.add(uri);
							}
						}
					}
				}
				return result;
			}
		};
	}

}
