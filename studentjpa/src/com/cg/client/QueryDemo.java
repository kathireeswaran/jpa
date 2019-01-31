package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		String qry="SELECT std FROM Student std where studmark>50 and studmark<90";
		Query query=manager.createQuery(qry);
		List list=query.getResultList();
		for (Object object:list) {
			System.out.println(object);			
			
		}
		manager.getTransaction().commit();
	}
}
