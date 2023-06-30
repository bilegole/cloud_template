package com.bilegole.eve.model.entity.Industry.PlanetIndustry;

import com.bilegole.eve.model.entity.Industry.BP;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "bp_planet_industry")
public class PlanetBP extends BP {
    /**
     * 工厂类型
     */
    @Enumerated(EnumType.STRING)
    FactoryLevel factoryLevel;
}
