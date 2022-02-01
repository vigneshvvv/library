package com.example.details.exception;

import java.sql.Date;
import java.time.LocalDateTime;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.errorresponse.ErrorResponse;

@Controller
@ControllerAdvice
public class Controlleradviser extends ResponseEntityExceptionHandler {
	
	Logger logger= LoggerFactory.getLogger(getClass());
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<Object> validationExceptionHandler(ConstraintViolationException ex)
	{
		StringBuilder error= new StringBuilder();
		ex.getConstraintViolations().forEach(e -> error.append(e.getMessageTemplate()+","));;
		logger.info("validation exception :" +error);
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<?> customerNotFoundException(CustomerNotFoundException ex, WebRequest request)
	{
		ErrorResponse errorResponse= new ErrorResponse(LocalDateTime.now(),ex.getMessage());
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}
}
