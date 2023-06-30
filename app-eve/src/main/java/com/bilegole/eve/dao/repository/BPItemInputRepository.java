package com.bilegole.eve.dao.repository;

import com.bilegole.eve.model.entity.Industry.BPItemInput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BPItemInputRepository extends JpaRepository<BPItemInput, Long> {
}
