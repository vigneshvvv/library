package collections;

public class Bookdetails {
	
	private String bookname;
	private int date;
	private int price;
	Author author;
	private int id;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
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
	@Override
	public String toString() {
		return "Bookdetails [bookname=" + bookname + ", date=" + date + ", price=" + price + ", author=" + author
				+ ", id=" + id + "]";
	}
	
	
	

}
