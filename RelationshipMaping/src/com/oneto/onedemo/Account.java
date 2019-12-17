package com.oneto.onedemo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Account {
@Id
	private int accno;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="acp_id")
	private Accountplus acp;

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Accountplus getAcp() {
		return acp;
	}
	public void setAcp(Accountplus acp) {
		this.acp = acp;
	}
	
	
}
