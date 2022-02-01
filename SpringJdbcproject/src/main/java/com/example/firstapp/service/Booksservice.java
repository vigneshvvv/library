package com.example.firstapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.firstapp.dao.Booksdao;
import com.example.firstapp.dao.Booksdaoimpl;
import com.example.firstapp.model.Books;
@Component
public class Booksservice {
	
	
	@Autowired
	Booksdao booksdao;
	
	public Books getBookde()
	{
		return booksdao.getbooklist();
	}
	

}
