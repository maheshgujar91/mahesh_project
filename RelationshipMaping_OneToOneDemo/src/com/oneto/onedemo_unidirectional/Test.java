package com.oneto.onedemo_unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session =sf.openSession();
	
	Account account=new Account();
	        account.setAccno(101);
	        account.setName("Nilesh");
	        
	        Accountplus accountplus=new Accountplus();
	                    accountplus.setAccpid(1);
	                    accountplus.setAddress("Karvenagar");
	                    account.setAcp(accountplus);
	                    
	                    session.save(account);
	                    session.beginTransaction().commit();
	        		
	
}
}
