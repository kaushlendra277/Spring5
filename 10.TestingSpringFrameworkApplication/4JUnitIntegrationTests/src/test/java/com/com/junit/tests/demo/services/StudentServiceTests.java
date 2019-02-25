package com.com.junit.tests.demo.services;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.com.junit.tests.demo.pojos.Student;
import com.com.junit.tests.demo.repos.StudentRepository;

public class StudentServiceTests {
	
	private StudentService services;
	
	@Mock
	private StudentRepository repository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		services = new StudentService(repository);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getStudentNamesTest() {
		// GIVEN
		List<String> mockResponse = new ArrayList<String>();
		mockResponse.add("mockName1");
		mockResponse.add("mockName2");
		
		when(repository.getStudentNames())
			.thenReturn(mockResponse);
		// WHEN
		List<String> names = services.getStudentNames();
		
		// THEN
		assertTrue(names.size() == mockResponse.size());
		verify(repository,times(1)).getStudentNames();
	}

	@Test
	public void getStudentsByNameTest() {
		// GIVEN
		List<Student> mockResponse = new ArrayList<Student>();
		mockResponse.add(new Student("mockId1", "mockName1"));
		mockResponse.add(new Student("mockId2", "mockName2"));
		
		when(repository.getStudentsByName(Mockito.anyString()))
			.thenReturn(mockResponse);
		// WHEN
		List<Student> students = services.getStudentsByName("");
		
		// THEN
		assertTrue(students.size() == mockResponse.size());
		verify(repository,times(1)).getStudentsByName("");
	}
	
	@Test
	public void getStudentsByHardCodedNameTest() {
		// GIVEN
		List<Student> mockResponse = new ArrayList<Student>();
		mockResponse.add(new Student("mockId1", "mockName1"));
		mockResponse.add(new Student("mockId2", "mockName2"));
		
		when(repository.getStudentsByName(Mockito.eq("hard-coded-name")))
			.thenReturn(mockResponse);
		// WHEN
		List<Student> students = services.getStudentsByHardCodedName();
		
		// THEN
		assertTrue(students.size() == mockResponse.size());
		verify(repository,times(1)).getStudentsByName(Mockito.eq("hard-coded-name"));
	}
}
