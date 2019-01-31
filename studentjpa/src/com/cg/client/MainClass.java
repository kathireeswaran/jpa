package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Student;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	Student stud=new Student();//we dont set id because it is primary keyS
	stud.setstudName("kathir");
	stud.setstudmark(76);
	manager.persist(stud);
	Student stud1=new Student();
	stud1.setstudName("nihal");
	stud1.setstudmark(89);
	manager.persist(stud1);
	Student stud2=new Student();
	stud2.setstudName("surya");
	stud2.setstudmark(99);
	manager.persist(stud2);
	
	System.out.println("added student");
	manager.getTransaction().commit();
	manager.close();
	factory.close();
}
}
