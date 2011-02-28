/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf.java;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.internal.xtend.util.Cache;
import org.eclipse.xtend.expression.TypeNameUtil;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.type.impl.java.JavaTypeImpl;
import org.eclipse.xtend.type.impl.java.JavaTypeStrategy;
import org.eclipse.xtend.type.impl.java.TypeFinder;
import org.eclipse.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.Type;


public class EMFJavaMetaModel extends JavaMetaModel implements MetaModel, TypeFinder {
	private JavaTypeStrategy _strategy;

	/**
	 * This cache is copied from JavaMetaModel, since we need a slight modification.
	 * Instead of instantiating JavaTypeImpl we use the specialized type EMFJavaTypeImpl here.
	 */
	private final Cache<Class<?>, Type> cache = new Cache<Class<? extends Object>, Type>() {
		@Override
		protected Type createNew(final Class<?> clazz) {
			final TypeSystem typeSystem = getTypeSystem();
			final JavaTypeImpl impl = new EMFJavaTypeImpl(EMFJavaMetaModel.this, clazz, TypeNameUtil.getName(clazz), _strategy);
			if (List.class.isAssignableFrom(clazz))
				return typeSystem.getListType(typeSystem.getObjectType());
			else if (Set.class.isAssignableFrom(clazz))
				return typeSystem.getSetType(typeSystem.getObjectType());
			else if (Collection.class.isAssignableFrom(clazz))
				return typeSystem.getCollectionType(typeSystem.getObjectType());
			return impl;
		}
	};

	/**
	 * This cache maps a Java package name to the EMF EPackage in it, if existent.
	 * The cache will return null for packages that do not contain an EPackage.
	 */
	private final Cache<String, EPackage> packageCache = new Cache<String, EPackage> () {
		@Override
		protected EPackage createNew(String packageName) {
			for (Iterator<?> it=EPackage.Registry.INSTANCE.values().iterator(); it.hasNext(); ) {
				Object registryEntry = it.next();
				EPackage pck = null;
				// Entry might be of type RegistryReader$EPackageDescriptor when running within
				// a plugin
				if (registryEntry instanceof EPackage) {
					pck = (EPackage) registryEntry;
					if (packageName.equals(pck.getClass().getPackage().getName())) {
						return pck;
					}
					for (Class<?> itf : pck.getClass().getInterfaces()) {
						if (packageName.equals(itf.getPackage().getName())) {
							return pck;
						}
					}
				}
			}
			return null;
		}
	};

	public EMFJavaMetaModel () {
		this("EMFJavaMetaModel", new JavaBeansStrategy());
	}

	public EMFJavaMetaModel(String name, JavaTypeStrategy strategy) {
		super(name, strategy);
		this._strategy = strategy;
	}

	/**
	 * Returns the corresponding type for an <code>EClass</code> object.
	 *
	 * @param clazz
	 *            the <code>EClass</code> object
	 * @return the corresponding type
	 */
	public Type getTypeForClass(final Class<?> clazz) {
		return cache.get(clazz);
	}

	/**
	 * @see org.eclipse.xtend.typesystem.MetaModel#getKnownTypes()
	 */
	public Set<Type> getKnownTypes() {
		final Collection<Type> col = cache.getValues();
		return (Set<Type>) (col instanceof Set ? col : new HashSet<Type>(col));
	}

	/**
	 * This method searches the defining EClass for the interface or implementation
	 * of an EMF Java class. This is done by matching the 'instanceClass' property
	 * of an EClass.
	 * @param clazz A Java class or interface
	 * @return The EClass for clazz. Will return null for normal Java classes.
	 */
	protected EClass getEClassForType (Class<?> clazz) {
		EPackage pck = clazz.getPackage()!=null ? packageCache.get(clazz.getPackage().getName()) : null;
		if (pck != null) {
			// pck is only not null if there is an EPackage in the package of clazz
			for (EClassifier clz : pck.getEClassifiers()) {
				if (clz instanceof EClass) { // ignore other EClassifiers
					if (clazz.isInterface()) {
						if (clazz.equals(clz.getInstanceClass())) {
							return (EClass) clz;
						}
					} else {
						// clazz might be the implementation class
						// we need to prove for the interface
						for (Class<?> itf : clazz.getInterfaces()) {
							if (itf.equals(clz.getInstanceClass())) {
								return (EClass) clz;
							}
						}
					}
				}
			}
		}
		return null;
	}
}
