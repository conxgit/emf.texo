package org.eclipse.modisco.kdm.action.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.action.ActionModelPackage;
import org.eclipse.modisco.kdm.action.Reads;

/**
 * The Dao implementation for the model object '<em><b>Reads</b></em>'.
 * 
 * @generated
 */
public class ReadsDao extends BaseDao<Reads> {

  /**
   * @generated
   */
  @Override
  public Class<Reads> getEntityClass() {
    return Reads.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return ActionModelPackage.INSTANCE.getReadsEClass();
  }
}
