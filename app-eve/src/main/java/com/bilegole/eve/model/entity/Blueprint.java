package com.bilegole.eve.model.entity;

import com.bilegole.eve.model.entity.Industry.BPItemInput;
import com.bilegole.eve.model.entity.Industry.BPItemOutput;

import java.util.List;

/**
 * 蓝图
 */
public interface Blueprint {
	List<BPItemInput> getInputs();

	List<BPItemOutput> getOutputs();

	Integer getTimeCost();

	Integer getIskCost();
}
