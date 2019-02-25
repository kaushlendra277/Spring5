package com.customexceptionhandling.demo.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customexceptionhandling.demo.pojos.Student;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class StudentController {

	@PostMapping("post")
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(student);
	}
	
	@PostMapping("post/debug")
	public ResponseEntity<Student> createStudent(
			@Valid @RequestBody Student student, 
			BindingResult bindingResult){
		bindingResult.getAllErrors().forEach(pojoError ->{
			log.error(pojoError.toString());
		});
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(student);
	}
}
