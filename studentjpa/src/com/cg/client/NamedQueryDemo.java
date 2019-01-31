package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Student;

public class NamedQueryDemo {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	TypedQuery<Student> typedquery1 = manager.createNamedQuery("deleteById", Student.class);
	Student student=typedquery1.getSingleResult();
	System.out.println("deleted row");
	manager.remove(manager);
	manager.getTransaction().commit();
	
}
}
