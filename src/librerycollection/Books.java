package librerycollection;


public class Books {
	private int id;
	private String bookname;
	 private int price;
	 private Author author;
	 
	 
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//public String getAuthor() {
		//return author;
	//}
	//public void setAuthor(String author) {
		//this.author = author;
	//}
	@Override
	public String toString() {
		return "books [id=" + id + ", bookname=" + bookname + ", price=" + price + ", author=" + author + "]";
	}

}
