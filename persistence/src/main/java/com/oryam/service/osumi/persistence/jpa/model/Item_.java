package com.oryam.service.osumi.persistence.jpa.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

/**
 * Meta model for ItemJpa entity.
 */
@StaticMetamodel(ItemJpa.class)
public abstract class Item_ {

    // Raw attributes
    public static volatile SingularAttribute<ItemJpa, String> code;

}
