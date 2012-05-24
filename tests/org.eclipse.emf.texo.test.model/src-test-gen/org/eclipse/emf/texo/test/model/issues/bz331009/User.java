package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>User</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Пользователь <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "User")
public class User extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Логин <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  private String login = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пароль <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  private String password = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Группа <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private UserGroup group = null;

  /**
   * Returns the value of '<em><b>login</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Логин <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>login</b></em>' feature
   * @generated
   */
  public String getLogin() {
    return login;
  }

  /**
   * Sets the '{@link User#getLogin() <em>login</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Логин <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link User#getLogin() login}' feature.
   * @generated
   */
  public void setLogin(String newLogin) {
    login = newLogin;
  }

  /**
   * Returns the value of '<em><b>password</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пароль <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>password</b></em>' feature
   * @generated
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the '{@link User#getPassword() <em>password</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Пароль <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link User#getPassword() password}' feature.
   * @generated
   */
  public void setPassword(String newPassword) {
    password = newPassword;
  }

  /**
   * Returns the value of '<em><b>group</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Группа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public UserGroup getGroup() {
    return group;
  }

  /**
   * Sets the '{@link User#getGroup() <em>group</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Группа <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link User#getGroup() group}' feature.
   * @generated
   */
  public void setGroup(UserGroup newGroup) {
    group = newGroup;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "User " + " [login: " + getLogin() + "]" + " [password: " + getPassword() + "]";
  }
}
