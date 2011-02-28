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

import static org.junit.Assert.*;

import java.io.File;

import junit.framework.TestCase;

import org.edna.kernel.Launcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This test case will work only on the computer lapsvensson
 * (or another computer with the same installation of EDNA).
 * 
 * It launchers the EDTestSuiteKernel test.
 *
 */
public class TestCaseLauncher_lapsvensson extends TestCase {

	
	private Launcher launcher;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		launcher = new Launcher();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests the launcher.executeCommand by launching the EDNA kernel test suite.
	 */
	@Test
	public void testExecuteCommand() throws Exception {
		String commandLine = "/home/svensson/WorkSpace-350/edna/kernel/bin/edna-test-launcher --test EDTestSuiteKernel";
		File workingDirectory = new File( "/tmp" );
		launcher.setWorkingDirectory(workingDirectory);
		launcher.executeCommand(commandLine, System.out);
	}

}
