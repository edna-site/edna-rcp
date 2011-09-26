package org.edna.plugingenerator.wizards;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.edna.plugingenerator.Activator;
import org.edna.plugingenerator.generator.WizardHelpers;

public class SelectDataModelPage extends WizardPage {
	protected Text pyFilePath;
	protected Text pluginFileName;
	protected Combo xsDataInput;
	protected Combo xsDataResult;

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
		lblNewLabel.setText("Select which .py file contains the plugins datamodel");

		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setText(".edml File");

		pyFilePath = new Text(composite, SWT.BORDER);
		pyFilePath.setEditable(false);
		pyFilePath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {

				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				dialog.setTitle("Data Model Selection");
				dialog.setMessage("Select the .edml file which contains the datamodel:");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.addFilter(new ViewerFilter() {

					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						try {
							IFile file = (IFile) element;
							if (file.getFileExtension().equals("edml")) {
								return true;
							} else {
								return false;
							}
						} catch (Exception e) {
							return true;
						}

					}
				});
				dialog.setValidator(new ISelectionStatusValidator() {

					@Override
					public IStatus validate(Object[] selection) {
						if (selection.length == 1 && selection[0] instanceof IFile) {
							return new Status(IStatus.OK, Activator.PLUGIN_ID, 0, "", null);
						}

						return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, "Please select an EDML file!", null);
					}
				});

				dialog.open();

				//int result = dialog.open();
				IFile EDMLFile = (IFile)dialog.getResult()[0];
				pyFilePath.setText(EDMLFile.getLocation().toString());
				((NewEDNAPluginWizard)getWizard()).getModel().setUmlFileName(EDMLFile);

				try {
					xsDataInput.setItems(WizardHelpers.getXSDataClassFromEDML(EDMLFile, "XSDataInput"));
					xsDataResult.setItems(WizardHelpers.getXSDataClassFromEDML(EDMLFile, "XSDataResult"));
				} catch (Exception e1) {
					//TODO Flag this to the user
				}

			}
		});
		btnNewButton.setText("Browse...");

		Label lblOrSelectWhich = new Label(composite, SWT.NONE);
		lblOrSelectWhich.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		lblOrSelectWhich.setText("Or select which other plugin you wish to emulate");

		Label lblPluginToEmulate = new Label(composite, SWT.NONE);
		lblPluginToEmulate.setText("Plugin to emulate");

		pluginFileName = new Text(composite, SWT.BORDER);
		pluginFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Button button = new Button(composite, SWT.NONE);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				dialog.setFileName(pluginFileName.getText());
				String result = dialog.open();
				pluginFileName.setText(result);	
			}
		});
		button.setText("Browse...");
		pyFilePath.addModifyListener((NewEDNAPluginWizard) getWizard());

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

	}


	@Override
	public boolean canFlipToNextPage() {
		if (xsDataInput.getText().isEmpty()) return false;
		if (xsDataResult.getText().isEmpty()) return false;
		return true;
	}


}
