package com.books.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.books.content.Books;

public class Booksdao {
	
	String hostname = "jdbc:mysql://localhost:3306/javatrainingpro";
	String user = "root";
	String password = "Vignesh333#";
	
	Connection conn;
	public Booksdao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(hostname,user,password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//conn = DriverManager.getConnection(hostname,user,password);
	}
	
	public List<Books> getbooklist()
	{
		List <Books> listbooks= new ArrayList <Books> ();
		try {
			Statement st= conn.createStatement();
			ResultSet rs= st.executeQuery("Select * from books");
			
			
			while (rs.next())
			{
				Books book= new Books();
				book.setId(rs.getInt("id"));
				book.setBook_name(rs.getString("book_name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				listbooks.add(book);
				
			}
		}
		catch(SQLException e ) {
			e.printStackTrace();	
		}
		return listbooks;
		
		
		
	}
	
	public int insertbook(Books book)
	{
		
		int status=0;
		try {
			PreparedStatement ps= conn.prepareStatement("insert into books(id,book_name,author,price)values(?,?,?,?)");
			ps.setInt(1, book.getId());
			ps.setString(2, book.getBook_name());
			ps.setString(3, book.getAuthor());
			ps.setInt(4, book.getPrice());
			status = ps.executeUpdate();
			
			System.out.println("insert status :" +status);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public int deleteBook(int id)
	{
		int status=0;
		try {
			PreparedStatement ps= conn.prepareStatement("delete from books where id=?");
			ps.setInt(1, id);
			
			status = ps.executeUpdate();
			
			System.out.println("delete status :" +status);
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
