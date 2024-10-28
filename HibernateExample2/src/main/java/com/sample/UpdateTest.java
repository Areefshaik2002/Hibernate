package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTest {
	public static void main(String[] args) {
		Configuration configuration  = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		Student student = session.load(Student.class, 1);
		student.setBranch("ECE");
		session.save(student);
		
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
