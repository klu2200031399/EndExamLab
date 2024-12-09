package com.klef.jfsd.exam.inheritancemapping;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Truck")
public class Truck extends Vehicle {
	
	@Column(name="loadcapacity")
	private int loadcapacity;

	public int getLoadcapacity() {
		return loadcapacity;
	}

	public void setLoadcapacity(int loadcapacity) {
		this.loadcapacity = loadcapacity;
	}
	
	

}
