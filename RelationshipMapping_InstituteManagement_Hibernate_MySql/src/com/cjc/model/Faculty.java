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

//@Entity
public class Faculty {
//@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int fid;
	private String fname;
	private Course course;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="F_id")
	private Set<Course> scourse = new HashSet<>();
	
	public Set<Course> getScourse() {
		return scourse;
	}
	public void setScourse(Set<Course> scourse) {
		this.scourse = scourse;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}	
}
