
/*
 * generated by Xtext
 */
 
package org.edna.datamodel.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class DatamodelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.edna.datamodel.ui.internal.DatamodelActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.edna.datamodel.ui.internal.DatamodelActivator.getInstance().getInjector("org.edna.datamodel.Datamodel");
	}
	
}