package com.serv.dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.serv.login.Login;

public class Logindbo {
	
	String hostname = "jdbc:mysql://localhost:3306/loginform";
	String user = "root";
	String password = "Vignesh333#";
	Connection conn;
	
	
	public Logindbo() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(hostname,user,password);
			}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	
	public String getlogindetails(Login login){
		
		int status= 0;
		String loginStatus = "Failed";
		//List <Login> mylogin= new ArrayList<Login>();
		try
		{
			//Statement st= conn.createStatement();
			//ResultSet rs= st.executeQuery("select * from login where username = ? and password = ?");
			//ResultSet sr= st.executeQuery("select password from login");
			//Login lg= new Login();
//			Statement st= conn.createStatement();
//			ResultSet rs= st.executeQuery("select * from login where username= ? and password= ?");
//			rs.setString(1, login.getUser());
//			rs.setString(2, login.getPass());
//			status= ps.executeUpdate();
			
			PreparedStatement ps= conn.prepareStatement("select * from login where username= ? and password= ?");
			ps.setString(1, login.getUser());
			ps.setString(2, login.getPass());
			ResultSet rs= ps.executeQuery();
			System.out.println("status"+status);
			
			
			
			while(rs.next())
			{
				loginStatus = "Success";
				return loginStatus;
			}
			
			return loginStatus;
					
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return loginStatus;
		
		
	}
}

