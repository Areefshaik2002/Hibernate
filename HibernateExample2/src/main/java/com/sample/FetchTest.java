package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchTest {
	public static void main(String[] args) {
		Configuration configuration  = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		int id=1;
		Student student = session.load(Student.class, id);
		System.out.println(student);
		
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
