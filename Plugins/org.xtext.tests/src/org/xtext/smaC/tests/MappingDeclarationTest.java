/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC.tests;

import junit.textui.TestRunner;

import org.xtext.smaC.MappingDeclaration;
import org.xtext.smaC.SmaCFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Declaration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingDeclarationTest extends InputParamTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingDeclarationTest.class);
	}

	/**
	 * Constructs a new Mapping Declaration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingDeclarationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mapping Declaration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MappingDeclaration getFixture() {
		return (MappingDeclaration)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmaCFactory.eINSTANCE.createMappingDeclaration());
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

} //MappingDeclarationTest
