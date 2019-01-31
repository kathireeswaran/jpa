package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Employee;

public class TypedQueryDemo {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		String qry = "SELECT emp FROM Employee emp where empsal>500 and empsal<500000";

		TypedQuery typedquery = manager.createQuery(qry, Employee.class);
		List list = typedquery.getResultList();
		for (Object object : list) {
			System.out.println(object);

		}
		manager.getTransaction().commit();
	}

}
