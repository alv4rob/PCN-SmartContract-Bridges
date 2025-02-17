/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC.tests;

import junit.textui.TestRunner;

import org.xtext.smaC.PropertyCompany;
import org.xtext.smaC.SmaCFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Property Company</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyCompanyTest extends PropertiesTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropertyCompanyTest.class);
	}

	/**
	 * Constructs a new Property Company test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyCompanyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Property Company test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PropertyCompany getFixture() {
		return (PropertyCompany)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmaCFactory.eINSTANCE.createPropertyCompany());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PropertyCompanyTest
