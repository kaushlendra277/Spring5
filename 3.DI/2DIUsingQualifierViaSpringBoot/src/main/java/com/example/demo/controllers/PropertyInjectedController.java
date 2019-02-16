package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier(value = "greetingServiceImpl")
	public GreetingService  greetingService ; // if we fave rename the variable as bean name then also it will work w/o @Qualifier
	
	public String sayHello(){
		return greetingService.sayHello();
	}
}
