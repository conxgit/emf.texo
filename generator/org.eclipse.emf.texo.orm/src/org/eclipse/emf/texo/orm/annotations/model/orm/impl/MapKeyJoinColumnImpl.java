/**
 * <copyright>
 * </copyright>
 *
 * $Id: MapKeyJoinColumnImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Map Key Join Column</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#getColumnDefinition <em>Column Definition</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#isInsertable <em>Insertable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#getReferencedColumnName <em>Referenced Column Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl#isUpdatable <em>Updatable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapKeyJoinColumnImpl extends BaseOrmAnnotationImpl implements MapKeyJoinColumn {
  /**
   * The default value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumnDefinition()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_DEFINITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumnDefinition() <em>Column Definition</em>}' attribute.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @see #getColumnDefinition()
   * @generated
   * @ordered
   */
  protected String columnDefinition = COLUMN_DEFINITION_EDEFAULT;

  /**
   * The default value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isInsertable()
   * @generated
   * @ordered
   */
  protected static final boolean INSERTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInsertable() <em>Insertable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isInsertable()
   * @generated
   * @ordered
   */
  protected boolean insertable = INSERTABLE_EDEFAULT;

  /**
   * This is true if the Insertable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean insertableESet;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected static final boolean NULLABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isNullable()
   * @generated
   * @ordered
   */
  protected boolean nullable = NULLABLE_EDEFAULT;

  /**
   * This is true if the Nullable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean nullableESet;

  /**
   * The default value of the '{@link #getReferencedColumnName() <em>Referenced Column Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getReferencedColumnName()
   * @generated
   * @ordered
   */
  protected static final String REFERENCED_COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferencedColumnName() <em>Referenced Column Name</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getReferencedColumnName()
   * @generated
   * @ordered
   */
  protected String referencedColumnName = REFERENCED_COLUMN_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTable() <em>Table</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected static final String TABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected String table = TABLE_EDEFAULT;

  /**
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected boolean unique = UNIQUE_EDEFAULT;

  /**
   * This is true if the Unique attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean uniqueESet;

  /**
   * The default value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUpdatable()
   * @generated
   * @ordered
   */
  protected static final boolean UPDATABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUpdatable() <em>Updatable</em>}' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see #isUpdatable()
   * @generated
   * @ordered
   */
  protected boolean updatable = UPDATABLE_EDEFAULT;

  /**
   * This is true if the Updatable attribute has been set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean updatableESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  protected MapKeyJoinColumnImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getMapKeyJoinColumn();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getColumnDefinition() {
    return columnDefinition;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setColumnDefinition(String newColumnDefinition) {
    String oldColumnDefinition = columnDefinition;
    columnDefinition = newColumnDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION, oldColumnDefinition, columnDefinition));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isInsertable() {
    return insertable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setInsertable(boolean newInsertable) {
    boolean oldInsertable = insertable;
    insertable = newInsertable;
    boolean oldInsertableESet = insertableESet;
    insertableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE, oldInsertable, insertable, !oldInsertableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetInsertable() {
    boolean oldInsertable = insertable;
    boolean oldInsertableESet = insertableESet;
    insertable = INSERTABLE_EDEFAULT;
    insertableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE, oldInsertable, INSERTABLE_EDEFAULT, oldInsertableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetInsertable() {
    return insertableESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isNullable() {
    return nullable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setNullable(boolean newNullable) {
    boolean oldNullable = nullable;
    nullable = newNullable;
    boolean oldNullableESet = nullableESet;
    nullableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE, oldNullable, nullable, !oldNullableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetNullable() {
    boolean oldNullable = nullable;
    boolean oldNullableESet = nullableESet;
    nullable = NULLABLE_EDEFAULT;
    nullableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE, oldNullable, NULLABLE_EDEFAULT, oldNullableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetNullable() {
    return nullableESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getReferencedColumnName() {
    return referencedColumnName;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setReferencedColumnName(String newReferencedColumnName) {
    String oldReferencedColumnName = referencedColumnName;
    referencedColumnName = newReferencedColumnName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME, oldReferencedColumnName, referencedColumnName));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public String getTable() {
    return table;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setTable(String newTable) {
    String oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnique() {
    return unique;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(boolean newUnique) {
    boolean oldUnique = unique;
    unique = newUnique;
    boolean oldUniqueESet = uniqueESet;
    uniqueESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE, oldUnique, unique, !oldUniqueESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetUnique() {
    boolean oldUnique = unique;
    boolean oldUniqueESet = uniqueESet;
    unique = UNIQUE_EDEFAULT;
    uniqueESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE, oldUnique, UNIQUE_EDEFAULT, oldUniqueESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetUnique() {
    return uniqueESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isUpdatable() {
    return updatable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void setUpdatable(boolean newUpdatable) {
    boolean oldUpdatable = updatable;
    updatable = newUpdatable;
    boolean oldUpdatableESet = updatableESet;
    updatableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE, oldUpdatable, updatable, !oldUpdatableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public void unsetUpdatable() {
    boolean oldUpdatable = updatable;
    boolean oldUpdatableESet = updatableESet;
    updatable = UPDATABLE_EDEFAULT;
    updatableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE, oldUpdatable, UPDATABLE_EDEFAULT, oldUpdatableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetUpdatable() {
    return updatableESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OrmPackage.MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION:
        return getColumnDefinition();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE:
        return isInsertable();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NAME:
        return getName();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE:
        return isNullable();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME:
        return getReferencedColumnName();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__TABLE:
        return getTable();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE:
        return isUnique();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE:
        return isUpdatable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OrmPackage.MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION:
        setColumnDefinition((String)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE:
        setInsertable((Boolean)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NAME:
        setName((String)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE:
        setNullable((Boolean)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME:
        setReferencedColumnName((String)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__TABLE:
        setTable((String)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE:
        setUnique((Boolean)newValue);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE:
        setUpdatable((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OrmPackage.MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION:
        setColumnDefinition(COLUMN_DEFINITION_EDEFAULT);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE:
        unsetInsertable();
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE:
        unsetNullable();
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME:
        setReferencedColumnName(REFERENCED_COLUMN_NAME_EDEFAULT);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE:
        unsetUnique();
        return;
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE:
        unsetUpdatable();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OrmPackage.MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION:
        return COLUMN_DEFINITION_EDEFAULT == null ? columnDefinition != null : !COLUMN_DEFINITION_EDEFAULT.equals(columnDefinition);
      case OrmPackage.MAP_KEY_JOIN_COLUMN__INSERTABLE:
        return isSetInsertable();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OrmPackage.MAP_KEY_JOIN_COLUMN__NULLABLE:
        return isSetNullable();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME:
        return REFERENCED_COLUMN_NAME_EDEFAULT == null ? referencedColumnName != null : !REFERENCED_COLUMN_NAME_EDEFAULT.equals(referencedColumnName);
      case OrmPackage.MAP_KEY_JOIN_COLUMN__TABLE:
        return TABLE_EDEFAULT == null ? table != null : !TABLE_EDEFAULT.equals(table);
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UNIQUE:
        return isSetUnique();
      case OrmPackage.MAP_KEY_JOIN_COLUMN__UPDATABLE:
        return isSetUpdatable();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (columnDefinition: "); //$NON-NLS-1$
    result.append(columnDefinition);
    result.append(", insertable: "); //$NON-NLS-1$
    if (insertableESet) result.append(insertable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", name: "); //$NON-NLS-1$
    result.append(name);
    result.append(", nullable: "); //$NON-NLS-1$
    if (nullableESet) result.append(nullable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", referencedColumnName: "); //$NON-NLS-1$
    result.append(referencedColumnName);
    result.append(", table: "); //$NON-NLS-1$
    result.append(table);
    result.append(", unique: "); //$NON-NLS-1$
    if (uniqueESet) result.append(unique); else result.append("<unset>"); //$NON-NLS-1$
    result.append(", updatable: "); //$NON-NLS-1$
    if (updatableESet) result.append(updatable); else result.append("<unset>"); //$NON-NLS-1$
    result.append(')');
    return result.toString();
  }

} // MapKeyJoinColumnImpl
