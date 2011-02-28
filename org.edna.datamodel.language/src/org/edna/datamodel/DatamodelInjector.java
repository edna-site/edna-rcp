package org.edna.datamodel;

import com.google.inject.Injector;

public class DatamodelInjector {
	public static ThreadLocal<Injector> injector = new ThreadLocal<Injector>();
}
