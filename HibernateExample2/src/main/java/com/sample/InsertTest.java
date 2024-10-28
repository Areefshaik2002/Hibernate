package com.sample;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class InsertTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = new Student();
		student.setName("Areef");
		student.setAge(22);
		student.setBranch("CSE");
		
		session.save(student);
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
