package com.oneto_manydemo_bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session = sf.openSession();
	
	Mobile nokia=new Mobile();
	       nokia.setModelno(6600);
	       nokia.setBrandname("NOKIA");
	       
           Student s = new Student();
                   s.setRollno(1);
                   s.setName("Prashant");
	               nokia.setStudent(s);
	               
	       Mobile samsung = new Mobile();
	              samsung.setModelno(3310);
	              samsung.setBrandname("SAMSUNG");
	              samsung.setStudent(s);
	                      
	                      s.getSmobile().add(nokia);
	                      s.getSmobile().add(samsung);
	                      
	                      session.save(s);
	                      session.beginTransaction().commit();
	                      
}
}
