/*
* generated by Xtext
*/
package org.edna.datamodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DatamodelUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.edna.datamodel.ui.internal.DatamodelActivator.getInstance().getInjector("org.edna.datamodel.Datamodel");
	}
	
}
