package com.example.details.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.details.model.CustomerDetails;
import com.example.details.repo.CustomerRepo;

@Component
public class Detailsdao {
	
	@Autowired
	CustomerRepo customerRepo;
	
	public CustomerDetails getbymobileno(String mobileno )
	{
		return customerRepo.getbymobileno(mobileno);
	}
	
	public CustomerDetails getbyid(Integer id)
	{
		return customerRepo.getById(id);
	}
	
	public CustomerDetails getbyemailid(String emailid)
	{
		return customerRepo.getbyemialid(emailid);
	}
	
	public CustomerDetails insertdetails(CustomerDetails customerdetails)
	{
		return customerRepo.save(customerdetails);
	}
	
	public List<CustomerDetails> getalluser()
	{
		return customerRepo.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
