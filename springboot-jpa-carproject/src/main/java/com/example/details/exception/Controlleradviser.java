package com.example.details.exception;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.details.errorresponse.Errorresponse;

@ControllerAdvice
public class Controlleradviser extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(DetailsNotFoundException.class)
	public ResponseEntity<?> detailsNotFoundException(DetailsNotFoundException ex,WebRequest request)
	{
		Errorresponse error = new Errorresponse(LocalDateTime.now(),ex.getMessage());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

}
