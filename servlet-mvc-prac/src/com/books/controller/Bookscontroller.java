package com.books.controller;

import java.awt.print.Book;
import java.util.List;

import com.books.content.Books;
import com.books.dao.Booksdao;

public class Bookscontroller {
	
	Booksdao bookdao= new Booksdao();
	
	public List <Books> getbookdetail()
	{
		return bookdao.getbooklist();
		
	}
	
	public boolean insertbook(Books book)
	
	{
		book.setId((int) ((Math.random() * (100 - 20)) + 20));
		
		return (bookdao.insertbook(book)>0)?true: false;
		
	}
	
	public boolean deleteBook(int id)
	{
		return (bookdao.deleteBook(id)>0)? true : false;
	}
	

}
