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
		

	}

}
