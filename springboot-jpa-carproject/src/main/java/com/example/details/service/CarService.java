package com.example.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.details.dao.Cardao;
import com.example.details.model.Carmodel;

@Service
public class CarService {
	@Autowired
	Cardao cardao;
	public List<Carmodel> getdetails()
	{
		return cardao.getdetails();
	}
	
	public Carmodel getbycarname(String carname)
	{
		return cardao.getbycarname(carname);
	}
	
	public Carmodel insertcar(Carmodel carmodel)
	{
		return cardao.insertcardetails(carmodel);
	}
	
	public Carmodel getbyownername(String ownername)
	{
		return cardao.getbyownername(ownername);
	}
	
	public Carmodel deletebycarname(String carname)
	{
		return cardao.deletebycarname(carname);
	}

}
