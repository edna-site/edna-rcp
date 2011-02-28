package org.edna.datamodel.ui;

import org.edna.datamodel.ui.internal.DatamodelActivator;
import org.osgi.framework.BundleContext;

import com.google.inject.Injector;

public class Activator extends DatamodelActivator {
	private static Activator INSTANCE;

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}

	public static Activator getInstance() {
		return INSTANCE;
	}

	public Injector getInjector () {
		return getInjector("org.edna.datamodel.Datamodel");
	}

}
