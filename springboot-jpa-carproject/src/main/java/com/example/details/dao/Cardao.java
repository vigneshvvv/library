package com.example.details.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.details.model.Carmodel;
import com.example.details.repo.CarRepo;

@Component
public class Cardao {
	
	@Autowired
	CarRepo carRepo;
	public List<Carmodel> getdetails(){
		return carRepo.findAll();
	}
	
	public Carmodel getbycarname(String carname)
	{
		return carRepo.getbycarname(carname);
	}
	
	public Carmodel insertcardetails(Carmodel carmodel)
	{
		return carRepo.save(carmodel);
	}
	
	public Carmodel getbyownername(String ownername)
	{
		return carRepo.getbyownername(ownername);
	}
	
	public Carmodel deletebycarname(String carname)
	{
		return carRepo.deletebycarname(carname);
	}
	

}
