package org.edna.datamodel.transformations.ui.actions;

import org.eclipse.emf.common.util.URI;

public class UML2XSDTransformAction extends TransformAction {

	@Override
	protected URI getTargetFileUri(URI sourceFile) {
		return URI.createURI(sourceFile.toString().replaceFirst("\\.uml", ".xsd"));
	}

	@Override
	protected String getWorkflowFile() {
		return "org/edna/datamodel/transformations/workflow/uml2xsd.mwe";
	}

}
