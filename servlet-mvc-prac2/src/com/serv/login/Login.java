package com.serv.login;

public class Login {
	
	private String user;
	private String pass;
	
	
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Login(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
		
	}




	@Override
	public String toString() {
		return "Login [user=" + user + ", pass=" + pass + "]";
	}




	public String getUser() {
		return user;
	}




	public void setUser(String user) {
		this.user = user;
	}




	public String getPass() {
		return pass;
	}




	public void setPass(String pass) {
		this.pass = pass;
	}




	
	
	

}
