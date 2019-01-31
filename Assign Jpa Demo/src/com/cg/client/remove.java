package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Staff;

public class remove {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		
		Staff staff=manager.find(Staff.class, 8);
		System.out.println("Original object" +staff);
		manager.remove(staff);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
