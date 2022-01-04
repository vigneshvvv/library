package com.example.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstapp.dao.Logindao;
import com.example.firstapp.model.Login;

@Service
public class Loginservice {
	
	@Autowired
	Logindao logindao;
	
	public Login insertusers(Login login)
	{
		return logindao.insertuser(login);
	}
	
	public List<Login> getuser()
	{
		return logindao.getuser();
	}
	
//	public Login getuserd(String username,String pass)
//	{
//		return logindao.finduser( username, pass);
//	}

}
