package com.example.login.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.model.Login;
import com.example.login.service.Loginservice;

@RestController
public class Logincontroller {
	@Autowired
	Loginservice loginservice;
	
	Logger logger= LoggerFactory.getLogger(getClass());
	
	@PostMapping("/loginuser")
	
	public ResponseEntity<String> getuserdetail(@RequestParam String username, @RequestParam String pass) {
		
		logger.info("the login checking was started");
		String status= (loginservice.getlogin(username, pass) != null) ? "success" : "failed";
		
		logger.info("Login status : {}",status);
		
		if(status.equals("success"))
		{
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		
		
		
		
	}
	
	
	
	

}
