package com.bilegole.eve.model.entity.Industry;

import com.bilegole.eve.model.Enum.BluePrintType;
import com.bilegole.eve.model.entity.Blueprint;
import com.bilegole.eve.model.entity.Industry.PlanetIndustry.FactoryLevel;
import jakarta.persistence.*;

import java.util.List;

@MappedSuperclass
@Table(name = "blueprint")
public class BP implements Blueprint {
	@Id
	Integer id;

	Integer uid;

	@Transient
	List<BPItems> inputs;

	@Transient
	List<BPItems> output;

	/**
	 * 蓝图时间消耗(单位，秒)
	 */
	Integer timeCost;

	BluePrintType bluePrintType;

	@Override
	public List<BPItems> getInputs() {
		return inputs;
	}

	@Override
	public List<BPItems> getOutputs() {
		return output;
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
