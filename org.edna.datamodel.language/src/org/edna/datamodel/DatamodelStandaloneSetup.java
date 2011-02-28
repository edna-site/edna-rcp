
package org.edna.datamodel;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
public class DatamodelStandaloneSetup extends DatamodelStandaloneSetupGenerated{
	public static void doSetup() {
		new DatamodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public void setStandalone (boolean standalone) {
		if (standalone) {
			Injector theInjector = createInjectorAndDoEMFRegistration();
			DatamodelInjector.injector.set(theInjector);
		}
	}
}

