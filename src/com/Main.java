package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		StudentInfo stuinfo = new StudentInfo();
		stuinfo.setRollNumber(01);
		stuinfo.setStudentName("Adam");
		
		session.save(stuinfo);
		
		session.getTransaction().commit();
		session.close();
		sessionfactory.close();
		
		System.out.println("Object is saved");
	}

}
