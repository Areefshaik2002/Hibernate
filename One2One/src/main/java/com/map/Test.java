package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configure = new Configuration().configure();
		SessionFactory factory  = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address();
		address.setId(5002);
		address.setH_no("1-40");
		address.setStreet("Bose road");
		address.setCity("Vijayawada");
		address.setState("AP");
		address.setPincode("522010");
		
		Employee employee = new Employee();
		employee.setId(102);
		employee.setName("Manish");
		employee.setSalary(85000.00);
		employee.setAddress(address);
		
		session.save(address);
		session.save(employee);
		
		transaction.commit();
		session.close();
		factory.close();
	}
}
