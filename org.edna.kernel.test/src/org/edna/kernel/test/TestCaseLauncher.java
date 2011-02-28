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
 * This test calse tests the class Launcher.
 */
public class TestCaseLauncher extends TestCase {

	
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
	 * This test method tests the Launcher.executeCommand by executing the 
	 * command "ls" in the directory "/tmp".
	 * @throws Exception 
	 */
	@Test
	public void testTestExecuteCommandline() throws Exception {
		String commandLine = "ls";
		File workingDirectory = new File( "/tmp" );
		launcher.executeCommand(commandLine, System.out);
	}

}
