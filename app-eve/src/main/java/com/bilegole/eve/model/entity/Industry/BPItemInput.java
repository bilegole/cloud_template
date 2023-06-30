package com.bilegole.eve.model.entity.Industry;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@DiscriminatorValue(value = "input")
public class BPItemInput extends BPItems{
}
