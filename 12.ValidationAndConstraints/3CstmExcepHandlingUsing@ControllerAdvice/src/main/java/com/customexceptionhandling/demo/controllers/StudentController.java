package com.customexceptionhandling.demo.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customexceptionhandling.demo.services.StudentService;

@RestController
@RequestMapping("/")
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
}
