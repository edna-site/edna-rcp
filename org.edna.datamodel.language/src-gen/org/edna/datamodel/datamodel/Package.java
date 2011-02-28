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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.Package#getName <em>Name</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.Package#getTypes <em>Types</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.Package#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.edna.datamodel.datamodel.DatamodelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getPackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getPackage_Types()
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
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getPackage_Packages()
   * @model containment="true"
   * @generated
   */
  EList<Package> getPackages();

} // Package
