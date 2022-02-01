package com.example.login.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name= "inform")
public class Login {
	
	@Id
	private Integer id;
	
	@NotBlank(message= "the username should not be blank")
	@Size(min= 2, max= 20, message= "the username size is not valid")
	private String username;
	
	@NotBlank( message= "the password should not be blank")
	@Size(min= 2, max=20, message="the password size is not valid")
	private String pass;
	
	public Login()
	{}

	public Login(Integer id,
			@NotBlank(message = "the username should not be blank") @Size(min = 2, max = 20, message = "the username size is not valid") String username,
			@NotBlank(message = "the password should not be blank") @Size(min = 2, max = 20, message = "the password size is not valid") String pass) {
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
