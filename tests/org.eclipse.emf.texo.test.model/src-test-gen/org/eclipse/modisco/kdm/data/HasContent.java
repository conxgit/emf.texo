package org.eclipse.modisco.kdm.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.modisco.kdm.action.AbstractActionRelationship;
import org.eclipse.modisco.kdm.action.ActionElement;

/**
 * A representation of the model object '<em><b>HasContent</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "HasContent")
public class HasContent extends AbstractActionRelationship {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private AbstractDataElement to = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private ActionElement from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public AbstractDataElement getTo() {
    return to;
  }

  /**
   * Sets the '{@link HasContent#getTo() <em>to</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link HasContent#getTo() to}' feature.
   * @generated
   */
  public void setTo(AbstractDataElement newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public ActionElement getFrom() {
    return from;
  }

  /**
   * Sets the '{@link HasContent#getFrom() <em>from</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link HasContent#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(ActionElement newFrom) {
    from = newFrom;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "HasContent ";
  }
}
