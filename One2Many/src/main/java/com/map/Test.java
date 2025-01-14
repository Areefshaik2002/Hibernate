package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Laptop laptop1 = new Laptop();
		laptop1.setBrand("Realme");
		
		Laptop laptop2 = new Laptop();
		laptop2.setBrand("Lenovo");
		
		Laptop laptop3 = new Laptop();
		laptop3.setBrand("Samsung");
		
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);
		
		Student student = new Student();
		student.setName("Narendra");
		student.setLaptops(laptops);
		
		laptop1.setStudent(student);
		laptop2.setStudent(student);
		laptop3.setStudent(student);
		
		session.save(laptop1);
		session.save(laptop2);
		session.save(laptop3);
		
		session.save(student);
		
		
		
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
