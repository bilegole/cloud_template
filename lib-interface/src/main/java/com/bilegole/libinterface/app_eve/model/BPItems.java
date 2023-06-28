package com.bilegole.libinterface.app_eve.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blueprint_items")
public class BPItems {
	@Id
	Long id;

	/**
	 * 物品数量
	 */
	Integer num;
	/**
	 * 物品id
	 */
	Integer objectId;
}
