package com.sample;

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
		
		Customer customer = new Customer();
		customer.setName("Manish");
		customer.setAadhar("920966961666");
		customer.setPan("5HG14123");
		customer.setAge(23);
		
		session.save(customer);
		
		
		transaction.commit();
		session.close();
		factory.close();
		

	}

}
