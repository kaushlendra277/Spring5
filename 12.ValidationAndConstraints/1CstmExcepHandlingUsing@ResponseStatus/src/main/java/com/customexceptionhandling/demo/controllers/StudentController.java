package com.customexceptionhandling.demo.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customexceptionhandling.demo.services.StudentService;

@RestController
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping
	public ResponseEntity<Optional<String>> getEmptyOptionalStudentsByName(){
		Optional<String> resources = studentService.getEmptyOptionalStudentsByName();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(resources);
	}
}
