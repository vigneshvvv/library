package bookdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookdetails.Books;

public class Bookdatabase {
	
	String hostname = "jdbc:mysql://localhost:3306/javatrainingpro";
	String user = "root";
	String password = "Vignesh333#";
	
	Connection conn;
	
	public void getbooklist() throws SQLException
	{
		try {
                 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(hostname,user,password);
			Statement st= conn.createStatement();
			ResultSet rs = st.executeQuery("select * from books");
			
			List <Books> bookslist= new ArrayList <Books>();
			
			while(rs.next())
				
			{
				Books book = new Books();
				book.setId(rs.getInt("id"));
				book.setBook_name(rs.getString("book_name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				
				bookslist.add(book);	
			}
			System.out.println(bookslist.toString());
			conn.close();
			
			
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			
		}
		
		finally
		{
			conn.close();
		}
		
	}
	
	public void insertbooks(Books book)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(hostname,user,password);
			PreparedStatement ps = conn.prepareStatement("insert into books (id,book_name,author,price )values(?,?,?,?)");
			ps.setInt(1,book.getId());
			ps.setString(2,book.getBook_name());
			ps.setString(3,book.getAuthor());
			ps.setInt(4,book.getPrice());
			
			boolean status = ps.execute();
			System.out.println("status is"+status);
			getbooklist();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	//public void updatebooklist(Books book,String column)
	//{
		//try
		//{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			//conn = DriverManager.getConnection(hostname,user,password);
			//String query= "update books set #COLUMN# =? where id=?";
			//query= query.replace("#COLUMN#", column);
			//PreparedStatement ps= conn.prepareStatement(query);
			
			//switch(column)
			//{//
			//case "book_name":
					
			//}
		//}/
	//}

}
