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
package org.edna.datamodel.transformations.m2m;

import java.util.Comparator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.edna.datamodel.datamodel.ComplexType;

/**
 * Typed Comparator implementations used for the transformations.
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class Comparators {
	public static final Comparator<String> stringComparator = new Comparator<String>() {
		public int compare(String arg0, String arg1) {
			return arg0.compareTo(arg1);
		}
	};
	public static final Comparator<NamedElement> namedElementComparator = new Comparator<NamedElement>() {

		public int compare(NamedElement arg0, NamedElement arg1) {
			return arg0.getName().compareTo(arg1.getName());
		}
	};

	public static final Comparator<ComplexType> complexTypeComparator = new Comparator<ComplexType>() {

		public int compare(ComplexType arg0, ComplexType arg1) {
			return arg0.getName().compareTo(arg1.getName());
		}
	};

	public static final Comparator<EObject> nameResolverComparator = new Comparator<EObject>() {
		public int compare(EObject arg0, EObject arg1) {
			String name0 = SimpleAttributeResolver.NAME_RESOLVER.apply(arg0);
			String name1 = SimpleAttributeResolver.NAME_RESOLVER.apply(arg1);
			return name0.compareTo(name1);
		}
	};

}
