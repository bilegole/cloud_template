package com.bilegole.appdemo01.model.entity;

import com.bilegole.appdemo01.model.Enum.PriceType;
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

	@Column(name = "price", precision = 15, scale = 2)
	Double price;
}
