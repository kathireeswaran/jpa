package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Employee;

public class MainClass {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager=factory.createEntityManager();
	manager.getTransaction().begin();
	Employee emp=new Employee();//we dont set id because it is primary keyS
	emp.setEmpName("kathir");
	emp.setEmpSal(76934);
	manager.persist(emp);
	Employee emp1=new Employee();//we dont set id because it is primary keyS
	emp.setEmpName("katir");
	emp.setEmpSal(734);
	manager.persist(emp1);
	Employee emp2=new Employee();//we dont set id because it is primary keyS
	emp.setEmpName("khir");
	emp.setEmpSal(6934);
	manager.persist(emp2);
	manager.close();
	System.out.println("added employee");
	manager.getTransaction().commit();
	factory.close();
}
}
