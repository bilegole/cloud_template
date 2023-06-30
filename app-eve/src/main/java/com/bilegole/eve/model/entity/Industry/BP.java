package com.bilegole.eve.model.entity.Industry;

import com.bilegole.eve.model.entity.Blueprint;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "blueprint")
public class BP implements Blueprint {
	@Id
	Integer id;

	/**
	 * 蓝图id（ccp规定）
	 */
	Integer uid;

	@OneToMany(mappedBy = "bp", fetch = FetchType.EAGER)
	List<BPItemInput> inputs;

//	@OneToMany(mappedBy = "bp", fetch = FetchType.EAGER)
//	List<BPItemOutput> output;

	/**
	 * 蓝图时间消耗(单位，秒)
	 */
	Integer timeCost;

	@Enumerated(EnumType.STRING)
	BluePrintType bluePrintType;

	@Override
	public List<BPItemInput> getInputs() {
		return inputs;
	}

	@Override
	public List<BPItemOutput> getOutputs() {
		return null;
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
