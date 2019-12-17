package com.oneto_many_unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {

		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();

				
		Mobile nokia=new Mobile();
		       
		       nokia.setMobname("Nokia");
		       
		       
		       Mobile samsung= new Mobile();
		              
		              samsung.setMobname("Samsung");
		              
		              
		              Student s=new Student();
		                      s.setRollno(1);
		                      s.setName("Pratik");
		                      s.getMob().add(nokia);
		                      s.getMob().add(samsung);
		                      
		                     
		                      session.save(s);
		                      session.beginTransaction().commit();
	}
}
