package com.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("StudentPU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
//		Student obj = new Student();
//		obj.setId(5);
//		obj.setName("Dinesh");
//		obj.setAge(22);
//		obj.setDepartment("HR");
//		manager.persist(obj);
		
		Student obj = manager.find(Student.class, 1);
		manager.remove(obj);
		
		
		
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}