/**
 * <copyright>
 * </copyright>
 *
 */
package org.edna.datamodel.datamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.Model#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.Model#getTypes <em>Types</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.Model#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.edna.datamodel.datamodel.DatamodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Namespace</em>' attribute.
   * @see #setTargetNamespace(String)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getModel_TargetNamespace()
   * @model
   * @generated
   */
  String getTargetNamespace();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.Model#getTargetNamespace <em>Target Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Namespace</em>' attribute.
   * @see #getTargetNamespace()
   * @generated
   */
  void setTargetNamespace(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.edna.datamodel.datamodel.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.edna.datamodel.datamodel.ComplexType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<ComplexType> getTypes();

  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.edna.datamodel.datamodel.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<org.edna.datamodel.datamodel.Package> getPackages();

} // Model
