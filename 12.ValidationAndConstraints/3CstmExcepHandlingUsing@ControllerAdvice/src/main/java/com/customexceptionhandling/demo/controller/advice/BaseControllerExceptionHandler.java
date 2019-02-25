package com.customexceptionhandling.demo.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.customexceptionhandling.demo.pojos.Error;
import com.customexceptionhandling.demo.services.NotFoundException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class BaseControllerExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND) // if we don't use this status code will be 200
	@ExceptionHandler(value = NotFoundException.class)
	public ResponseEntity<Error> handleNotFoundException(Exception ex) {
		log.error(ex.getMessage());
		return ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(new Error(HttpStatus.NOT_FOUND, ex.getMessage()));
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST) // if we don't use this status code will be 200
	@ExceptionHandler(value = NumberFormatException.class)
	public ResponseEntity<Error> handleNumberFormatException(Exception ex) {
		log.error(ex.getMessage());
		return ResponseEntity
				.status(HttpStatus.BAD_REQUEST)
				.body(new Error(HttpStatus.BAD_REQUEST, ex.getMessage()));
	}

}
