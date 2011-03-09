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

import org.eclipse.emf.ecore.EObject;
import org.edna.datamodel.datamodel.ComplexType;

public class JavaExtensions {
	public static String getTimestamp () {
		SimpleDateFormat df = new SimpleDateFormat("EEE MMM d hh:mm::ss yyyy", Locale.ENGLISH);
		return df.format(new Date());
	}

	/**
	 * Returns the name of the resource the object is contained in without the trailing file extension.
	 */
	public static String getResourceName (EObject obj) {
		if (obj.eResource()==null) return "";
		final String resource = obj.eResource().getURI().lastSegment();
		return resource.substring(0, resource.lastIndexOf('.'));
	}

	public static List<ComplexType> sortComplexTypes (List<ComplexType> types) {
		List<ComplexType> result = new ArrayList<ComplexType>(types);
		Collections.sort(result, new Comparator<ComplexType>() {
			public int compare(ComplexType t1, ComplexType t2) {
				if (t1 == t2) return 0;
				if (t1.getBaseType()!=null && t1.getBaseType()==t2)
					return 1;
				if (t2.getBaseType()!=null && t2.getBaseType()==t1)
					return -1;
				return t1.getName().compareTo(t2.getName());
			}
		});
		return result;
	}
}
