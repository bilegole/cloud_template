package com.bilegole.eve.dao.repository;

import com.bilegole.eve.model.entity.ObjectPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectPriceRepository extends JpaRepository<ObjectPrice, Long> {
}
