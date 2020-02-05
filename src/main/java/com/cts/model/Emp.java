package com.cts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Emp {
	@Id
	@Column(name="eid")
	private int empId;
	@Column(name="ename",nullable=false)
	private String empName;
	private double basic;
	
	public Emp() {
	}
	}


