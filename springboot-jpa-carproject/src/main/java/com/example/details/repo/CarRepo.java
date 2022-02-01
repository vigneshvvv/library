package com.example.details.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.details.model.Carmodel;

public interface CarRepo extends JpaRepository<Carmodel,Integer> {
	
	@Query("select carmodel from Carmodel carmodel where carmodel.carname = :carname ")
	public  Carmodel getbycarname(@Param("carname") String carname);
	
	@Query("select carmodel from Carmodel carmodel where carmodel.ownername= :ownername")
	public Carmodel getbyownername(@Param("ownername") String ownername);
	
	@Query("delete carmodel from Carmodel carmodel where carmodel.carname= :carname")
	public Carmodel deletebycarname(@Param("carname") String carname);

}
