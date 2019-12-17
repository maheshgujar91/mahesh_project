package com.oneto_manydemo_bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mobile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int modelno;
	private String brandname;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="roll_no")
	private Student student;
	
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	} 	
}
