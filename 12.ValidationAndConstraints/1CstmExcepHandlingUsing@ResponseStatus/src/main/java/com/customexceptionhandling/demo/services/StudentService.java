package com.customexceptionhandling.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customexceptionhandling.demo.repos.StudentRepository;

@Service
public class StudentService {

	private StudentRepository repository;

	@Autowired
	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	
	public Optional<String> getEmptyOptionalStudentsByName(){
		Optional<String> response = this.repository.getEmptyOptionalStudentsByName();
		if(!response.isPresent()) throw new NotFoundException("optional is empty");
		else return response;
	}
	
}
