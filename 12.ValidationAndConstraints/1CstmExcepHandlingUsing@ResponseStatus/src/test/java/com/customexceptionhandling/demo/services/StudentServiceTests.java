package com.customexceptionhandling.demo.services;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.customexceptionhandling.demo.repos.StudentRepository;

public class StudentServiceTests {

	private StudentService service;
	
	@Mock
	private StudentRepository repository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		service = new StudentService(repository);
	}
	
	@Test(expected = NotFoundException.class)
	public void getEmptyOptionalStudentsByNameTest() {
		service.getEmptyOptionalStudentsByName();
	}
}
