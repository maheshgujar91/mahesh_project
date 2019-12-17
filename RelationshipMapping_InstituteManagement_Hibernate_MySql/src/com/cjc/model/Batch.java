package com.cjc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Batch {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private Faculty faculty;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="B_id")
	private Set<Student> sstudent = new HashSet<>();
	
	public Set<Student> getSstudent() {
		return sstudent;
	}
	public void setSstudent(Set<Student> sstudent) {
		this.sstudent = sstudent;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
