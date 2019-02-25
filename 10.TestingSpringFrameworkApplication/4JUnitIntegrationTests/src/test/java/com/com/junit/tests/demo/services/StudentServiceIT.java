package com.com.junit.tests.demo.services;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.com.junit.tests.demo.pojos.Student;
import com.com.junit.tests.demo.repos.StudentRepository;

@RunWith(SpringRunner.class)
public class StudentServiceIT {

	private StudentService service;
	private StudentRepository repository;
	
	@Before
	public void setUp() {
		this.repository = new StudentRepository();
		this.service = new StudentService(repository);
	}
	
	@Test
	public void getStudentNamesTest() {
		List<String> names = service.getStudentNames();
		assertTrue(names.size() == 3);
	}
	
	@Test
	public void getStudentsByNameTest() {
		List<Student> students = service.getStudentsByName("name1");
		assertFalse(students.isEmpty());
		assertTrue(students.size() == 1);
	}
	
	@Test
	public void getStudentsByHardCodedNameTest() {
		List<Student> students = service.getStudentsByHardCodedName();
		assertTrue(students.isEmpty());
	}
}
