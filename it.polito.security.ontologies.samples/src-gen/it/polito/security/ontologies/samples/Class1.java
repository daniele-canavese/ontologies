/**
 */
package it.polito.security.ontologies.samples;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polito.security.ontologies.samples.Class1#getSomething <em>Something</em>}</li>
 *   <li>{@link it.polito.security.ontologies.samples.Class1#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see it.polito.security.ontologies.samples.SamplesPackage#getClass1()
 * @model
 * @generated
 */
public interface Class1 extends EObject
{
	/**
	 * Returns the value of the '<em><b>Something</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Something</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Something</em>' attribute.
	 * @see #setSomething(String)
	 * @see it.polito.security.ontologies.samples.SamplesPackage#getClass1_Something()
	 * @model unique="false"
	 * @generated
	 */
	String getSomething();

	/**
	 * Sets the value of the '{@link it.polito.security.ontologies.samples.Class1#getSomething <em>Something</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Something</em>' attribute.
	 * @see #getSomething()
	 * @generated
	 */
	void setSomething(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link it.polito.security.ontologies.samples.Class2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see it.polito.security.ontologies.samples.SamplesPackage#getClass1_Classes()
	 * @model
	 * @generated
	 */
	EList<Class2> getClasses();

} // Class1
