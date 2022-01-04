package com.example.firstapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.firstapp.model.Login;

public interface Loginrepo extends JpaRepository<Login,Integer> {

	Login findByusername(String username);

	
	

	

}
