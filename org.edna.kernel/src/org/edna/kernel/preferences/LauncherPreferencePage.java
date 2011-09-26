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

import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.edna.kernel.Activator;

/**
 * This is the preference page for the EDNA kernel plugin.
 */

public class LauncherPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public LauncherPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Preferences for the EDNA kernel launcher");
	}
	
	public void createFieldEditors() {
		addField(new DirectoryFieldEditor(LauncherPreferenceConstants.P_EDNA_HOME_PATH, 
				"EDNA_&HOME directory preference:", getFieldEditorParent()));
		addField(new StringFieldEditor(LauncherPreferenceConstants.P_EDNA_SITE, "EDNA_&SITE preference:", getFieldEditorParent()));
		addField(new DirectoryFieldEditor(LauncherPreferenceConstants.P_WORKING_DIRECTORY_PATH, 
				"&Working directory preference:", getFieldEditorParent()));
		addField(new FileFieldEditor(LauncherPreferenceConstants.P_PYTHON_PATH, 
				"&Python path preference:", getFieldEditorParent()));
	}

	public void init(IWorkbench workbench) {
	}
	
}