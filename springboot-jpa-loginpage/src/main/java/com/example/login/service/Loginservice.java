package com.example.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.dao.Logindao;
import com.example.login.model.Login;

@Service


public class Loginservice {
	
	@Autowired
	Logindao logindao;
	
	public Login getlogin(String username, String pass)
	{
		return logindao.getlogin(username, pass);
	}

}
