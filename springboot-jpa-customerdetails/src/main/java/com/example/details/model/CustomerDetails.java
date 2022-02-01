package com.example.details.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="details")
public class CustomerDetails {
	
	@Id
	@GeneratedValue (strategy= GenerationType.IDENTITY)
	private Integer custId;
	
	@NotBlank(message= "the custname should not be blank")
	@Size(min= 2, max= 20, message="the customer name size is not valid")
	private String custName;
	
	@NotBlank(message="the mobilenumber should not be blank")
	@Pattern(regexp= "^\\d{10}$", message="the length of mobile number is not correct")
	private String mobileno;
	
	@NotBlank
	@Pattern(regexp="^\\d{10}$" , message="the alternate mobilenumber length is not correct")
	private String alternatemobileno;
	
	@NotBlank(message="the emailid should not be blank")
	private String emailid;
	
	@NotBlank(message="the address should not be blank")
	private String address1;
	
	private String address2;
	
	@NotBlank(message= "the city should not be blank")
	private String city;
	private String state;
	

	private Integer pincode;
	
	public CustomerDetails()
	{}
	
	public CustomerDetails(Integer custId, String custName, String mobileno, String alternatemobileno, String emilid,
			String address1, String address2, String city, String state, Integer pincode) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.mobileno = mobileno;
		this.alternatemobileno = alternatemobileno;
		this.emailid = emailid;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}



	public Integer getCustId() {
		return custId;
	}



	public void setCustId(Integer custId) {
		this.custId = custId;
	}



	public String getCustName() {
		return custName;
	}



	public void setCustName(String custName) {
		this.custName = custName;
	}



	public String getMobileno() {
		return mobileno;
	}



	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}



	public String getAlternatemobileno() {
		return alternatemobileno;
	}



	public void setAlternatemobileno(String alternatemobileno) {
		this.alternatemobileno = alternatemobileno;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmilid(String emailid) {
		this.emailid = emailid;
	}



	public String getAddress1() {
		return address1;
	}



	public void setAddress1(String address1) {
		this.address1 = address1;
	}



	public String getAddress2() {
		return address2;
	}



	public void setAddress2(String address2) {
		this.address2 = address2;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Integer getPincode() {
		return pincode;
	}



	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	
	
	
	
	
	
	

}
