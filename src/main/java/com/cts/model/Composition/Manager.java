package com.cts.model.Composition;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("mang")
public class Manager extends Employee1 {
	@Column(name="hra")
	private double hra;
	public Manager() {}
	public Manager(int empNo, String eName, double sal, double hra) {
		super(empNo,eName,sal);
		this.hra=hra;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}

}
