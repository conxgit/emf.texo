package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.eclipse.modisco.kdm.code.ItemUnit;

/** 
 * A representation of the model object '<em><b>IndexElement</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "IndexElement")
public class IndexElement extends DataResource {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = ItemUnit.class)
  @JoinTable(name = "IndexElement_implementation")
  private Set<ItemUnit> implementation = new HashSet<ItemUnit>();

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<ItemUnit> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * @generated
   */
  public void addToImplementation(ItemUnit implementationValue) {
    if (!implementation.contains(implementationValue)) {

      implementation.add(implementationValue);
    }

  }

  /**			
   * Removes from the <em>implementation</em> feature.
   * @generated
   */
  public void removeFromImplementation(ItemUnit implementationValue) {
    if (implementation.contains(implementationValue)) {
      implementation.remove(implementationValue);
    }
  }

  /**			
   * Clears the <em>implementation</em> feature.
   * @generated
   */
  public void clearImplementation() {
    for (ItemUnit implementationElement : implementation) {
      removeFromImplementation(implementationElement);
    }
  }

  /**
   * Sets the '{@link IndexElement#getImplementation() <em>implementation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link IndexElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<ItemUnit> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "IndexElement ";
  }
}
