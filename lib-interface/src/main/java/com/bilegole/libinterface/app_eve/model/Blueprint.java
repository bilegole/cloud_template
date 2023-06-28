package com.bilegole.libinterface.app_eve.model;

import java.util.List;

/**
 * 蓝图
 */
public interface Blueprint {
	List<Items> getInputs();

	List<Items> getOutputs();

	Integer getTimeCost();

	Integer getIskCost();
}
