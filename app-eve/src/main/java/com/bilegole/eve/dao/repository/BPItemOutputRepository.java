package com.bilegole.eve.dao.repository;

import com.bilegole.eve.model.entity.Industry.BPItemOutput;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BPItemOutputRepository extends JpaRepository<BPItemOutput, Long> {
}
