package com.example.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.login.model.Login;

@Repository
public interface Loginrepo extends JpaRepository<Login,Integer> {
	
	@Query("Select login from Login login where login.username= :usr and login.pass= :pass")
	public Login getbyuser(@Param(value="usr")String username , @Param(value="pass") String pass);

}
