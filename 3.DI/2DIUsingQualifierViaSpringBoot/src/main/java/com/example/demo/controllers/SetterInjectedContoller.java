package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.services.GreetingService;

@Controller
public class SetterInjectedContoller {
	
	@SuppressWarnings("unused")
	private GreetingService  greetingService ;

	@Autowired
	//@Qualifier(value = "setterGreetingService") // here also it will work
	public void setGreetingService(@Qualifier(value = "setterGreetingService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello(){
		return greetingService.sayHello();
	}
}
