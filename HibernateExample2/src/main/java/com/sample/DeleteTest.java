package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteTest {
	public static void main(String[] args) {
		Configuration configuration  = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Student student = session.load(Student.class, 3);
		session.delete(student);
		
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
