package com.example.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstapp.model.Books;
import com.example.firstapp.service.Booksservice;

@RestController
public class Bookscontroller {
	
	@Autowired
	Booksservice bookservice;
	
	@GetMapping(value= "/books")
	@ResponseBody
	
	public Books getbook()
	{
		return bookservice.getBookde();
		
	}

}
