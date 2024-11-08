/**
 */
package pcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PCN Textual Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcn.PCNTextualTag#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see pcn.PcnPackage#getPCNTextualTag()
 * @model
 * @generated
 */
public interface PCNTextualTag extends PCNTag {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see pcn.PcnPackage#getPCNTextualTag_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link pcn.PCNTextualTag#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

} // PCNTextualTag
