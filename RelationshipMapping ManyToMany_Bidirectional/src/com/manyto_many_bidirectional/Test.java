package com.manyto_many_bidirectional;

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
	              
	              Student s1 = new Student();
	                      s1.setRollno(11);
	                      s1.setName("Shrikant");
	                      
	                     /* Student s2=new Student();
	                              s2.setRollno(12);
	                              s2.setName("Pranay");
	                      */
	                      c2.getSstudent().add(s1);
	                      c1.getSstudent().add(s1);
	                      //c2.getSstudent().add(s2);
	                      //c1.getSstudent().add(s2);
	                      s1.getScourse().add(c1);
	                      s1.getScourse().add(c2);
	                      //s2.getScourse().add(c1);
	                      //s2.getScourse().add(c2);
	                      
	                      session.save(s1);
	                      //session.save(s2);
	                      
	                      session.beginTransaction().commit();
}
}
