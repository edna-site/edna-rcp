package org.edna.datamodel.transformations.workflow;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.SingleGlobalResourceSet;

public class GlobalResourceSetClearer extends AbstractWorkflowComponent2 {

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// clear global resource set
		SingleGlobalResourceSet.get().getResources().clear();
	}

}
