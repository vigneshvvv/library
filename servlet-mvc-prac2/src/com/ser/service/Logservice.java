package com.ser.service;

import java.util.List;

import com.serv.dbo.Logindbo;
import com.serv.login.Login;

public class Logservice {
	
	Logindbo ldbo= new Logindbo();
	
public String loginService(Login login)
	
	{
		return ldbo.getlogindetails(login);
		
	}
}
