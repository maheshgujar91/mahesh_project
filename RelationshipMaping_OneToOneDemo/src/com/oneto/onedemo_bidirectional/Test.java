package com.oneto.onedemo_bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	SessionFactory sf=HibernateUtil.getSessionFactory();
	
	Session session =sf.openSession();
	
	Account account=new Account();
	        account.setAccno(109);
	        account.setName("Nilesh");
	        
	        Accountplus accountplus=new Accountplus();
	                    accountplus.setAccpid(5);
	                    accountplus.setAddress("Karvenagar");
	                    
	                    accountplus.setAccount(account);
	                    account.setAcp(accountplus);
	                    
	                    session.save(accountplus);
	                    session.beginTransaction().commit();
	        			
}
}
