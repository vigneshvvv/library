package com.example.firstapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstapp.model.Books;
import com.example.firstapp.service.BooksService;

@CrossOrigin(origins="*")
@RestController
public class Bookscontroller {
	
	@Autowired
	BooksService booksService;
	
	
	Logger logger=LoggerFactory.getLogger(getClass());
	
	@GetMapping(value="/book")
	public List<Books> getbooklistall()
	{
		logger.info("the getbook is triggered");
		return booksService.getbooklist();
	}
	
	@GetMapping("/book/{id}")
	public Books getbookbyid(@PathVariable Integer id)
	
	{
		return booksService.getbookbyied(id);
	}
	
	@PostMapping("/book")
	
	public ResponseEntity<String> insertbooks(@RequestBody Books book)
	{
		logger.info("the insert book is initiated {}", book);
		
		String status= (booksService.insertbooks(book) != null) ? "Success" : "Failed";
		logger.info("the status is {}" , status);
		
		return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/author")
	public List<String> getauthor()
	{
		return booksService.getauthor();
	}
	
	@GetMapping("/bookname")
	public List<String> getbookname()
	{
		return booksService.getbookname();
	}
	
	@GetMapping("/deletebook/{id}")
	public void deletebook(@PathVariable Integer id)
	{
		booksService.deletebook(id);
	}

	
}
