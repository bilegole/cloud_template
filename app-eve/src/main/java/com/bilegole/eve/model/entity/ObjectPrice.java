package com.bilegole.eve.model.entity;

import com.bilegole.eve.model.Enum.PriceType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "object_price_record")
@Setter
@Getter
public class ObjectPrice extends Record{

	@Column(name = "object_id")
	String objectId;

	@Enumerated(EnumType.STRING)
	@Column(name = "price_type")
	PriceType priceType;

	@Column(name = "price", precision = 15)
	Double price;
}
