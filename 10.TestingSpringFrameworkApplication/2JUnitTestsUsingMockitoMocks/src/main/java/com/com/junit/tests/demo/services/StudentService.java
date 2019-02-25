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
	
	public List<String> getStudentNames(){
		return studentRepository.getStudentNames();
	}
	
	public List<Student> getStudentsByName(String name){
		return studentRepository.getStudentsByName(name);
	}
	
	// this is to test it will be mocked when we set up mocks
	// as equal matcher i.e
	// when(repository.getStudentsByName(Mockito.eq("hard-coded-name"))).thenReturn(mockResponse);
	public List<Student> getStudentsByHardCodedName(){
		return studentRepository.getStudentsByName("hard-coded-name");
	}
}