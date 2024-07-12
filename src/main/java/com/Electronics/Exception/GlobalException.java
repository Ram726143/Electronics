package com.Electronics.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(BrandNotFound.class)
	public ResponseEntity<Object>displayThis(BrandNotFound b){
		return new ResponseEntity<>("error occurs",HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object>displayThis(PriceNotFoundException b){
		return new ResponseEntity<>("error occurs",HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<Object>displayThis(NullPointerException b){
		return new ResponseEntity<>("no value found",HttpStatus.NOT_FOUND);
		
		
	}
	@ExceptionHandler(InternalServerError.class)
	public ResponseEntity<Object>displayThis(InternalServerError c){
		return new ResponseEntity<>("no network",HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(BrandAllNotFoundException.class)
	public ResponseEntity<Object>displayThis(BrandAllNotFoundException b){
		return new ResponseEntity<>("null pointer Exception",HttpStatus.NOT_FOUND);
		
	}
	
	@ExceptionHandler(BrandNotFounds.class)
	public ResponseEntity<Object>getthis(BrandNotFounds a) {
		return new ResponseEntity<Object>("Brand not found",HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
	}
	
	
	
	

}
