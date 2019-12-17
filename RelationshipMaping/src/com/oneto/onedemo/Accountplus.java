package com.oneto.onedemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accountplus {
@Id
	private int accpid;
	private String address;
	
	public int getAccpid() {
		return accpid;
	}
	public void setAccpid(int accpid) {
		this.accpid = accpid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
