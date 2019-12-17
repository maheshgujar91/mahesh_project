package com.oneto_many_unidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private String mobname;


public String getMobname() {
	return mobname;
}

public void setMobname(String mobname) {
	this.mobname = mobname;
}
	
}
