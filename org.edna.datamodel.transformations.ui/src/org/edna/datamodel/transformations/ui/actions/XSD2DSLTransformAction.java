package org.edna.datamodel.transformations.ui.actions;

import java.util.HashMap;

import org.eclipse.emf.common.util.URI;


public class XSD2DSLTransformAction extends TransformAction {

	@Override
	protected URI getTargetFileUri(URI sourceFile) {
		return URI.createURI(sourceFile.toString().replaceFirst("\\.xsd", ".edna_datamodel"));
	}

	@Override
	protected String getWorkflowFile() {
		return "org/edna/datamodel/transformations/workflow/xsd2dsl.mwe";
	}

	@Override
	protected void configureArguments(HashMap<String, String> args) {
		super.configureArguments(args);

		String includePathsValue = getDslIncludePaths();
		args.put("includePaths", includePathsValue);
	}
}
