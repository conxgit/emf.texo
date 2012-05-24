package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>PaymentInfo</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Платежная информация <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "PaymentInfo")
public class PaymentInfo extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тариф <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Tariff tariff = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Фактические платежи <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @Access(AccessType.FIELD)
  private List<PaymentItem> factPayments = new ArrayList<PaymentItem>();

  /**
   * Returns the value of '<em><b>tariff</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тариф <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>tariff</b></em>' feature
   * @generated
   */
  public Tariff getTariff() {
    return tariff;
  }

  /**
   * Sets the '{@link PaymentInfo#getTariff() <em>tariff</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тариф <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link PaymentInfo#getTariff() tariff}' feature.
   * @generated
   */
  public void setTariff(Tariff newTariff) {
    tariff = newTariff;
  }

  /**
   * Returns the value of '<em><b>factPayments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Фактические платежи <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>factPayments</b></em>' feature
   * @generated
   */
  public List<PaymentItem> getFactPayments() {
    return factPayments;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PaymentInfo ";
  }
}
