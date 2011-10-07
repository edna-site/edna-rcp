/*
 *    Project: The EDNA Kernel
 *             http://www.edna-site.org
 *
 *    File: "$Id:$"
 *
 *    Copyright (C) 2008-2009 European Synchrotron Radiation Facility
 *                            Grenoble, France
 *
 *    Principal authors: Marie-Francoise Incardona (incardon@esrf.fr)
 *                       Olof Svensson (svensson@esrf.fr)
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU Lesser General Public License as published
 *    by the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    and the GNU Lesser General Public License  along with this program.
 *    If not, see <http://www.gnu.org/licenses/>.
 */
package org.edna.datamodel.generateds;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.edna.datamodel.datamodel.ComplexType;
import org.edna.datamodel.datamodel.ElementDeclaration;

public class JavaExtensions {
	public static String getTimestamp () {
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM d hh:mm::ss yyyy", Locale.ENGLISH);
		return df.format(new Date());
	}

	/**
	 * Returns the name of the resource the object is contained in without the trailing file extension.
	 */
	public static String getResourceName (EObject obj) {
		if (obj.eResource()==null)
			return null;
		final String resource = obj.eResource().getURI().lastSegment();
		return resource.substring(0, resource.lastIndexOf('.'));
	}

	public static String getResourceLocation (EObject obj) {
		if (obj.eResource()==null)
			return null;
		final URI resourceURI = obj.eResource().getURI();
		final String[] resourceList = resourceURI.segments();
		String resource = resourceList[2];
		for (int i=3; i < resourceList.length-1; i++) {
			resource += "/"+resourceList[i];
		}
		return resource;
	}

	public static List<ComplexType> sortComplexTypes (List<ComplexType> types) {
		List<ComplexType> result = new ArrayList<ComplexType>(types);
		Collections.sort(result, new Comparator<ComplexType>() {
			public int compare(ComplexType t1, ComplexType t2) {
				if (t1 == t2) return 0;
				if (t1.getBaseType()!=null && t2.getBaseType()==null)
					return 1;
				if (t1.getBaseType()==null && t2.getBaseType()!=null)
					return -1;
				int hierarchy = getHierarchyLevel(t1).compareTo(getHierarchyLevel(t2));
				if (hierarchy != 0)
					return hierarchy;
				if (hasReferenceTo(t1, t2))
					return 1;
				if (hasReferenceTo(t2, t1))
					return -1;
				if (getResourceName(t1) != null && !getResourceName(t1).equals(getResourceName(t2)))
					return getResourceName(t1).compareTo(getResourceName(t2));

				return t1.getName().compareTo(t2.getName());
			}
		});
		return result;
	}

	private static boolean hasReferenceTo (ComplexType source, ComplexType target) {
		ComplexType currentBaseType = source.getBaseType();
		while (currentBaseType!=null && !currentBaseType.eIsProxy()) {
			if (currentBaseType==target)
				return true;
			currentBaseType = currentBaseType.getBaseType();
		}
		for (ElementDeclaration element: source.getElements()) {
			if (element.getRef()!=null && element.getRef()==target)
				return true;
		}
		return false;
	}

	private static Integer getHierarchyLevel (ComplexType t) {
		int level = 0;
		ComplexType baseType = t.getBaseType();
		while (baseType != null && !baseType.eIsProxy()) {
			level ++;
			baseType = baseType.getBaseType();
		}
		return level;
	}

	public static void resolveAllInResource (EObject ctx) {
		EcoreUtil.resolveAll(ctx.eResource().getResourceSet());
	}
}
