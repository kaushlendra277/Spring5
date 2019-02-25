package com.customexceptionhandling.demo.pojos;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

public class Error {
	
	@Getter
	@Setter
	private HttpStatus httpStatus ;
	@Getter
	@Setter
	private String errorMessage;
	
	public Error(HttpStatus httpStatus, String errorMessage) {
		super();
		this.httpStatus = httpStatus;
		this.errorMessage = errorMessage;
	}
	
	
}
