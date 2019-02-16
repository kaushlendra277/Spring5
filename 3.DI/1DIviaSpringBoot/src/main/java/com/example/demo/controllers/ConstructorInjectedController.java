package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	public GreetingService  greetingService ;

	@Autowired
	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayHello();
	}
	
}