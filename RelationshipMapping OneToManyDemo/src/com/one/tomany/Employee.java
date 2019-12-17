package com.one.tomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int empid;
private String ename;
private String eaddress;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="d_id")
private Department department;

public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
}
