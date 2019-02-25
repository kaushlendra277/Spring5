package com.com.junit.tests.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.junit.tests.demo.pojos.Student;
import com.com.junit.tests.demo.repos.StudentRepository;

@Service
public class StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	public List<Student> getStudentsByName(String name, List<Student> students){
		return studentRepository.getStudentsByName(name);
	}
	
}