package com.oneto_many_unidirectional;

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
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Mobile> mob = new HashSet<>();
	
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
	public Set<Mobile> getMob() {
		return mob;
	}
	public void setMob(Set<Mobile> mob) {
		this.mob = mob;
	}
}
