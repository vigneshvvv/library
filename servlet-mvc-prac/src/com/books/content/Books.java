package com.books.content;

public class Books {
	private int id;
	private String book_name;
	private String author;
	private int price;

	public Books() {
		super();
	}

	public Books(int id, String book_name, String author, int price) {
		super();
		this.id = id;
		this.book_name = book_name;
		this.author = author;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Books [id=" + id + ", book_name=" + book_name + ", author=" + author + ", price=" + price + "]";
	}
	

}
