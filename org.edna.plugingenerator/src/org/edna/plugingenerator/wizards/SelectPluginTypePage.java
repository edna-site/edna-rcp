package org.edna.plugingenerator.wizards;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.edna.plugingenerator.Activator;


public class SelectPluginTypePage extends WizardPage {
	protected Text templateDirectory;
	protected Combo templateFile;

	public SelectPluginTypePage() {
		super("selectInputOutputClasses");
		setTitle("Select Data Model");
		setDescription("Select the datamodel from which the plugin will be created");
	}


	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout(2, false));

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		lblNewLabel.setText("Select the location of the Template Files");

		templateDirectory = new Text(container, SWT.BORDER);
		templateDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));


		Button browseButton = new Button(container, SWT.NONE);
		browseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {

				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				dialog.setTitle("Tree Selection");
				dialog.setMessage("Select the elements from the tree:");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.addFilter(new ViewerFilter() {
					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if(element instanceof IFile) return false;
						return true;
					}
				});
				dialog.setValidator(new ISelectionStatusValidator() {

					@Override
					public IStatus validate(Object[] selection) {
					    if (selection.length == 1 && selection[0] instanceof IFolder) {
					        return new Status(IStatus.OK, Activator.PLUGIN_ID, 0, "", null);
					      }
					   
					      return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 0, "Please select a folder", null);
					}
				});

				dialog.open();

				IFolder dir = (IFolder) dialog.getResult()[0];
				templateDirectory.setText(dir.getLocation().toString());
				((NewEDNAPluginWizard)getWizard()).getModel().setTemplateDirectory(dir);
				try {
					updateTemplateFiles();
				} catch (CoreException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		browseButton.setText("Browse...");

		Label label = new Label(container, SWT.NONE);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		label.setText("Select Which template you would like to use to generate the plugin");

		templateFile = new Combo(container, SWT.NONE);
		templateFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));


		templateDirectory.addModifyListener((NewEDNAPluginWizard) getWizard());
		templateFile.addModifyListener((NewEDNAPluginWizard) getWizard());

		setupStartValues();
	}

	private void setupStartValues() {
		EDNAPluginGeneratorModel model = ((NewEDNAPluginWizard) getWizard()).getModel();
		if (model.getTemplateDirectory() != null) templateDirectory.setText(model.getTemplateDirectory().getLocation().toString());		
		try {
			updateTemplateFiles();
		} catch (CoreException e) {
			// Ignore this it may not be possible
		}
	}

	@Override
	public boolean canFlipToNextPage() {
		if ((new File(templateDirectory.getText(),templateFile.getText())).isFile()) return true;
		return false;
	}

	protected void updateTemplateFiles() throws CoreException {
		IFolder templateDir = (IFolder) ((NewEDNAPluginWizard)getWizard()).getModel().getTemplateDirectory();
		
		templateFile.removeAll();
		for (IResource resource : templateDir.members()) {
			try {
				if(((IFile)resource).getName().endsWith(".py.template")){
					templateFile.add(((IFile)resource).getName());
				}
			} catch (Exception e) {
				// Do not add this item to the list
			}
			
		}

	}

}
