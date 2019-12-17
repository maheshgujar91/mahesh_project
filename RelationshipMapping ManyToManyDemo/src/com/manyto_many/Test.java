package com.manyto_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	 
	Session session = sf.openSession();
	
	Course c1 = new Course();
	       c1.setCname("PYTHON");
	       
	       Course c2 = new Course();
	              c2.setCname("SPRING");
	              
	              Student s = new Student();
	                      s.setRollno(11);
	                      s.setName("Shrikant");
	                      s.getScourse().add(c1);
	                      s.getScourse().add(c2);
	                      
	                      session.save(s);
	                      
	                      session.beginTransaction().commit();
}
}
