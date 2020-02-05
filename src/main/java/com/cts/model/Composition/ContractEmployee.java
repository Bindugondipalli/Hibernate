package com.cts.model.Composition;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("emp")
public class ContractEmployee extends Employee1{
	@Column(name="duration")
	private int duration;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(long eid, String ename,double basic, int duration) {
		super(eid,ename,basic);
		this.duration=duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}
