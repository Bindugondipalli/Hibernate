package com.cts.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cts.model.BankAccount;
import com.cts.model.Customer;
import com.cts.util.JPAUtil;

public class Example3 {
	public static void main(String[]args) {
		BankAccount ba=new BankAccount();
		Customer cs= new Customer("8957495783","Bindu",ba);
		ba.setAccno("SBN001");
		ba.setCustomer(cs);
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(cs);
		txn.commit();
	    JPAUtil.shutdown();	
	}

}
