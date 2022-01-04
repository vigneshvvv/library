package com.example.firstapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.firstapp.model.Books;
import com.example.firstapp.repo.Booksrepo;

@Component
public class BooksDao {
	
	@Autowired
	Booksrepo booksrepo;
	
	public List<Books> getbooklist()
	{
		return booksrepo.findAll();
	}
	
	public Books getbookbyid(Integer id)
	{
		return booksrepo.getById(id);
	}
	
	public Books insertbook(Books book)
	{
		return booksrepo.save(book);
	}
	
	public List<String> getauthorlist()
	{
		return booksrepo.getauthors();
	}
	
	public List<String> getbookname()
	{
		return booksrepo.getbookname();
	}
	
	public void deleteby(Integer id)
	{
		 booksrepo.deleteById(id);
	}
	

}
