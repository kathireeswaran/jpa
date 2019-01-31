package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Student;



public class TypedQueryDemo {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		String qry = "SELECT std FROM Student std where studmark>50 and studmark<78";

		@SuppressWarnings("rawtypes")
		TypedQuery typedquery = manager.createQuery(qry, Student.class);
		@SuppressWarnings("rawtypes")
		List list = typedquery.getResultList();
		for (Object object : list) {
			System.out.println(object);

		}
		manager.getTransaction().commit();
	}
}
