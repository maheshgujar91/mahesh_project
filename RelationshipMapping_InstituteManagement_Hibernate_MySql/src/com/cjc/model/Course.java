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
public class Course {
//@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cid;
	private String cname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="C_id")
	private Set<Batch> sbatch= new HashSet<>();
	
	public Set<Batch> getSbatch() {
		return sbatch;
	}
	public void setSbatch(Set<Batch> sbatch) {
		this.sbatch = sbatch;
	}
	public int getCid()
	{
		return cid;
	}
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	public String getCname()
	{
		return cname;
	}
	public void setCname(String cname)
	{
		this.cname=cname;
	}
}
