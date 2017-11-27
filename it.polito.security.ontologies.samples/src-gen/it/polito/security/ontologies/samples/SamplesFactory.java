/**
 */
package it.polito.security.ontologies.samples;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.polito.security.ontologies.samples.SamplesPackage
 * @generated
 */
public interface SamplesFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SamplesFactory eINSTANCE = it.polito.security.ontologies.samples.impl.SamplesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Class1 createClass1();

	/**
	 * Returns a new object of class '<em>Class2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class2</em>'.
	 * @generated
	 */
	Class2 createClass2();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SamplesPackage getSamplesPackage();

} //SamplesFactory
