package com.cjc.model;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.hibernate_util.*;
public class Test {

	public static void main(String[] args) {
		
	
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session = sf.openSession();
	
	Student s1 = new Student();
	        //s1.setSid(1);
	        s1.setSname("Shrikant");
	      
	        Student s2=new Student();
	               // s2.setSid(2);
	                s2.setSname("Poonam");
	                

	            	Student s3 = new Student();
	            	      //  s3.setSid(3);
	            	        s3.setSname("Shrinivas");
	            	        
	            	        Student s4=new Student();
	            	        //        s4.setSid(4);
	            	                s4.setSname("Prashant");
	                
	                Batch b1=new Batch();
	                      b1.setBid(111);
	                      b1.setBname("Morning-111");
	                      s1.setBatch(b1);
	                      s2.setBatch(b1);
	                      s3.setBatch(b1);
	                      s4.setBatch(b1);
	                      b1.getSstudent().add(s1);
	                      b1.getSstudent().add(s2);
	                      b1.getSstudent().add(s3);
	                      b1.getSstudent().add(s4);
	                  /*    
	                      Batch b2=new Batch();
	                            b2.setBname("Afternoon-112");
	                            b2.getSstudent().add(s3);
	                            b2.getSstudent().add(s4);
	                            
	                      Course c1=new Course();
         	               c1.setCname("Java");
         	               c1.getSbatch().add(b1);
         	               
         	               Course c2=new Course();
         	                 c2.setCname("Python");
         	                 c2.getSbatch().add(b2);
         	                
	                      Faculty f1=new Faculty();
	          	             f1.setFname("IT");
	          	             f1.getScourse().add(c1);
	          	             //f1.getScourse().add(c2);
	          	        */
	          	             session.save(b1);
	          	             session.beginTransaction().commit();
}
}