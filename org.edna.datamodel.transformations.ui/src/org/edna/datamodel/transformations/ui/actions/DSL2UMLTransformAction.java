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
package org.edna.datamodel.transformations.ui.actions;

import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Package;
import org.topcased.modeler.tools.DiagramFileInitializer;

public class DSL2UMLTransformAction extends TransformAction {
	private static final String DIAGRAM_ID = "org.topcased.modeler.uml.classdiagram";

	@Override
	protected URI getTargetFileUri(URI sourceFile) {
		return URI.createURI(sourceFile.toString().replaceFirst("\\.edml", ".uml"));
	}

	@Override
	protected String getWorkflowFile() {
		return "org/edna/datamodel/transformations/workflow/dsl2uml.mwe";
	}

	@Override
	protected void configureArguments(HashMap<String, String> args) {
		super.configureArguments(args);

		String includePathsValue = getDslIncludePaths();
		args.put("includePaths", includePathsValue);
	}

	@Override
	protected void postTransform(URI targetFile, IProgressMonitor monitor) {
		ResourceSet rs = new ResourceSetImpl();
		Resource umlModel = rs.getResource(targetFile, true);
		Package umlPackage = (Package) umlModel.getContents().get(0);

		DiagramFileInitializer initializer = new DiagramFileInitializer();
		try {
			initializer.createDiagram(umlPackage, DIAGRAM_ID, true, monitor);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
