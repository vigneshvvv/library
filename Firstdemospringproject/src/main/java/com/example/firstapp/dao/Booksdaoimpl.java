package com.example.firstapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.firstapp.model.Books;
import com.example.firstapp.model.BooksMapper;
@Component
public class Booksdaoimpl implements Booksdao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Books getbooklist()
	{
		Books book = jdbcTemplate.queryForObject("select * from books where id=2", new BooksMapper());
		
		return book;
	}

	

}
