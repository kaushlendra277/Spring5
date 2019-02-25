package com.customexceptionhandling.demo.controllers;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.customexceptionhandling.demo.controller.advice.BaseControllerExceptionHandler;
import com.customexceptionhandling.demo.repos.StudentRepository;
import com.customexceptionhandling.demo.services.StudentService;

public class StudentControllerTests {

	private StudentService studentService;
	
	private StudentController controller;
	
	@Mock
	private StudentRepository repository;
	
	private MockMvc mockMvc ;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		studentService = new StudentService(repository);
		controller = new StudentController(studentService);
		mockMvc = MockMvcBuilders
				.standaloneSetup(controller)
				.setControllerAdvice(new BaseControllerExceptionHandler())
				.build();
	}
	
	@Test
	public void getEmptyOptionalStudentsByNameTest() throws Exception {
		//GIVEN 
		Optional<String> name = Optional.empty();
		
		when(repository.getEmptyOptionalStudentsByName(""))
		.thenReturn(name);
		
		//When and Then
		mockMvc
		.perform(MockMvcRequestBuilders.get("")) // WHEN
		.andExpect(MockMvcResultMatchers.status().isNotFound());// THEN
	}
	
	@Test
	public void getEmptyOptionalStudentsByNameRetunsNonEmptyOptionalTest() throws Exception {
		//GIVEN 
		Optional<String> name = Optional.of("KSC");
		
		when(repository.getEmptyOptionalStudentsByName("success"))
		.thenReturn(name);
		
		//When
		ResultActions results = mockMvc
								.perform(MockMvcRequestBuilders.get("/success"));
		
		//THEN
		assertNotNull(results);
		results
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void getStudentsByIdTest() throws Exception {
		//When
		ResultActions results = mockMvc
								.perform(MockMvcRequestBuilders.get("/studentById/not-a-number"));
		
		//THEN
		
		 assertNotNull(results); results
		  .andExpect(MockMvcResultMatchers.status().isBadRequest());
		 
	}
	
}
