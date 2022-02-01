package com.example.firstapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.firstapp.model.Login;
import com.example.firstapp.repo.Loginrepo;
import com.example.firstapp.service.Loginservice;

@RestController
public class Logincontroller {
	
	@Autowired
	Loginservice loginservice;
	
	@PostMapping(value="/insert")
	public ResponseEntity<String> insertuser(@RequestBody Login login)
	{
		String status= (loginservice.insertusers(login) != null) ? "success" : "failed";
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/details")
	
	public List<Login> getuser()
	{
		return loginservice.getuser();
	}
	
	@PostMapping("/logindetails")
	public ResponseEntity<String> getuser(@RequestParam String username,@RequestParam  String pass)
	{ 
		String status= (loginservice.getuserd( username, pass)!= null) ? "success" : "failed";
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
	}
	
//	@Autowired
//	Loginrepo loginrepo;
//	@PostMapping("/logindetails")
//	@ResponseBody
//	public Login getuser(@RequestParam ("username") String username)
//	{ 
//	
//		return loginrepo.findByusername(username);
		
//		if(log != 0)
//		{
//			mv.addObject("the login user is found")
//		}
//		else
//		{
//			
//		}
//		try {
//			loginrepo.findByusername(username);
//		}
//		catch (Exception e) {
//			System.out.println("user not found");
//		}
//		return"login";
//		
	}
	
	
	


