package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory  = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 102);
		
		
		Address address = employee.getAddress();
		
		session.delete(employee);
		
		session.delete(address);
		
		
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
