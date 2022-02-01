package com.example.firstapp.model;

import java.sql.ResultSet;
import com.example.firstapp.model.Books;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BooksMapper implements RowMapper<Books> {
	
	@Override
	public Books mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Books book = new Books (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		return book;
	}

}
