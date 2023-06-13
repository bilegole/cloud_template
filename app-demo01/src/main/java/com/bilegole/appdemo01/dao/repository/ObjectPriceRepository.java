package com.bilegole.appdemo01.dao.repository;

import com.bilegole.appdemo01.model.entity.ObjectPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectPriceRepository extends JpaRepository<ObjectPrice, Long> {
}
