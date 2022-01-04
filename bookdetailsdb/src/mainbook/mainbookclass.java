package mainbook;

import java.sql.SQLException;
import java.util.Scanner;

import bookdao.Bookdatabase;
import bookdetails.Books;

public class mainbookclass {

	public static void main(String[] args) throws SQLException {
		Bookdatabase bookbase= new Bookdatabase();
		bookbase.getbooklist();
		Scanner se= new Scanner(System.in);
		System.out.println("please enter the id you want to insert");
		int id= se.nextInt();
		
		System.out.println("please enter the Book_name");
		String bookname= se.next();
		System.out.println("please enter the author name");
		String author= se.next();
		System.out.println("please enter the price of the book");
		int price= se.nextInt();
		
		Books book= new Books();
		book.Books(id,bookname,author,price);
		bookbase.insertbooks(book);
		
		
		Books updatebook= new Books();
		
		System.out.println("please enter the id you want to update");
		int idup= se.nextInt();
		updatebook.setId(idup);
		
		System.out.println("please enter the field you want to update 1/book_name 2/author,3/price");
		int field= se.nextInt();
		
		String column= null;
		
		switch(field)
		{
		case 1:
			System.out.println("please enter the bookname you want to update");
			String booknew= se.next();
			updatebook.setBook_name(booknew);
			column = "Book_name";
			break;
			
		case 2:
			System.out.println("please enter the auhtor name want to update");
			String authorup= se.next();
			updatebook.setAuthor(authorup);
			column = "author";
			break;
			
		case 3:
			System.out.println("please enter the price you want to update");
			int priceup= se.nextInt();
			updatebook.setPrice(priceup);
			column = "price";
			break;
			
		}
		

	}

}
