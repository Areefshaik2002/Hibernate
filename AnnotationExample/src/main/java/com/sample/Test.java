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
		
		Trainer trainer = new Trainer();
		trainer.setName("Manish");
		trainer.setSubject("React JS");
		trainer.setSalary(75000.00);
		
		Product product = new Product();
		product.setCategory("Electronics");
		product.setName("AC");
		product.setPrice(70000.00);
		
		session.save(trainer);
		session.save(product);
		
		
		transaction.commit();
		session.close();
		factory.close();

	}

}
