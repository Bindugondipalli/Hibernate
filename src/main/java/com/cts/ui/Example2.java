package com.cts.ui;

import javax.persistence.EntityManager;

import com.cts.model.Composition.ContractEmployee;
import com.cts.model.Composition.Employee1;
import com.cts.model.Composition.Manager;
import com.cts.util.JPAUtil;

public class Example2 {
	public static void main(String[] args) {
		Employee1 e=new Employee1(101,"bindu",25000);
		Manager m= new Manager(102,"Ramu",35000,9500);
		ContractEmployee ce= new ContractEmployee(103,"Kittu",45200,11);
		 EntityManager em= JPAUtil.getEntityManagerFactory().createEntityManager();
		 em.getTransaction().begin();
		 em.persist(e);
		 em.persist(m);
		 em.persist(ce);
		 em.getTransaction().commit();
		 System.out.println("Employee saved");
		 JPAUtil.shutdown();
	}

}

