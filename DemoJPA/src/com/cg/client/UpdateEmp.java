package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Employee;

public class UpdateEmp {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		Employee obj=manager.find(Employee.class,0);//use only primary key
		System.out.println("original");
		obj.setEmpSal(obj.getEmpSal()+2000);
		
		manager.getTransaction().commit();
		manager.close();
		System.out.println("updated");
		factory.close();
		
	}

}
