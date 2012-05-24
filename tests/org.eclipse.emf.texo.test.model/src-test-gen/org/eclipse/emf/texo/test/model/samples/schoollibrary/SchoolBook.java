package org.eclipse.emf.texo.test.model.samples.schoollibrary;

import javax.persistence.Basic;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.model.samples.library.Book;

/**
 * A representation of the model object '<em><b>SchoolBook</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "SchoolBook")
public class SchoolBook extends Book {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private float value = 0.0f;

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public float getValue() {
    return value;
  }

  /**
   * Sets the '{@link SchoolBook#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SchoolBook#getValue() value}' feature.
   * @generated
   */
  public void setValue(float newValue) {
    value = newValue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SchoolBook " + " [value: " + getValue() + "]";
  }
}
