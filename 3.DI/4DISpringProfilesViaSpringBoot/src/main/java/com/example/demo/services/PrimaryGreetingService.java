package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile(value = {"en", "default"})
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello in Englishhhhhhhhhhh From "+this.getClass().getName();
	}
	
}
