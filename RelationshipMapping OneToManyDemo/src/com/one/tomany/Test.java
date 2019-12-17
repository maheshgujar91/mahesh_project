package com.one.tomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		
		Employee e1=new Employee();
		         e1.setEname("Shrikant");
		         e1.setEaddress("Sangvi");
		         
		         Department dpt=new Department();
		                    dpt.setName("IT");
		                    e1.setDepartment(dpt);
		                    
		                    Employee e2=new Employee();
		                             e2.setEname("Prashant");
		                             e2.setEaddress("Akurdi");
		                             e2.setDepartment(dpt);
		                             
		                             dpt.getSemp().add(e1);
		                             dpt.getSemp().add(e2);
		                             
		                             session.save(dpt);
		                             session.beginTransaction().commit();

	
	}
}
