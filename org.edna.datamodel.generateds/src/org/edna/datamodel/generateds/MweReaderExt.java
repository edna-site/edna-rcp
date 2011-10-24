package org.edna.datamodel.generateds;

import static java.lang.String.format;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

public class MweReaderExt extends Reader {
	@Override
	public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		if (ctx.get("resourceSet")!=null)
			resourceSet = (ResourceSet) ctx.get("resourceSet");

		super.invokeInternal(ctx, monitor, issues);
		EObject result = (EObject) ctx.get(getModelSlot());
		EcoreUtil.resolveAll(result);

		for (Iterator<EObject> it = result.eAllContents(); it.hasNext();) {
			EObject obj = it.next();
			for (@SuppressWarnings("rawtypes")
			EContentsEList.FeatureIterator featureIterator = (EContentsEList.FeatureIterator) obj
					.eCrossReferences().iterator(); featureIterator.hasNext();) {
				EObject eObject = (EObject) featureIterator.next();
				EReference eReference = (EReference) featureIterator.feature();
				if (eObject.eIsProxy()) {
					issues.addError(String.format(
							"Unresolved proxy in object %s, reference %s",
							getDescription(obj), eReference.getName()));
				}
			}
		}
	}

	private String getDescription(EObject o) {
		if (o.eClass().getEStructuralFeature("name") != null) {
			return format("%s '%s'", o.eClass().getName(),
					o.eGet(o.eClass().getEStructuralFeature("name")));
		} else {
			return o.toString();
		}
	}
}
