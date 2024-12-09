package com.klef.jfsd.exam.inheritancemapping;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class Car extends Vehicle{
	
	@Column(name = "noofdoors")
	private int noofdoors;

	public int getNoofdoors() {
		return noofdoors;
	}

	public void setNoofdoors(int noofdoors) {
		this.noofdoors = noofdoors;
	}
	
	

}
