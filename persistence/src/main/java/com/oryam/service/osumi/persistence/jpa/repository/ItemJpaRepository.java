package com.oryam.service.osumi.persistence.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.oryam.service.osumi.persistence.jpa.model.ItemJpa;

public interface ItemJpaRepository extends JpaRepository<ItemJpa, Long>, JpaSpecificationExecutor<Long> {

}
