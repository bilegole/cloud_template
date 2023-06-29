package com.bilegole.eve.model.entity;

import com.bilegole.eve.model.entity.Industry.BPItems;

import java.util.List;

/**
 * 蓝图
 */
public interface Blueprint {
	List<BPItems> getInputs();

	List<BPItems> getOutputs();

	Integer getTimeCost();

	Integer getIskCost();
}
