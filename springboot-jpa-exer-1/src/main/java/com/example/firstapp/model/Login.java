package com.example.firstapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "inform")

public class Login {
	@Id
	private Integer id;
	private String username;
	private String pass;
	
	public Login()
	{}
	
	public Login(Integer id, String username, String pass) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	

}
