package com.cts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BankAccounts")
public class BankAccount {
	@Id
	private String Accno;
	@OneToOne
	@JoinColumn(name="aadhar")
	private Customer customer;
	public BankAccount() {
	}
	public BankAccount(String accno,Customer customer) {
		super();
		this.Accno=accno;
		this.customer=customer;
	}
	public String getAccno() {
		return Accno;
	}
	public void setAccno(String accno) {
		Accno = accno;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
