/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaC.InputParam#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.smaC.InputParam#getArray <em>Array</em>}</li>
 *   <li>{@link org.xtext.smaC.InputParam#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.xtext.smaC.InputParam#getStorageData <em>Storage Data</em>}</li>
 *   <li>{@link org.xtext.smaC.InputParam#getValueInput <em>Value Input</em>}</li>
 * </ul>
 *
 * @see org.xtext.smaC.SmaCPackage#getInputParam()
 * @model
 * @generated
 */
public interface InputParam extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.smaC.SmaCPackage#getInputParam_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.smaC.InputParam#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(String)
   * @see org.xtext.smaC.SmaCPackage#getInputParam_Array()
   * @model
   * @generated
   */
  String getArray();

  /**
   * Sets the value of the '{@link org.xtext.smaC.InputParam#getArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #getArray()
   * @generated
   */
  void setArray(String value);

  /**
   * Returns the value of the '<em><b>Indexed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indexed</em>' attribute.
   * @see #setIndexed(String)
   * @see org.xtext.smaC.SmaCPackage#getInputParam_Indexed()
   * @model
   * @generated
   */
  String getIndexed();

  /**
   * Sets the value of the '{@link org.xtext.smaC.InputParam#getIndexed <em>Indexed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Indexed</em>' attribute.
   * @see #getIndexed()
   * @generated
   */
  void setIndexed(String value);

  /**
   * Returns the value of the '<em><b>Storage Data</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.smaC.StorageData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Storage Data</em>' attribute.
   * @see org.xtext.smaC.StorageData
   * @see #setStorageData(StorageData)
   * @see org.xtext.smaC.SmaCPackage#getInputParam_StorageData()
   * @model
   * @generated
   */
  StorageData getStorageData();

  /**
   * Sets the value of the '{@link org.xtext.smaC.InputParam#getStorageData <em>Storage Data</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Storage Data</em>' attribute.
   * @see org.xtext.smaC.StorageData
   * @see #getStorageData()
   * @generated
   */
  void setStorageData(StorageData value);

  /**
   * Returns the value of the '<em><b>Value Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Input</em>' attribute.
   * @see #setValueInput(String)
   * @see org.xtext.smaC.SmaCPackage#getInputParam_ValueInput()
   * @model
   * @generated
   */
  String getValueInput();

  /**
   * Sets the value of the '{@link org.xtext.smaC.InputParam#getValueInput <em>Value Input</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Input</em>' attribute.
   * @see #getValueInput()
   * @generated
   */
  void setValueInput(String value);

} // InputParam
