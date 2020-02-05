package com.cts.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JHPU");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee e=new Employee();
		e.setEname("srilu");
		em.persist(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println("Inserted.....");
	}

}
