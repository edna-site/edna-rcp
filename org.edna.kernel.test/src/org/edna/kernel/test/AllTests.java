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

package org.edna.kernel.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * 
 * The AllTest testsuite launches all the individual test cases.
 *
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.edna_site.eclipse.kernel.test");
		//$JUnit-BEGIN$
		suite.addTestSuite(TestCaseLauncher.class);
		suite.addTestSuite(TestCaseTestLauncherView.class);
		suite.addTestSuite(TestCaseXSDataCommon.class);
		//$JUnit-END$
		return suite;
	}

}
