package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		long id = 1;
		Customer customer = session.load(Customer.class, id);
		customer.setAadhar("920966961765");
		session.save(customer);
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
