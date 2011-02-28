package org.edna.tomov1;

import static org.junit.Assert.fail;

import java.io.StringWriter;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.edna.tomov1.launchers.TomoLaunchers;
import org.edna.tomov1.xsdata.XSDataInputTomography;
import org.edna.tomov1.xsdata.XSDataInteger;
import org.edna.tomov1.xsdata.XSDataResultTomography;

import uk.ac.gda.util.beans.xml.XMLHelpers;

public class TomoView extends ViewPart {

	public TomoView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new GridLayout());

		final Button button = new Button(parent, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			public void mouseUp(final MouseEvent e) {
				
				Runnable ednaTask = new Runnable() {
					
					@Override
					public void run() {
						XSDataInputTomography input = new XSDataInputTomography();
						XSDataInteger xsDataInteger = new XSDataInteger();
						xsDataInteger.setValue(2);
						input.setByteDepthOfImage(xsDataInteger);
						try {
							XSDataResultTomography xsDataResultTomography = TomoLaunchers.LaunchEDPluginTomography(input, null);
						} catch (Exception ee) {
							fail(e.toString());
						}						
					}
				};
				
				Thread ednaRunner = new Thread(ednaTask);
				ednaRunner.start();
				
			}
		});
		
		button.setText("button");
		initializeToolBar();
		// TODO Auto-generated method stub

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	private void initializeToolBar() {
		IToolBarManager toolBarManager = getViewSite().getActionBars().getToolBarManager();
	}

}
