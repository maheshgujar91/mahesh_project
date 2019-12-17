package com.cjc.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cjc.model.Batch;
import com.cjc.model.Course;
import com.cjc.model.Faculty;
import com.cjc.model.Student;
import com.cjc.hibernate_util.*;
public class Operation implements ServiceI{

	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	
	List<Course>courseList=new ArrayList();
	List<Faculty>facultyList=new ArrayList();
	List<Batch>batchList=new ArrayList();
	List<Student>studentList=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void addCourse() {
		System.out.println("Enter Course Id=");
		int Cid=sc.nextInt();
		System.out.println("Enter Course Name=");
		String Cname=sc.next();
		Course c=new Course();
		       c.setCid(Cid);
		       c.setCname(Cname);
		       courseList.add(c);
		       
		       session.save(courseList);
		       session.beginTransaction().commit();
	}
	
	@Override
	public void viewCourse() {
		Iterator <Course>itr=courseList.iterator();
		System.out.println("Cid \t Cname");
		while(itr.hasNext())
		{
			Course c=itr.next();
			System.out.println(c.getCid()+" \t "+c.getCname());
		}
		
	}

	@Override
	public void addFaculty() {
		System.out.println("Enter Cid");
		int c1=sc.nextInt();
		Iterator <Course>itr=courseList.iterator();
		while(itr.hasNext())
		{
			Course c=itr.next();
			int c2=c.getCid();
			if(c1==c2)
			{
		System.out.println("Enter Faculty Id");
		int Fid=sc.nextInt();
		
		System.out.println("Enter Faculty Name");
		String Fname=sc.next();
		
		Faculty f=new Faculty();
		        f.setFid(Fid);
		        f.setFname(Fname);
		        f.setCourse(c);
		        facultyList.add(f);
			}
			else
			{
				System.out.println("Enter Valid Cid");
			}
			}       
	}

	@Override
	public void viewFaculty() {
	        Iterator <Faculty>itr=facultyList.iterator();
	        System.out.println("Fid \t Fname \t Cname");
	        while(itr.hasNext())
	        {
	        	Faculty f=itr.next();
	        	System.out.println(f.getFid()+" \t "+f.getFname()+"\t"+f.getCourse().getCname());
            
                }
	        }
	
	@Override
	public void addBatch() {
		    		System.out.println("Enter Your Fid");
		    		int f2=sc.nextInt();
		    		Iterator<Faculty> itr=facultyList.iterator();
		    		while(itr.hasNext())
		    		{
		    			Faculty f=itr.next();
		    			int f3=f.getFid();
		    			if(f2==f3)
		    			{
		    				System.out.println("Enter Your Batch id");
		    				int Bid=sc.nextInt();
		    				
		    				System.out.println("Enter Your Batch name");
		    				String Bname=sc.next();
		    				Batch b=new Batch();
		    				      b.setBid(Bid);
		    				      b.setBname(Bname);
		    				      b.setFaculty(f);
		    				      batchList.add(b);
		    			}
		    			else
		    			{
		    				System.out.println("Enter valid Fid");
		    			}
		    		
		    		}
		    	
		    	}
		    
	@Override
	public void viewBatch() {
		  Iterator<Batch>itr=batchList.iterator();
	        System.out.println("Bid \t Bname \t Fname");
	        while(itr.hasNext())
	        {
	        	Batch b=itr.next();
	        	System.out.println(b.getBid()+" \t "+b.getBname()+"\t"+b.getFaculty().getFname());
              }
	        }

	@Override
	public void addStudent() {
		System.out.println("Enter Your Bid");
		int b1=sc.nextInt();
		Iterator<Batch>itr=batchList.iterator();
		while(itr.hasNext())
		{
			Batch b=itr.next();
			int b2=b.getBid();
			if(b1==b2)
			{
				System.out.println("Enter Student Id");
				int Sid=sc.nextInt();
				System.out.println("Enter Student Name");
				String Sname=sc.next();
				
				Student s=new Student();
				        s.setSid(Sid);
				        s.setSname(Sname);
				        s.setBatch(b);
				        studentList.add(s);
			}
		}
	}

	@Override
	public void viewStudent() {
		Iterator<Student> itr=studentList.iterator();
		System.out.println("Sid \t Sname \t Bname \t Bid");
		while(itr.hasNext())
		{
			Student s=itr.next();
			System.out.println(s.getSid()+"\t"+s.getSname()+"\t"+s.getBatch().getBname()+"\t"+s.getBatch().getBid());
		}
	}

}
