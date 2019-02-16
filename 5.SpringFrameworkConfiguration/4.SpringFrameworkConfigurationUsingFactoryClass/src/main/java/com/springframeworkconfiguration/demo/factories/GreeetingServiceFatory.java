package com.springframeworkconfiguration.demo.factories;

import org.springframework.stereotype.Component;

import com.springframeworkconfiguration.demo.services.EnglishGreetingServiceImpl;
import com.springframeworkconfiguration.demo.services.GermanGreetingServiceImpl;
import com.springframeworkconfiguration.demo.services.GreetingService;
import com.springframeworkconfiguration.demo.services.SpanishGreetingServiceImpl;

@Component
public class GreeetingServiceFatory {

	public GreetingService creatingGreetingService(String lang) {
		GreetingService result = new EnglishGreetingServiceImpl();
		switch(lang) {
			case "en":
				result =  new EnglishGreetingServiceImpl();
				break;
			case "es":
				result =  new SpanishGreetingServiceImpl();
				break;
			case "de":
				result = new GermanGreetingServiceImpl();
				break;
			default:
				result = new EnglishGreetingServiceImpl();
		}
		return result;
	}
}
