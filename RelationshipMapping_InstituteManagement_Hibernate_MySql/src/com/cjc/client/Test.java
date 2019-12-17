package com.cjc.client;

import java.util.Scanner;

import com.cjc.service.Operation;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Operation op=new Operation();
	
	while(true)
	{
	System.out.println("press 1 for add Course\npress 2 for view Course\npress3 for add Faculty\npress4 for view Faculty\npress5 for add Batch\npress6 for view Batch\npress7 for add Student\npress8 for view Student\npress9 for Exit\nEnter Your Choice");	
	int choice =sc.nextInt();
	
	
	switch(choice)
	{
	case 1:
		op.addCourse();
		break;
	case 2:
		op.viewCourse();
		break;
	case 3:
		op.addFaculty();
		break;
	case 4:
		op.viewFaculty();
	    break;
	case 5:
		op.addBatch();
		break;
	case 6:
		op.viewBatch();
		break;
	case 7:
		op.addStudent();
		break;
	case 8:
		op.viewStudent();
		break;
	case 9:
		System.exit(0);
	default:
		System.out.println("Please Enter Valid Choice");
	
	}
	}
}
}
