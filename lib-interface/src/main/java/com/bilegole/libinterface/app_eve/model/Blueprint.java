package com.bilegole.libinterface.app_eve.model;

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
