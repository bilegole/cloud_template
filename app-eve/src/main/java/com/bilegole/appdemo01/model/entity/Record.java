package com.bilegole.appdemo01.model.entity;

import com.bilegole.appdemo01.model.Enum.PriceType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@MappedSuperclass
@Setter
@Getter
public class Record {
	@Id
	@Column(name = "id")
	Long id;

	@Column(name = "record_time")
	Date recordTime;
}
