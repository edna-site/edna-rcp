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
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.ComplexType#getName <em>Name</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ComplexType#getBaseType <em>Base Type</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ComplexType#getDoc <em>Doc</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ComplexType#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.edna.datamodel.datamodel.DatamodelPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends EObject
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
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getComplexType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ComplexType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' reference.
   * @see #setBaseType(ComplexType)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getComplexType_BaseType()
   * @model
   * @generated
   */
  ComplexType getBaseType();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ComplexType#getBaseType <em>Base Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(ComplexType value);

  /**
   * Returns the value of the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc</em>' attribute.
   * @see #setDoc(String)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getComplexType_Doc()
   * @model
   * @generated
   */
  String getDoc();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ComplexType#getDoc <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' attribute.
   * @see #getDoc()
   * @generated
   */
  void setDoc(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.edna.datamodel.datamodel.ElementDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getComplexType_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ElementDeclaration> getElements();

} // ComplexType
