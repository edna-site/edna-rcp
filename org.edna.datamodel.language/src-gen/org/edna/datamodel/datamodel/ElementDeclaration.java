/**
 * <copyright>
 * </copyright>
 *
 */
package org.edna.datamodel.datamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.edna.datamodel.datamodel.ElementDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ElementDeclaration#getRef <em>Ref</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ElementDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ElementDeclaration#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ElementDeclaration#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.edna.datamodel.datamodel.ElementDeclaration#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration()
 * @model
 * @generated
 */
public interface ElementDeclaration extends EObject
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
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ElementDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ComplexType)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration_Ref()
   * @model
   * @generated
   */
  ComplexType getRef();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ElementDeclaration#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ComplexType value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.edna.datamodel.datamodel.PrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.edna.datamodel.datamodel.PrimitiveType
   * @see #setType(PrimitiveType)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration_Type()
   * @model
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ElementDeclaration#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.edna.datamodel.datamodel.PrimitiveType
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

  /**
   * Returns the value of the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple</em>' attribute.
   * @see #setMultiple(boolean)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration_Multiple()
   * @model
   * @generated
   */
  boolean isMultiple();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ElementDeclaration#isMultiple <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple</em>' attribute.
   * @see #isMultiple()
   * @generated
   */
  void setMultiple(boolean value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ElementDeclaration#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

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
   * @see org.edna.datamodel.datamodel.DatamodelPackage#getElementDeclaration_Doc()
   * @model
   * @generated
   */
  String getDoc();

  /**
   * Sets the value of the '{@link org.edna.datamodel.datamodel.ElementDeclaration#getDoc <em>Doc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc</em>' attribute.
   * @see #getDoc()
   * @generated
   */
  void setDoc(String value);

} // ElementDeclaration
