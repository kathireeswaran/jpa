package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Person;

public class NamedQuery {
public static void main(String[] args) {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	TypedQuery<Person> typedquery1 = manager.createNamedQuery("getById", Person.class);
	Person person=typedquery1.getSingleResult();
	System.out.println(person.getAddress()+" "+person.getName());
	
	TypedQuery<Person> typedquery = manager.createNamedQuery("getAll", Person.class);
	List<Person> list = typedquery.getResultList();
	for (Person object : list) {
		System.out.println(object);

	}

}
}
