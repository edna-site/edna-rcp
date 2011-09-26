/*
 *
 *    Project: The EDNA Kernel
 *             http://www.edna-site.org
 *
 *    File: "$Id:$"
 *
 *    Copyright (C) 2008-2009 European Synchrotron Radiation Facility
 *                            Grenoble, France
 *
 *    Principal authors: Olof Svensson (svensson@esrf.fr) 
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
 *
 */

package org.edna.kernel.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
//import org.edna.common.util.python.PythonUtils;
import org.edna.kernel.Activator;

/**
 * Class used to initialize default preference values for the kernel plugin.
 */
public class LauncherPreferenceInitializer extends AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(LauncherPreferenceConstants.P_EDNA_HOME_PATH, "");
		store.setDefault(LauncherPreferenceConstants.P_EDNA_SITE, "");
		store.setDefault(LauncherPreferenceConstants.P_WORKING_DIRECTORY_PATH, "/tmp");
		//store.setDefault(LauncherPreferenceConstants.P_PYTHON_PATH, PythonUtils.getProbablePythonPath());
		store.setDefault(LauncherPreferenceConstants.P_PYTHON_PATH, "/usr/bin/python");
	}

}
