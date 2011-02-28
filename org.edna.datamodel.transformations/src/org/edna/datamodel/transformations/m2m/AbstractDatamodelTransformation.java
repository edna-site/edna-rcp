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
package org.edna.datamodel.transformations.m2m;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.SingleGlobalResourceSet;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.edna.datamodel.scoping.IndexIgnoringGlobalScopeProvider;

import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractDatamodelTransformation<SOURCE,TARGET> implements Function<SOURCE,TARGET> {
	protected final Log LOG = LogFactory.getLog(getClass());

	protected SOURCE sourceModel;
	protected TARGET targetModel;
	protected String nsUri;
	protected URI sourceUri;
	protected URI targetUri;
	protected String[] includePaths;
	protected Injector injector;

	@Inject
	private ResourceSet resourceSet;
	private Resource sourceResource;
	private Resource targetResource;
	protected Properties sourceProperties = new Properties();
	protected Properties targetProperties = new Properties();

	protected ProgressMonitor monitor;

	@Inject
	protected IResourceDescriptions index;

	@Inject
	protected IQualifiedNameProvider nameProvider;


	public AbstractDatamodelTransformation () {
		injector = Guice.createInjector(new org.edna.datamodel.DatamodelRuntimeModule());
		injector.injectMembers(this);
	}

	public SOURCE getSourceModel() {
		return sourceModel;
	}

	public void setSourceModel(SOURCE sourceModel) {
		this.sourceModel = sourceModel;
	}

	public TARGET getTargetModel() {
		return targetModel;
	}

	public void setTargetModel(TARGET targetModel) {
		this.targetModel = targetModel;
	}

	public String getNsUri() {
		return nsUri;
	}

	public void setNsUri(String nsUri) {
		this.nsUri = nsUri;
	}

	public URI getSourceUri() {
		return sourceUri;
	}

	public void setSourceUri(String sourceUri) {
		this.sourceUri = URI.createURI(sourceUri);
	}

	public URI getTargetUri() {
		return targetUri;
	}

	public void setTargetUri(String targetUri) {
		this.targetUri = URI.createURI(targetUri);
	}

	public Resource getSourceResource() {
		return sourceResource;
	}

	public void setSourceResource(Resource sourceResource) {
		this.sourceResource = sourceResource;
	}

	public ResourceSet getResourceSet () {
		if (resourceSet == null) {
			resourceSet = SingleGlobalResourceSet.get();
			resourceSet.getLoadOptions().put(IndexIgnoringGlobalScopeProvider.RESOURCE_SET_ONLY, Boolean.TRUE);
		}
		return resourceSet;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public void setTargetResource(Resource targetResource) {
		this.targetResource = targetResource;
	}

	protected Resource getTargetResource () {
		if (targetResource == null) {
			targetResource = getResourceSet().createResource(targetUri);
		}
		return targetResource;
	}

	public void setIncludePaths (String paths) {
		this.includePaths = paths.split(",");
		for (int i=0; i<includePaths.length; i++)
			includePaths[i] = includePaths[i].trim();
	}

	public TARGET apply (SOURCE sourceModel) {
		monitor.beginTask("Transforming "+sourceUri.lastSegment()+" to "+targetUri.lastSegment(), getAmountOfWork(sourceModel));
		ResourceSetBasedResourceDescriptions descs = (ResourceSetBasedResourceDescriptions) index;
		descs.setContext((Notifier) sourceModel);
		TARGET target = transform(sourceModel);
		return target;
	}

	public abstract TARGET transform (SOURCE sourceModel);

	public Resource loadSourceModel () {
		if (sourceResource == null) {
			LOG.info("Loading source file "+sourceUri.lastSegment());
			sourceResource = getResourceSet().getResource(sourceUri, true);
			/*
			File sourcePropertiesFile = new File(resolveUri(sourceUri)+".properties");
			if (sourcePropertiesFile.exists()) {
				try {
					sourceProperties.load(new FileInputStream(sourcePropertiesFile));
					LOG.info("Loading source properties file "+sourcePropertiesFile.getName());
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			*/
		}
		return sourceResource;
	}

	/*
	private String resolveUri (URI uri) {
		URI platformUri = EcorePlugin.getPlatformResourceMap().get(uri.segment(uri.segmentCount()-2));
		StringBuilder b = new StringBuilder(platformUri.toFileString());
		for (int i=1; i<uri.segmentCount(); i++) {
			b.append("/");
			b.append(uri.segment(i));
		}
		return b.toString();
	}
	*/

	public Resource writeTargetResource () throws IOException {
		LOG.info("Writing target file "+targetUri.lastSegment());
		Resource target = getTargetResource();
		if (!target.getContents().contains(getTargetModel())) {
			target.getContents().add((EObject) getTargetModel());
		}
		try {
			getTargetResource().save(Maps.newHashMap());
			if (!targetProperties.isEmpty()) {
				/*
				File targetPropertiesFile = new File(resolveUri(targetUri)+".properties");
				targetPropertiesFile.createNewFile();
		targetProperties.store(new FileOutputStream(targetPropertiesFile), null);
				LOG.info("Writing target properties file "+targetPropertiesFile.getName());
				*/
			}
		} catch (Exception e) {
			throw new WrappedException(e);
		}
		return getTargetResource();
	}

	public void setMonitor(ProgressMonitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * @return Number of tasks. Equal to the number of times monitor.worked(1) is called.
	 */
	protected abstract int getAmountOfWork (SOURCE sourceModel);
}
