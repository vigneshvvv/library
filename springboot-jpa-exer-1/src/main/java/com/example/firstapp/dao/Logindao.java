package com.example.firstapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.firstapp.model.Login;
import com.example.firstapp.repo.Loginrepo;

@Component
public class Logindao {
	
	@Autowired
	Loginrepo loginrepo;
	public Login insertuser(Login login)
	{
		return loginrepo.save(login);
	}
	
	public List<Login> getuser()
	{
		return loginrepo.findAll();
	}
//	
//	public Login finduser(String username)
//	
//	{
//		
//	}

}
