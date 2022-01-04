package com.example.firstapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "books")
public class Books {
	
	@Id
	private Integer id;
	private String  bookName;
	private String author;
	private Integer price;
	
	public Books()
	{
		
	}
	
	public Books(Integer id, String bookName, String author, Integer price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
	
	

}
