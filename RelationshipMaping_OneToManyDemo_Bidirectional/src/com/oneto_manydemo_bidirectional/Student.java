package com.oneto_manydemo_bidirectional;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String name;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="student")
	
	private Set<Mobile> smobile= new HashSet<>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Mobile> getSmobile() {
		return smobile;
	}
	public void setSmobile(Set<Mobile> smobile) {
		this.smobile = smobile;
	}
}
