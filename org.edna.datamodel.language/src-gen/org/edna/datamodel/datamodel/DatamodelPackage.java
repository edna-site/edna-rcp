/**
 * <copyright>
 * </copyright>
 *
 */
package org.edna.datamodel.datamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.edna.datamodel.datamodel.DatamodelFactory
 * @model kind="package"
 * @generated
 */
public interface DatamodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "datamodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edna.org/datamodel/Datamodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "datamodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DatamodelPackage eINSTANCE = org.edna.datamodel.datamodel.impl.DatamodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.edna.datamodel.datamodel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.edna.datamodel.datamodel.impl.ModelImpl
   * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TARGET_NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 2;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.edna.datamodel.datamodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.edna.datamodel.datamodel.impl.ImportImpl
   * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.edna.datamodel.datamodel.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.edna.datamodel.datamodel.impl.PackageImpl
   * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__TYPES = 1;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PACKAGES = 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.edna.datamodel.datamodel.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.edna.datamodel.datamodel.impl.ComplexTypeImpl
   * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getComplexType()
   * @generated
   */
  int COMPLEX_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__BASE_TYPE = 1;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__DOC = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE__ELEMENTS = 3;

  /**
   * The number of structural features of the '<em>Complex Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl <em>Element Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.edna.datamodel.datamodel.impl.ElementDeclarationImpl
   * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getElementDeclaration()
   * @generated
   */
  int ELEMENT_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION__REF = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Multiple</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION__MULTIPLE = 3;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION__OPTIONAL = 4;

  /**
   * The feature id for the '<em><b>Doc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION__DOC = 5;

  /**
   * The number of structural features of the '<em>Element Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.edna.datamodel.datamodel.PrimitiveType <em>Primitive Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.edna.datamodel.datamodel.PrimitiveType
   * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 5;


  /**
   * Returns the meta object for class '{@link org.edna.datamodel.datamodel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.edna.datamodel.datamodel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.Model#getTargetNamespace <em>Target Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Namespace</em>'.
   * @see org.edna.datamodel.datamodel.Model#getTargetNamespace()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_TargetNamespace();

  /**
   * Returns the meta object for the containment reference list '{@link org.edna.datamodel.datamodel.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.edna.datamodel.datamodel.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.edna.datamodel.datamodel.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.edna.datamodel.datamodel.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.edna.datamodel.datamodel.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see org.edna.datamodel.datamodel.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link org.edna.datamodel.datamodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.edna.datamodel.datamodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.edna.datamodel.datamodel.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.edna.datamodel.datamodel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.edna.datamodel.datamodel.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.edna.datamodel.datamodel.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.edna.datamodel.datamodel.Package#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.edna.datamodel.datamodel.Package#getTypes()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.edna.datamodel.datamodel.Package#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see org.edna.datamodel.datamodel.Package#getPackages()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Packages();

  /**
   * Returns the meta object for class '{@link org.edna.datamodel.datamodel.ComplexType <em>Complex Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type</em>'.
   * @see org.edna.datamodel.datamodel.ComplexType
   * @generated
   */
  EClass getComplexType();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ComplexType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.edna.datamodel.datamodel.ComplexType#getName()
   * @see #getComplexType()
   * @generated
   */
  EAttribute getComplexType_Name();

  /**
   * Returns the meta object for the reference '{@link org.edna.datamodel.datamodel.ComplexType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Base Type</em>'.
   * @see org.edna.datamodel.datamodel.ComplexType#getBaseType()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_BaseType();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ComplexType#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.edna.datamodel.datamodel.ComplexType#getDoc()
   * @see #getComplexType()
   * @generated
   */
  EAttribute getComplexType_Doc();

  /**
   * Returns the meta object for the containment reference list '{@link org.edna.datamodel.datamodel.ComplexType#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.edna.datamodel.datamodel.ComplexType#getElements()
   * @see #getComplexType()
   * @generated
   */
  EReference getComplexType_Elements();

  /**
   * Returns the meta object for class '{@link org.edna.datamodel.datamodel.ElementDeclaration <em>Element Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Declaration</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration
   * @generated
   */
  EClass getElementDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ElementDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration#getName()
   * @see #getElementDeclaration()
   * @generated
   */
  EAttribute getElementDeclaration_Name();

  /**
   * Returns the meta object for the reference '{@link org.edna.datamodel.datamodel.ElementDeclaration#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration#getRef()
   * @see #getElementDeclaration()
   * @generated
   */
  EReference getElementDeclaration_Ref();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ElementDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration#getType()
   * @see #getElementDeclaration()
   * @generated
   */
  EAttribute getElementDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ElementDeclaration#isMultiple <em>Multiple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiple</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration#isMultiple()
   * @see #getElementDeclaration()
   * @generated
   */
  EAttribute getElementDeclaration_Multiple();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ElementDeclaration#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration#isOptional()
   * @see #getElementDeclaration()
   * @generated
   */
  EAttribute getElementDeclaration_Optional();

  /**
   * Returns the meta object for the attribute '{@link org.edna.datamodel.datamodel.ElementDeclaration#getDoc <em>Doc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc</em>'.
   * @see org.edna.datamodel.datamodel.ElementDeclaration#getDoc()
   * @see #getElementDeclaration()
   * @generated
   */
  EAttribute getElementDeclaration_Doc();

  /**
   * Returns the meta object for enum '{@link org.edna.datamodel.datamodel.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Type</em>'.
   * @see org.edna.datamodel.datamodel.PrimitiveType
   * @generated
   */
  EEnum getPrimitiveType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DatamodelFactory getDatamodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.edna.datamodel.datamodel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.edna.datamodel.datamodel.impl.ModelImpl
     * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__TARGET_NAMESPACE = eINSTANCE.getModel_TargetNamespace();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '{@link org.edna.datamodel.datamodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.edna.datamodel.datamodel.impl.ImportImpl
     * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.edna.datamodel.datamodel.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.edna.datamodel.datamodel.impl.PackageImpl
     * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__TYPES = eINSTANCE.getPackage_Types();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PACKAGES = eINSTANCE.getPackage_Packages();

    /**
     * The meta object literal for the '{@link org.edna.datamodel.datamodel.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.edna.datamodel.datamodel.impl.ComplexTypeImpl
     * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getComplexType()
     * @generated
     */
    EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_TYPE__NAME = eINSTANCE.getComplexType_Name();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__BASE_TYPE = eINSTANCE.getComplexType_BaseType();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPLEX_TYPE__DOC = eINSTANCE.getComplexType_Doc();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE__ELEMENTS = eINSTANCE.getComplexType_Elements();

    /**
     * The meta object literal for the '{@link org.edna.datamodel.datamodel.impl.ElementDeclarationImpl <em>Element Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.edna.datamodel.datamodel.impl.ElementDeclarationImpl
     * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getElementDeclaration()
     * @generated
     */
    EClass ELEMENT_DECLARATION = eINSTANCE.getElementDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DECLARATION__NAME = eINSTANCE.getElementDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_DECLARATION__REF = eINSTANCE.getElementDeclaration_Ref();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DECLARATION__TYPE = eINSTANCE.getElementDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DECLARATION__MULTIPLE = eINSTANCE.getElementDeclaration_Multiple();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DECLARATION__OPTIONAL = eINSTANCE.getElementDeclaration_Optional();

    /**
     * The meta object literal for the '<em><b>Doc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_DECLARATION__DOC = eINSTANCE.getElementDeclaration_Doc();

    /**
     * The meta object literal for the '{@link org.edna.datamodel.datamodel.PrimitiveType <em>Primitive Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.edna.datamodel.datamodel.PrimitiveType
     * @see org.edna.datamodel.datamodel.impl.DatamodelPackageImpl#getPrimitiveType()
     * @generated
     */
    EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

  }

} //DatamodelPackage
