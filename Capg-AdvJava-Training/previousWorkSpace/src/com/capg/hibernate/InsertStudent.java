package com.capg.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			Student s1 = new Student();
			s1.setSno(9);
			s1.setSname("Yosker");
			s1.setEmail("sagarpakar777@gmail.com");
			s1.setPhone(7239942006L);
			session.save(s1);
            // 7. Commit Transaction
            tx.commit();
            System.out.println("Records inserted successfully");

		}catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }

		
		
	}
}
