/**
 */
package it.polito.security.ontologies.samples.impl;

import it.polito.security.ontologies.samples.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SamplesFactoryImpl extends EFactoryImpl implements SamplesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SamplesFactory init()
	{
		try
		{
			SamplesFactory theSamplesFactory = (SamplesFactory)EPackage.Registry.INSTANCE.getEFactory(SamplesPackage.eNS_URI);
			if (theSamplesFactory != null)
			{
				return theSamplesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SamplesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplesFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case SamplesPackage.CLASS1: return createClass1();
			case SamplesPackage.CLASS2: return createClass2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class1 createClass1()
	{
		Class1Impl class1 = new Class1Impl();
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2 createClass2()
	{
		Class2Impl class2 = new Class2Impl();
		return class2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplesPackage getSamplesPackage()
	{
		return (SamplesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SamplesPackage getPackage()
	{
		return SamplesPackage.eINSTANCE;
	}

} //SamplesFactoryImpl
