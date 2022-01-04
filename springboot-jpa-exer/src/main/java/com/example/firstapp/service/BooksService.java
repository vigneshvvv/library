package com.example.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.firstapp.dao.BooksDao;
import com.example.firstapp.model.Books;

@Service
public class BooksService {
	
	@Autowired
	BooksDao booksDao;
	
	public List<Books> getbooklist()
	{
		return booksDao.getbooklist();
	}
	
	public Books getbookbyied(Integer id)
	{
		return booksDao.getbookbyid(id);
	}
	
	public Books insertbooks(Books book)
	{
		return booksDao.insertbook(book);
	}
	
	public List<String> getauthor()
	{
		return booksDao.getauthorlist();
	}
	
	public List<String> getbookname()
	{
		return booksDao.getbookname();
	}
	
	public void deletebook(Integer id)
	{
		booksDao.deleteby(id);
	}



}
