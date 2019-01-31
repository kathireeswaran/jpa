package com.cg.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Employee;

public class DynamicQueryDemo {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		String qry = "SELECT emp FROM Employee emp where emp.empId=:id";
		TypedQuery<Employee> query = manager.createQuery(qry, Employee.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id top search::");
		int eid = sc.nextInt();
		query.setParameter("id", eid);
		Employee employee = query.getSingleResult();
		System.err.println(employee.getEmpName() + "" + employee.getEmpSal());
		manager.getTransaction().commit();

	}
}
