package com.springframeworkconfiguration.demo.component;

import org.springframework.stereotype.Component;

import com.springframeworkconfiguration.demo.services.GreetingService;

@Component
public class GreetingComponent {

	private final GreetingService greetingService;

	public GreetingComponent(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public void sayHello() {
		greetingService.sayHello();
	}
}
