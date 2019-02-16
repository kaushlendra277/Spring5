package com.example.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello in spanishhhhhhhhhh from"+ this.getClass().getName();
	}

}
