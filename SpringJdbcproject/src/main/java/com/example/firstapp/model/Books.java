package com.example.firstapp.model;

public class Books {
	private Integer id;
	private String Book_name;
	private String author;
	private Integer price;
	public Books(Integer id, String book_name, String author, Integer price) {
		super();
		this.id = id;
		this.Book_name = book_name;
		this.author = author;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
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
