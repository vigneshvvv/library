package com.example.details.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.details.exception.DetailsNotFoundException;
import com.example.details.model.Carmodel;
import com.example.details.service.CarService;

@RestController
public class CarController {
	
	
	Logger logger= LoggerFactory.getLogger(getClass());
	@Autowired
	CarService carService;
	@GetMapping("alldetails")
	public List<Carmodel> getalluser()
	{
		return carService.getdetails();
	}
	
	@GetMapping("/carname")
	public Carmodel getbycarname(@RequestParam String carname) throws DetailsNotFoundException
	{
		logger.info("getting the details by using the carname was started");
		Carmodel stat= carService.getbycarname(carname);
		
		if(stat!=null)
		{
			logger.info("The catdetails was found successfully");
			return stat;
		}
		else
		{
			logger.info("the car model was not found please register it");
			throw new DetailsNotFoundException("the details was not found on this carname");
		}
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> inserdetail(@RequestBody Carmodel carmodel)
	{
		logger.info("the car details insert method was actuated");
		String status= (carService.insertcar(carmodel)!= null)? "success":"failed";
		
		if(status.equals("success"))
		{
			logger.info("the insert status of cardetails was successful");
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		else
		{
			logger.info("the insert status of cardetails was failed");
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/byownername")
	public Carmodel getbyownername(@RequestParam String ownername) throws DetailsNotFoundException
	{
		logger.info("fetching the details with ownername wsas started");
		Carmodel stat= carService.getbyownername(ownername);
		
		if(stat!=null)
		{
			logger.info("the car details was found successfully");
			return stat;
		}
		else
		{
			logger.info("the car details was not found with the owner name");
			throw new DetailsNotFoundException("the car details on this owner name was not found");
		}
	}
	@PostMapping("/deletebyname")
	public ResponseEntity<String> deletebycarname(@RequestParam String carname)
	{
		logger.info("the deleting the car details by using carname was started");
		String status= (carService.deletebycarname(carname)!= null)? "success":"failed";
		
		if(status.equals("success"))
		{
			logger.info("the delete process of the details by carname is successfull");
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		else
		{
			logger.info("the delete status was failed may be the user may not present");
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		
	}

}
