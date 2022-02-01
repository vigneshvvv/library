package com.example.details.errorresponse;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Errorresponse {
	private LocalDateTime Timestamp;
	private String messsage;
	public Errorresponse(LocalDateTime timestamp, String messsage) {
		super();
		Timestamp = timestamp;
		this.messsage = messsage;
	}
	public LocalDateTime getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		Timestamp = timestamp;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	
	

}
