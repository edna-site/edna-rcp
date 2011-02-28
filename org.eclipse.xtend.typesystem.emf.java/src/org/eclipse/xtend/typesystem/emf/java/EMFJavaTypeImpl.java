/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf.java;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.type.impl.java.JavaTypeImpl;
import org.eclipse.xtend.type.impl.java.JavaTypeStrategy;

public class EMFJavaTypeImpl extends JavaTypeImpl {
    private EClass eClass;

	public EMFJavaTypeImpl(JavaMetaModel meta, Class<?> clazz, String name,
			JavaTypeStrategy strategy) {
		super(meta, clazz, name, strategy);
		this.eClass = ((EMFJavaMetaModel)meta).getEClassForType(clazz);
	}

	@Override
	public Object newInstance() {
		if (eClass!=null) {
			return eClass.getEPackage().getEFactoryInstance().create(eClass);
		} else {
			return super.newInstance();
		}
	}

    @Override
    public boolean isAbstract() {
    	if (eClass!=null) {
    		return eClass.isAbstract();
    	} else {
    		return super.isAbstract();
    	}
    }

}
