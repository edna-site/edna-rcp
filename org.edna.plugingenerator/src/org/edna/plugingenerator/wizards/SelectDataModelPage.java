package org.edna.plugingenerator.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.edna.plugingenerator.generator.WizardHelpers;

public class SelectDataModelPage extends WizardPage {
	protected Text pyFilePath;
	protected Text pluginFileName;
	protected Combo xsDataInput;
	protected Combo xsDataResult;
	private Button copyPluginButton;
	private Button newVersionButton;
	private Button repliceteInterfaceButton;

	public SelectDataModelPage() {
		super("selectDataModel");
		setTitle("Select Data Model");
		setDescription("Select the datamodel from which the plugin will be created");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(container, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite.setLayout(new GridLayout(3, false));

		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		lblNewLabel.setText("Select which .edml file contains the plugins datamodel");

		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setText(".edml File");

		pyFilePath = new Text(composite, SWT.BORDER);
		pyFilePath.setEditable(false);
		pyFilePath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		
		Button edmlFileSelectButton = new Button(composite, SWT.NONE);
		edmlFileSelectButton.addSelectionListener( new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				IFile EDMLFile = WizardHelpers.getFilename(getShell(), "Data Model Selection", "Select the .edml file which contains the datamodel:", "edml");
				pyFilePath.setText(EDMLFile.getLocation().toString());
				((NewEDNAPluginWizard)getWizard()).getModel().setUmlFileName(EDMLFile);
				populatePullDowns();				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		
		edmlFileSelectButton.setText("Browse...");

		Label lblOrSelectWhich = new Label(composite, SWT.NONE);
		lblOrSelectWhich.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		lblOrSelectWhich.setText("Or select which other plugin you wish to upgrade or copy");

		Label lblPluginToEmulate = new Label(composite, SWT.NONE);
		lblPluginToEmulate.setText("Plugin to copy/upgrade");

		pluginFileName = new Text(composite, SWT.BORDER);
		pluginFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		pluginFileName.setEditable(false);
		
		Button pythonFileSelectionButton = new Button(composite, SWT.NONE);
		pythonFileSelectionButton.addSelectionListener( new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				IFile pyFile = WizardHelpers.getFilename(getShell(), "File duplication selection", "Select the .py file which you wish to emulate:", "py");
				pluginFileName.setText(pyFile.getLocation().toString());
				((NewEDNAPluginWizard)getWizard()).setupFromFile(pyFile);
				pyFilePath.setText(((NewEDNAPluginWizard)getWizard()).getModel().getUmlFileName().getLocation().toString());
				populatePullDowns();				
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		pythonFileSelectionButton.setText("Browse...");

		// Add in a section to deal with choosing the type of file copying to do
		Composite fileChoiceComposite = new Composite(composite, SWT.NULL);
		fileChoiceComposite.setLayout(new RowLayout());
		
	    repliceteInterfaceButton = new Button(fileChoiceComposite, SWT.RADIO);
	    repliceteInterfaceButton.setText("Replicete Interface");
	    repliceteInterfaceButton.setSelection(true);
	    repliceteInterfaceButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				((NewEDNAPluginWizard)getWizard()).getModel().setPluginCopyMode(EDNAPluginGeneratorModel.REPLICATE);
				getWizard().getContainer().updateButtons();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	    copyPluginButton = new Button(fileChoiceComposite, SWT.RADIO);
	    copyPluginButton.setText("Copy Plugin");
	    copyPluginButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				((NewEDNAPluginWizard)getWizard()).getModel().setName("");
				((NewEDNAPluginWizard)getWizard()).getModel().setPluginCopyMode(EDNAPluginGeneratorModel.COPY);
				getWizard().getContainer().updateButtons();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
	    newVersionButton = new Button(fileChoiceComposite, SWT.RADIO);
	    newVersionButton.setText("New Version");
	    newVersionButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				((NewEDNAPluginWizard)getWizard()).getModel().setVersion("");
				((NewEDNAPluginWizard)getWizard()).getModel().setPluginCopyMode(EDNAPluginGeneratorModel.NEW_VERSION);
				getWizard().getContainer().updateButtons();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Composite composite_1 = new Composite(container, SWT.BORDER);
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		composite_1.setLayout(new GridLayout(2, false));

		Label label = new Label(composite_1, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		label.setText("Select which class should provided the plugins result");

		Label XSDataInputlabel = new Label(composite_1, SWT.NONE);
		XSDataInputlabel.setText("XSDataInput");

		xsDataInput = new Combo(composite_1, SWT.READ_ONLY);
		xsDataInput.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label XSDataResultIntrolabel = new Label(composite_1, SWT.NONE);
		XSDataResultIntrolabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		XSDataResultIntrolabel.setText("Select which class should provided the plugins result");

		Label XSDataResultlabel = new Label(composite_1, SWT.NONE);
		XSDataResultlabel.setText("XSDataresult");

		xsDataResult = new Combo(composite_1, SWT.READ_ONLY);
		xsDataResult.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		xsDataResult.addModifyListener((NewEDNAPluginWizard) getWizard());
		xsDataInput.addModifyListener((NewEDNAPluginWizard) getWizard());

		
		// Populate this if there has been some infomation provided
		EDNAPluginGeneratorModel model = ((NewEDNAPluginWizard) getWizard()).getModel();
		
		if(model.getEmulatedFile() != null) {
			pluginFileName.setText(model.getEmulatedFile().toString().replaceFirst("L", ""));
		}
		
		if(model.getUmlFileName() != null) {
			pyFilePath.setText(model.getUmlFileName().toString().replaceFirst("L", ""));
			populatePullDowns();
		}
	
	}
	
	private void populatePullDowns(){
		try {
			EDNAPluginGeneratorModel model = ((NewEDNAPluginWizard)getWizard()).getModel();
			IFile EDMLFile = model.getUmlFileName();
			xsDataInput.setItems(WizardHelpers.getXSDataClassFromEDML(EDMLFile, "XSDataInput"));
			xsDataResult.setItems(WizardHelpers.getXSDataClassFromEDML(EDMLFile, "XSDataResult"));
			
			if(model.getXsDataInput() != null) {
				for ( int i = 0; i < xsDataInput.getItemCount(); i++) {
					String value = xsDataInput.getItem(i);
					if(value.contains(model.getXsDataInput())) {
						xsDataInput.select(i);
						break;
					}
				}
			}
			if(model.getXsDataResult() != null) {
				for ( int i = 0; i < xsDataResult.getItemCount(); i++) {
					String value = xsDataResult.getItem(i);
					if(value.contains(model.getXsDataResult())) {
						xsDataResult.select(i);
						break;
					}
				}
			}
			
		} catch (Exception e1) {
			new ErrorDialog(getShell(), "Failed to populate the XSData secector lists", 
					"The selection population has failed because of the following error \n" + e1.getLocalizedMessage(), 
					Status.CANCEL_STATUS, 0);
		}

	}
	
	@Override
	public IWizardPage getNextPage() {		
		if(this.copyPluginButton.getSelection()) {
			((NewEDNAPluginWizard) getWizard()).getPluginBrandingPage().setupStartValues();
			return ((NewEDNAPluginWizard) getWizard()).getPluginBrandingPage();
		}
		return super.getNextPage();
	}

	@Override
	public boolean canFlipToNextPage() {
		if(repliceteInterfaceButton.getSelection()) {
			if (xsDataInput.getText().isEmpty()) return false;
			if (xsDataResult.getText().isEmpty()) return false;
			return true;
		}
		if (((NewEDNAPluginWizard) getWizard()).getModel().getEmulatedFile().exists()) return true;
		return false;
	}

}
