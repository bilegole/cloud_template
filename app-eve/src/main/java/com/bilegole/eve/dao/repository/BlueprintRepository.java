package com.bilegole.eve.dao.repository;

import com.bilegole.eve.model.entity.Industry.BP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlueprintRepository extends JpaRepository<BP,Long> {
}
