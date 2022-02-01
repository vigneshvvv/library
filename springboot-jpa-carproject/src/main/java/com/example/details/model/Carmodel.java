package com.example.details.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="cardetails")
public class Carmodel {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message= "the car name should not be blank")
	@Size(min=2, max=20, message="the car name entered is not on correct length")
	private String carname;
	
	@NotBlank(message="the carmodel should not be empty")
	@Size(min=2, max=20, message="the carmodel is not correct format")
	private String modelno;
	
	@NotBlank(message="the car manufactured year should not be blank")
	private Integer year;
	
	@NotBlank(message="the car owner name should not be blank")
	private String Ownername;
	
	@NotBlank(message="the emi starting date should not be blank")
	private String emistartdate;
	
	@NotBlank(message="the emi end date should not be blank")
	private String emienddate;
	
	private String pendingemi;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getModelno() {
		return modelno;
	}

	public void setModelno(String modelno) {
		this.modelno = modelno;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getOwnername() {
		return Ownername;
	}

	public void setOwnername(String ownername) {
		Ownername = ownername;
	}

	public String getEmistartdate() {
		return emistartdate;
	}

	public void setEmistartdate(String emistartdate) {
		this.emistartdate = emistartdate;
	}

	public String getEmienddate() {
		return emienddate;
	}

	public void setEmienddate(String emienddate) {
		this.emienddate = emienddate;
	}

	public String getPendingemi() {
		return pendingemi;
	}

	public void setPendingemi(String pendingemi) {
		this.pendingemi = pendingemi;
	}

	@Override
	public String toString() {
		return "Carmodel [id=" + id + ", carname=" + carname + ", modelno=" + modelno + ", year=" + year
				+ ", Ownername=" + Ownername + ", emistartdate=" + emistartdate + ", emienddate=" + emienddate
				+ ", pendingemi=" + pendingemi + "]";
	}
	
	
	
	

}
