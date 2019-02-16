package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;
	
	@Autowired
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String sayHello() 
	{
		return greetingService.sayHello();
	}
}
