package org.eclipse.modisco.kdm.core;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.kdm.KDMModel;

/**
 * A representation of the model object '<em><b>KDMEntity</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> A KDM entity is a named model element that represents an artifact of existing software systems.
 * In the meta-model, KDMEntity is a subclass of ModelElement. Each KDM package defines specific KDM entities that are
 * direct or indirect subclasses of KDMEntity. A KDMEntity can be either an atomic element, a container for some
 * KDMEntities, or a group of some KDMEntities. Container and group introduce implicit relationships between entities
 * and are used to represent hierarchies of entities. A container is a KDMEntity that owns other entities. A group is a
 * KDMEntity with which other entities are associated. A KDMEntity can be owned by at most one container, and can be
 * associated with zero or many groups. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "KDMEntity")
public abstract class KDMEntity extends ModelElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An identifier for the KDM entity. <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the KDM model that owns the current KDM
   * Entity <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = KDMModel.class)
  @JoinColumns({ @JoinColumn() })
  private KDMModel model = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> KDM entity that owns the current element.
   * This property determines a meta-level interface to KDM entities. This property is a derived union. Some KDM
   * entities define a concrete set of owned elements that are subtypes of KDMEntity. In KDM this is represented by the
   * CMOF “derived union” mechanism. Concrete properties subset the “union” properties of the parent classes, defined in
   * the Core package. The owner of a KDM entity is defined as the container for which the given entity is an owned
   * entity. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = KDMEntity.class)
  @JoinColumns({ @JoinColumn() })
  private KDMEntity owner = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of KDM entities that are owned by
   * the current KDM Entity. Only KDM containers can own other entities. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = KDMEntity.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<KDMEntity> ownedElement = new ArrayList<KDMEntity>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of relationships such that the
   * current KDMEntity is the from-endpoint of these relationships. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = KDMRelationship.class)
  @OrderColumn()
  @JoinTable(name = "KDMEntity_outbound")
  private List<KDMRelationship> outbound = new ArrayList<KDMRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of relationships such that the
   * current KDMEntity is the to-endpoint of these relations. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = KDMRelationship.class)
  @OrderColumn()
  @JoinTable(name = "KDMEntity_inbound")
  private List<KDMRelationship> inbound = new ArrayList<KDMRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of relationships such that the
   * current KDMEntity owns these relationships. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = KDMRelationship.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<KDMRelationship> ownedRelation = new ArrayList<KDMRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Set of KDM entities with which the current
   * element is associated. This property determines a meta-level interface to KDM entities. This property is a derived
   * union. Some KDM entities define a concrete set of grouped elements that are the subtypes of KDMEntity. In KDM this
   * is represented by the CMOF “derived union” mechanism. Concrete properties subset the “union” properties of the
   * parent classes, defined in the Core package. The group of a KDM entity is defined as the group for which the given
   * entity is a grouped entity. Each KDM entity can be associated with multiple groups. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = KDMEntity.class)
  @OrderColumn()
  @JoinTable(name = "KDMEntity_group")
  private List<KDMEntity> group = new ArrayList<KDMEntity>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of KDM entities that are “grouped”
   * by the current KDM entity. Only KDM groups can have group associations to other entities. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = KDMEntity.class)
  @OrderColumn()
  @JoinTable(name = "KDMEntity_groupedElement")
  private List<KDMEntity> groupedElement = new ArrayList<KDMEntity>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of AggregatedRelationship for which
   * the target is the current KDM Entity. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = AggregatedRelationship.class)
  @OrderColumn()
  @JoinTable(name = "KDMEntity_inAggregated")
  private List<AggregatedRelationship> inAggregated = new ArrayList<AggregatedRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of AggregatedRelationship for which
   * the origin is the current KDM Entity. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = AggregatedRelationship.class)
  @OrderColumn()
  @JoinTable(name = "KDMEntity_outAggregated")
  private List<AggregatedRelationship> outAggregated = new ArrayList<AggregatedRelationship>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An identifier for the KDM entity. <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link KDMEntity#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> An identifier for the KDM entity. <!--
   * end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link KDMEntity#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>model</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the KDM model that owns the current KDM
   * Entity <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>model</b></em>' feature
   * @generated
   */
  public KDMModel getModel() {
    return model;
  }

  /**
   * Returns the value of '<em><b>owner</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> KDM entity that owns the current element.
   * This property determines a meta-level interface to KDM entities. This property is a derived union. Some KDM
   * entities define a concrete set of owned elements that are subtypes of KDMEntity. In KDM this is represented by the
   * CMOF “derived union” mechanism. Concrete properties subset the “union” properties of the parent classes, defined in
   * the Core package. The owner of a KDM entity is defined as the container for which the given entity is an owned
   * entity. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>owner</b></em>' feature
   * @generated
   */
  public KDMEntity getOwner() {
    return owner;
  }

  /**
   * Returns the value of '<em><b>ownedElement</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToOwnedElement(org.eclipse.modisco.kdm.core.KDMEntity value)} and
   * {@link #removeFromOwnedElement(KDMEntity value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of KDM entities that are owned by
   * the current KDM Entity. Only KDM containers can own other entities. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>ownedElement</b></em>' feature
   * @generated
   */
  public List<KDMEntity> getOwnedElement() {
    return ownedElement;
  }

  /**
   * Returns the value of '<em><b>outbound</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToOutbound(org.eclipse.modisco.kdm.core.KDMRelationship value)} and
   * {@link #removeFromOutbound(KDMRelationship value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of relationships such that the
   * current KDMEntity is the from-endpoint of these relationships. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>outbound</b></em>' feature
   * @generated
   */
  public List<KDMRelationship> getOutbound() {
    return outbound;
  }

  /**
   * Returns the value of '<em><b>inbound</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToInbound(org.eclipse.modisco.kdm.core.KDMRelationship value)} and
   * {@link #removeFromInbound(KDMRelationship value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of relationships such that the
   * current KDMEntity is the to-endpoint of these relations. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>inbound</b></em>' feature
   * @generated
   */
  public List<KDMRelationship> getInbound() {
    return inbound;
  }

  /**
   * Returns the value of '<em><b>ownedRelation</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToOwnedRelation(org.eclipse.modisco.kdm.core.KDMRelationship value)} and
   * {@link #removeFromOwnedRelation(KDMRelationship value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of relationships such that the
   * current KDMEntity owns these relationships. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>ownedRelation</b></em>' feature
   * @generated
   */
  public List<KDMRelationship> getOwnedRelation() {
    return ownedRelation;
  }

  /**
   * Returns the value of '<em><b>group</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToGroup(org.eclipse.modisco.kdm.core.KDMEntity value)} and {@link #removeFromGroup(KDMEntity value)} methods
   * to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Set of KDM entities with which the current
   * element is associated. This property determines a meta-level interface to KDM entities. This property is a derived
   * union. Some KDM entities define a concrete set of grouped elements that are the subtypes of KDMEntity. In KDM this
   * is represented by the CMOF “derived union” mechanism. Concrete properties subset the “union” properties of the
   * parent classes, defined in the Core package. The group of a KDM entity is defined as the group for which the given
   * entity is a grouped entity. Each KDM entity can be associated with multiple groups. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>group</b></em>' feature
   * @generated
   */
  public List<KDMEntity> getGroup() {
    return group;
  }

  /**
   * Returns the value of '<em><b>groupedElement</b></em>' feature. Note: the returned collection is Unmodifiable use
   * the {#addToGroupedElement(org.eclipse.modisco.kdm.core.KDMEntity value)} and
   * {@link #removeFromGroupedElement(KDMEntity value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of KDM entities that are “grouped”
   * by the current KDM entity. Only KDM groups can have group associations to other entities. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>groupedElement</b></em>' feature
   * @generated
   */
  public List<KDMEntity> getGroupedElement() {
    return groupedElement;
  }

  /**
   * Returns the value of '<em><b>inAggregated</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToInAggregated(org.eclipse.modisco.kdm.core.AggregatedRelationship value)} and
   * {@link #removeFromInAggregated(AggregatedRelationship value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of AggregatedRelationship for which
   * the target is the current KDM Entity. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>inAggregated</b></em>' feature
   * @generated
   */
  public List<AggregatedRelationship> getInAggregated() {
    return inAggregated;
  }

  /**
   * Returns the value of '<em><b>outAggregated</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToOutAggregated(org.eclipse.modisco.kdm.core.AggregatedRelationship value)} and
   * {@link #removeFromOutAggregated(AggregatedRelationship value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> the set of AggregatedRelationship for which
   * the origin is the current KDM Entity. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>outAggregated</b></em>' feature
   * @generated
   */
  public List<AggregatedRelationship> getOutAggregated() {
    return outAggregated;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "KDMEntity " + " [name: " + getName() + "]";
  }
}
