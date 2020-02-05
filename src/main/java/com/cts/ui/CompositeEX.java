package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.composition.Address;
import com.cts.composition.Faculty;
import com.cts.util.JPAUtil;

public class CompositeEX {
	public  static void main(String[] a) {
		Faculty f=new Faculty("Bindu",new Address("A201","serling Boorkside Apartments","Banglore,karnataka"));
		EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		em.persist(f);
		System.out.println("faculty saved");
		JPAUtil.shutdown();
	}

}
