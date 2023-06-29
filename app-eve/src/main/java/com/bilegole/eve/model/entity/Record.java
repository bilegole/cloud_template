package com.bilegole.eve.model.entity;

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
