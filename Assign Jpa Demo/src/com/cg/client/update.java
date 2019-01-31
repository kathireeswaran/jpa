package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Staff;

public class update {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		Staff staff=manager.find(Staff.class, 10);
		System.out.println("Original object" +staff);
		staff.setStaffName("hellokathir");
		manager.merge(staff);
		System.out.println("hello");
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}
}
