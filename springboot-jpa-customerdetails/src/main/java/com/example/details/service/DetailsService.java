package com.example.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.details.dao.Detailsdao;
import com.example.details.model.CustomerDetails;

@Service
public class DetailsService {
	
	@Autowired
	Detailsdao detailsdao;
	
	public CustomerDetails getbymobilenum(String mobileno)
	{
		return detailsdao.getbymobileno(mobileno);
	}
	
	public CustomerDetails getbyid(Integer id)
	{
		return detailsdao.getbyid(id);
	}
	
	public CustomerDetails getbyemailid(String emailid)
	{
		return detailsdao.getbyemailid(emailid);
	}
	
	public CustomerDetails insertdetail(CustomerDetails customerdetails)
	{
		return detailsdao.insertdetails(customerdetails);
	}
	
	public List<CustomerDetails> getalluser()
	{
		return detailsdao.getalluser();
	}
	
	
	
	
	
	

}
