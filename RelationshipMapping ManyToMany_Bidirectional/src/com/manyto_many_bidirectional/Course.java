package com.manyto_many_bidirectional;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_course",joinColumns={@JoinColumn(name="r_no")},inverseJoinColumns={@JoinColumn(name="c_id")})
	
	private Set<Student> sstudent = new HashSet<>();
	
 	public Set<Student> getSstudent() {
		return sstudent;
	}
	public void setSstudent(Set<Student> sstudent) {
		this.sstudent = sstudent;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
