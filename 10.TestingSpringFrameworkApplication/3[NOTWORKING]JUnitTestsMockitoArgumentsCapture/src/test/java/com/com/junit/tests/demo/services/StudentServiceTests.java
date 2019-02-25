package com.com.junit.tests.demo.services;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
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
	public void getStudentsByNameTest() {
		// GIVEN
		List<Student> mockResponse = new ArrayList<Student>();
		mockResponse.add(new Student("mockId1", "mockName1"));
		mockResponse.add(new Student("mockId2", "mockName2"));
		
		when(repository.getStudentsByName(Mockito.anyString()))
			.thenReturn(mockResponse);
		ArgumentCaptor<List<Student>> argumentCaptor = ArgumentCaptor.forClass(List.class);
		// WHEN
		List<Student> students = services.getStudentsByName("", argumentCaptor.capture());
		
		// THEN
		assertTrue(students.size() == mockResponse.size());
		verify(repository,times(1)).getStudentsByName("");
		List<Student> studentsFromAC = argumentCaptor.getValue();
	}
}
