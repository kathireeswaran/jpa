package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Staff;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory fac=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager=fac.createEntityManager();
	manager.getTransaction().begin();
	Staff staff=new Staff();
	staff.setStaffName("kathir");
	staff.setStaffAddress("chennai");
	staff.setstaffSalary(150000d);
	manager.persist(staff);
	Staff staff1=new Staff();
	staff1.setStaffName("seenu");
	staff1.setStaffAddress("salem");
	staff1.setstaffSalary(150000d);
	manager.persist(staff1);
	Staff staff2=new Staff();
	staff2.setStaffName("nihal");
	staff2.setStaffAddress("chennai");
	staff2.setstaffSalary(150000d);
	manager.persist(staff2);
	Staff staff3=new Staff();
	staff3.setStaffName("kumar");
	staff3.setStaffAddress("chennai");
	staff3.setstaffSalary(150000d);
	manager.persist(staff3);
	System.out.println("added staff");
	manager.getTransaction().commit();
	manager.close();
	fac.close();
}
}
