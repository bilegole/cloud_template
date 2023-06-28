package com.bilegole.libinterface.app_eve.model.planetIndustry;

import com.bilegole.libinterface.app_eve.model.Blueprint;
import com.bilegole.libinterface.app_eve.model.Items;
import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;

/**
 * 行星加工配方
 */
@Entity
@Table(name = "blueprint")
public class BP implements Blueprint {
	@Id
	Integer id;

	Integer uid;

	@OneToMany
	List<Items> inputs;

	@OneToMany
	List<Items> output;

	/**
	 * 蓝图时间消耗(单位，秒)
	 */
	Integer timeCost;

	/**
	 * 工厂类型
	 */
	@Enumerated(EnumType.STRING)
	FactoryLevel factoryLevel;

	@Override
	public List<Items> getInputs() {
		return inputs;
	}

	@Override
	public List<Items> getOutputs() {
		return Collections.singletonList(output);
	}

	@Override
	public Integer getTimeCost() {
		return timeCost;
	}

	@Override
	public Integer getIskCost() {
		return 0;
	}
}
