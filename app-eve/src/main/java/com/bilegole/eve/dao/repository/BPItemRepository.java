package com.bilegole.eve.dao.repository;

import com.bilegole.eve.model.entity.Industry.BPItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BPItemRepository extends JpaRepository<BPItems, Long> {
}
