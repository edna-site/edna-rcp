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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.edna.datamodel.transformations.m2m.AbstractDatamodelTransformation;

/**
 * An MWE Workflow Component that adapts an EDNA datamodel transformation implementation.
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
@SuppressWarnings("rawtypes")
public class TransformationComponent extends AbstractWorkflowComponent2 {
	private AbstractDatamodelTransformation transformation;

	public void setTransformation(AbstractDatamodelTransformation transformation) {
		this.transformation = transformation;
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		try {
			if (ctx.get("resourceSet")!=null) {
				ResourceSet rs = (ResourceSet) ctx.get("resourceSet");
				for (Resource r : rs.getResources()) {
					transformation.getResourceSet().getResource(r.getURI(), true);
				}
			}
			transformation.setMonitor(monitor);
			Resource sourceModel = transformation.loadSourceModel();
			transformation.apply(sourceModel.getContents().get(0));
			transformation.writeTargetResource();
		} catch (Exception e) {
			e.printStackTrace();
			issues.addError(this, e.getMessage());
		}
	}

}
