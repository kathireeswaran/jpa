package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Staff;

public class read {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	Staff staff=manager.find(Staff.class, 10);
	String staffname=staff.getStaffName();
	String staffaddress=staff.getStaffAddress();
	System.out.println(staffname+" "+staffaddress);
}
}
