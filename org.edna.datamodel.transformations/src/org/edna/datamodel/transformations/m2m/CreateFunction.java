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

import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

/**
 * A function that creates and initializes an object.
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class CreateFunction<K,V> implements Function<K, V>{
	private Map<K,V> map = Maps.newHashMap();

	public final V apply(K source) {
		V result = map.get(source);
		if (result == null) {
			result = find (source);
		}
		if (result == null) {
			result = (V) create ();
			map.put(source, result);
			configure (source, result);
		}
		return result;
	}

	protected abstract V create();

	protected abstract V configure (K source, V newInstance);

	protected V find (K source) {
		return null;
	}

}
