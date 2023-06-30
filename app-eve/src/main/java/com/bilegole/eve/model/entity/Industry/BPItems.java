package com.bilegole.eve.model.entity.Industry;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="bp_item_type")
@Table(name = "blueprint_items")
public class BPItems {
	@Id
	Long id;

//	@Enumerated(value = EnumType.STRING)
//	BPItemType bpItemType;

	@ManyToOne
	@JoinColumn(name = "bp_id")
	BP bp;

	/**
	 * 物品数量
	 */
	Integer num;
	/**
	 * 物品id
	 */
	Integer objectId;
}
