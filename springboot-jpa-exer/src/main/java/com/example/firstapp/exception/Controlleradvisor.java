package com.example.firstapp.exception;

import javax.validation.ConstraintViolationException;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class Controlleradvisor extends ResponseEntityExceptionHandler {
	
	Logger logger= Logger.getLogger(getClass());
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> validationExceptionhandler(ConstraintViolationException ex )
	{
//		String err= ex.getConstraintViolations().toString();
		StringBuilder errmsg= new StringBuilder();
		ex.getConstraintViolations().forEach(e -> errmsg.append(e.getMessageTemplate()+","));
		
		logger.info("exception is" +errmsg);
		
		
		return new ResponseEntity<> (errmsg,HttpStatus.BAD_REQUEST);
	}
	

}
