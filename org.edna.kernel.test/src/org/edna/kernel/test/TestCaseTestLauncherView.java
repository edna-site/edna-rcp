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

/**
 * 
 */
package org.edna.kernel.test;


import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.edna.kernel.views.TestLauncherView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This test case tests the TestLauncherView.
 *
 */
public class TestCaseTestLauncherView extends TestCase {

	private static final String VIEW_ID = "org.edna_site.eclipse.kernel.views.TestLauncherView";

	/**
	 * The object that is being tested.
	 * 
	 * @see org.edna.kernel.views.TestLauncherView
	 */
	private TestLauncherView testLauncherView;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Initialize the test fixture for each test
		// that is run.
		waitForJobs();
		testLauncherView = (TestLauncherView) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().showView(VIEW_ID);

		// Delay for 3 seconds so that
		// the Favorites view can be seen.

		waitForJobs();
		delay(3000);

		// Add additional setup code here.
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		// Dispose of test fixture.

		waitForJobs();
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.hideView(testLauncherView);

		// Add additional teardown code here.
	}

	/**
	 * Run the view test.
	 */
	@Test
	public void testLauncherView() {
//		TableViewer viewer = testLauncherView.getFavoritesViewer();
//		Object[] expectedContent = new Object[] { "One", "Two", "Three" };
//		Object[] expectedLabels = new String[] { "One", "Two", "Three" };
//
//		// Assert valid content.
//		IStructuredContentProvider contentProvider = (IStructuredContentProvider) viewer
//				.getContentProvider();
//		assertArrayEquals(expectedContent, contentProvider.getElements(viewer
//				.getInput()));
//
//		// Assert valid labels.
//		ITableLabelProvider labelProvider = (ITableLabelProvider) viewer
//				.getLabelProvider();
//		for (int i = 0; i < expectedLabels.length; i++)
//			assertEquals(expectedLabels[i], labelProvider.getColumnText(
//					expectedContent[i], 1));
	}

	/**
	 * Process UI input but do not return for the specified time interval.
	 * 
	 * @param waitTimeMillis
	 *            the number of milliseconds
	 */
	private void delay(long waitTimeMillis) {
		Display display = Display.getCurrent();

		// If this is the UI thread,
		// then process input.

		if (display != null) {
			long endTimeMillis = System.currentTimeMillis() + waitTimeMillis;
			while (System.currentTimeMillis() < endTimeMillis) {
				if (!display.readAndDispatch())
					display.sleep();
			}
			display.update();
		}
		// Otherwise, perform a simple sleep.

		else {
			try {
				Thread.sleep(waitTimeMillis);
			} catch (InterruptedException e) {
				// Ignored.
			}
		}
	}

	/**
	 * Wait until all background tasks are complete.
	 */
	public void waitForJobs() {
		while (Job.getJobManager().currentJob() != null)
			delay(1000);
	}

}
