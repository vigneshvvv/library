package com.example.details.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.details.exception.CustomerNotFoundException;
import com.example.details.exception.CustomerNotfoundException;
import com.example.details.model.CustomerDetails;
import com.example.details.service.DetailsService;

@CrossOrigin(origins="*")
@RestController
public class DetailsController {
	
	
	@Autowired
	DetailsService detailsService;
	
	Logger logger= LoggerFactory.getLogger(getClass());
	
	@PostMapping("/finddetails")
	public CustomerDetails getbymobileno(@RequestParam String mobileno ) throws CustomerNotFoundException 
	{
		logger.info("getting user information using mobileno has started{}", mobileno);
		CustomerDetails details= detailsService.getbymobilenum(mobileno);
		
		if(details != null)
		{
			logger.info("the user is found seccessfully");
			return details;
		}
		
		else
		{
			
			logger.info("the user was not found");
			throw new CustomerNotFoundException("the customer was not found in this mobile no");
			
		}
		

	}
	
	
	@GetMapping("/detailsid/{id}")
	public CustomerDetails getbyid(@PathVariable Integer id)
	{
		return detailsService.getbyid(id);
	}
	
	@GetMapping("/findbyemail")
	
	public CustomerDetails getbyemailid(@RequestParam String emailid)
	{
		logger.info("the process of finding user by using email id was started"); 
		CustomerDetails details= detailsService.getbyemailid(emailid);
		
		if(details != null)
			
		{
			logger.info("the user was found successfully");
			return details;
			
		}
		else
		{
			logger.info("sorry the user was was not found please register again");
			return null;
		}
	}
	
	@PostMapping(value= "/insertuser", consumes= "application/json", produces="application/text")
	public ResponseEntity<String> insertuser(@RequestBody CustomerDetails customerdetails)
	{
		logger.info("the insert customer details was initiated");
		String status= (detailsService.insertdetail(customerdetails)!= null) ? "success" : "failed";
		logger.info("the status of the insert customer information :{}",status);
		
		if(status.equals("success"))
		{
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
					
		}
		else
		{
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	@GetMapping("alluser")
	public List<CustomerDetails> getalluser()
	{
		return detailsService.getalluser();
	}
	

}
