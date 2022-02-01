package com.example.firstapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.firstapp.model.Login;

public interface Loginrepo extends JpaRepository<Login,Integer> {

	@Query("SELECT login from Login login where login.username= :user" )
	public Login findByusername(@Param(value = "user") String username);

	
	

	

}
