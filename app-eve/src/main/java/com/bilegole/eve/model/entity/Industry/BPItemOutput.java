package com.bilegole.eve.model.entity.Industry;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@DiscriminatorValue("output")
public class BPItemOutput extends BPItems{
}
