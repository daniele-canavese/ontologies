/**
 */
package it.polito.security.ontologies.samples;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.polito.security.ontologies.samples.SamplesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='it.polito.security.ontologies'"
 * @generated
 */
public interface SamplesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "samples";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "it.polito.security.ontologies.samples";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "samples";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamplesPackage eINSTANCE = it.polito.security.ontologies.samples.impl.SamplesPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.polito.security.ontologies.samples.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polito.security.ontologies.samples.impl.Class1Impl
	 * @see it.polito.security.ontologies.samples.impl.SamplesPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 0;

	/**
	 * The feature id for the '<em><b>Something</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1__SOMETHING = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1__CLASSES = 1;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.polito.security.ontologies.samples.impl.Class2Impl <em>Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polito.security.ontologies.samples.impl.Class2Impl
	 * @see it.polito.security.ontologies.samples.impl.SamplesPackageImpl#getClass2()
	 * @generated
	 */
	int CLASS2 = 1;

	/**
	 * The number of structural features of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link it.polito.security.ontologies.samples.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see it.polito.security.ontologies.samples.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for the attribute '{@link it.polito.security.ontologies.samples.Class1#getSomething <em>Something</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Something</em>'.
	 * @see it.polito.security.ontologies.samples.Class1#getSomething()
	 * @see #getClass1()
	 * @generated
	 */
	EAttribute getClass1_Something();

	/**
	 * Returns the meta object for the reference list '{@link it.polito.security.ontologies.samples.Class1#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see it.polito.security.ontologies.samples.Class1#getClasses()
	 * @see #getClass1()
	 * @generated
	 */
	EReference getClass1_Classes();

	/**
	 * Returns the meta object for class '{@link it.polito.security.ontologies.samples.Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2</em>'.
	 * @see it.polito.security.ontologies.samples.Class2
	 * @generated
	 */
	EClass getClass2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SamplesFactory getSamplesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link it.polito.security.ontologies.samples.impl.Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polito.security.ontologies.samples.impl.Class1Impl
		 * @see it.polito.security.ontologies.samples.impl.SamplesPackageImpl#getClass1()
		 * @generated
		 */
		EClass CLASS1 = eINSTANCE.getClass1();

		/**
		 * The meta object literal for the '<em><b>Something</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS1__SOMETHING = eINSTANCE.getClass1_Something();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS1__CLASSES = eINSTANCE.getClass1_Classes();

		/**
		 * The meta object literal for the '{@link it.polito.security.ontologies.samples.impl.Class2Impl <em>Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polito.security.ontologies.samples.impl.Class2Impl
		 * @see it.polito.security.ontologies.samples.impl.SamplesPackageImpl#getClass2()
		 * @generated
		 */
		EClass CLASS2 = eINSTANCE.getClass2();

	}

} //SamplesPackage
