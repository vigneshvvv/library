package com.example.details.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.details.model.CustomerDetails;

public interface CustomerRepo extends JpaRepository<CustomerDetails,Integer>{
	
	@Query("select customerdetail from CustomerDetails customerdetail where customerdetail.mobileno= :mobileno")
    public CustomerDetails getbymobileno(@Param("mobileno") String mobileno);
	
	
	@Query("select customerdetail from CustomerDetails customerdetail where customerdetail.emailid= :emilid")
	public CustomerDetails getbyemialid(@Param ("emilid") String emailid);
}
