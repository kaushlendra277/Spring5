package com.customexceptionhandling.demo.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.customexceptionhandling.demo.pojos.Error;
import com.customexceptionhandling.demo.services.NotFoundException;
import com.customexceptionhandling.demo.services.StudentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("{error}")
	public ResponseEntity<Optional<String>> getEmptyOptionalStudentsByName(@PathVariable("error")String error){
		Optional<String> resources = studentService.getEmptyOptionalStudentsByName(error);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(resources);
	}
	
	@GetMapping("/studentById/{id}")
	public ResponseEntity<Integer> getStudentsById(@PathVariable("id")String id){
		Integer studentId = Integer.parseInt(id);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(studentId);
	}
	
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
				.body(new Error(HttpStatus.BAD_REQUEST, ex.toString()));
	}
}
