package org.edna.datamodel.transformations.ui.util;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.edna.datamodel.transformations.ui.Activator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getDefault().getBundle();
	}

	@Override
	protected Injector getInjector() {
		return org.edna.datamodel.ui.Activator.getInstance().getInjector();
	}

}
