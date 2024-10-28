package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory  = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 101);
		employee.setSalary(95000);
		Address address = employee.getAddress();
		address.setStreet("MG Road");
		address.setCity("Chennai");
		
		
		employee.setAddress(address);
		session.save(address);
		session.save(employee);
		
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
