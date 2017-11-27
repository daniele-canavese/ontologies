/**
 */
package it.polito.security.ontologies.samples.impl;

import it.polito.security.ontologies.samples.Class1;
import it.polito.security.ontologies.samples.Class2;
import it.polito.security.ontologies.samples.SamplesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polito.security.ontologies.samples.impl.Class1Impl#getSomething <em>Something</em>}</li>
 *   <li>{@link it.polito.security.ontologies.samples.impl.Class1Impl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Class1Impl extends MinimalEObjectImpl.Container implements Class1
{
	/**
	 * The default value of the '{@link #getSomething() <em>Something</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomething()
	 * @generated
	 * @ordered
	 */
	protected static final String SOMETHING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSomething() <em>Something</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSomething()
	 * @generated
	 * @ordered
	 */
	protected String something = SOMETHING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Class2> classes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class1Impl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return SamplesPackage.Literals.CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSomething()
	{
		return something;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomething(String newSomething)
	{
		String oldSomething = something;
		something = newSomething;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SamplesPackage.CLASS1__SOMETHING, oldSomething, something));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Class2> getClasses()
	{
		if (classes == null)
		{
			classes = new EObjectResolvingEList<Class2>(Class2.class, this, SamplesPackage.CLASS1__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case SamplesPackage.CLASS1__SOMETHING:
				return getSomething();
			case SamplesPackage.CLASS1__CLASSES:
				return getClasses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case SamplesPackage.CLASS1__SOMETHING:
				setSomething((String)newValue);
				return;
			case SamplesPackage.CLASS1__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends Class2>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case SamplesPackage.CLASS1__SOMETHING:
				setSomething(SOMETHING_EDEFAULT);
				return;
			case SamplesPackage.CLASS1__CLASSES:
				getClasses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case SamplesPackage.CLASS1__SOMETHING:
				return SOMETHING_EDEFAULT == null ? something != null : !SOMETHING_EDEFAULT.equals(something);
			case SamplesPackage.CLASS1__CLASSES:
				return classes != null && !classes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (something: ");
		result.append(something);
		result.append(')');
		return result.toString();
	}

} //Class1Impl
