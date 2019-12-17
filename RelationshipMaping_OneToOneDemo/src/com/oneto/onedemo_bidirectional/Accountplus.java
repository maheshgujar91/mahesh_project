package com.oneto.onedemo_bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Accountplus {
@Id
	private int accpid;
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="account_id")
	
	private Account account;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
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
