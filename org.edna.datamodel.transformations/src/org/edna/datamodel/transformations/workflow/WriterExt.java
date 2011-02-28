package org.edna.datamodel.transformations.workflow;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Writer;
import org.edna.datamodel.scoping.IndexIgnoringGlobalScopeProvider;

public class WriterExt extends Writer {
	private String resourceSetSlot = "resourceSet";

	public void setResourceSetSlot(String resourceSetSlot) {
		this.resourceSetSlot = resourceSetSlot;
	}

	public String getResourceSetSlot() {
		return resourceSetSlot;
	}

	@Override
	public void checkConfiguration(Issues issues) {
		checkRequiredConfigProperty("resourceSetSlot", resourceSetSlot, issues);
		super.checkConfiguration(issues);
	}

	@Override
	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		getResourceSet().getLoadOptions().put(IndexIgnoringGlobalScopeProvider.RESOURCE_SET_ONLY, Boolean.TRUE);
		super.invokeInternal(ctx, monitor, issues);
	}

}
