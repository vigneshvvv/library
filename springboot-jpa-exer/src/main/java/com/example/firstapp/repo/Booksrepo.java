package com.example.firstapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.firstapp.model.Books;

@Repository
public interface Booksrepo extends JpaRepository<Books,Integer> {
	
	@Query("select b.author from Books b ")
	public List<String> getauthors();
	
	@Query("select book.bookName from Books book")
	public List<String> getbookname();
	

	

}
