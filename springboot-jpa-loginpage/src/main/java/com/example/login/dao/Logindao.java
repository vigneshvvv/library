package com.example.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.login.model.Login;
import com.example.login.repo.Loginrepo;


@Component
public class Logindao {
	
	@Autowired
	Loginrepo loginrepo;

	public Login getlogin(String username,String pass)
	{
		return loginrepo.getbyuser(username, pass);
	}

}
