package com.example.demo.controllers;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.example.demo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@Before
	public void setUp() {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() {
		assertTrue(true);
	}
}
