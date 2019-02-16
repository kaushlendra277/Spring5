package com.springframeworkconfiguration.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springframeworkconfiguration.demo.factories.GreeetingServiceFatory;
import com.springframeworkconfiguration.demo.services.GreetingService;

@Configuration
public class XYZConfig {

	@Bean
	@Profile(value = {"default", "en"})
	public GreetingService englishGreetingServiceImpl(GreeetingServiceFatory greeetingServiceFatory) {
		return greeetingServiceFatory.creatingGreetingService("en");
	}
	
	@Bean
	@Profile(value = {"es"})
	public GreetingService spanishGreetingServiceImpl(GreeetingServiceFatory greeetingServiceFatory) {
		return greeetingServiceFatory.creatingGreetingService("es");
	}
	
	@Bean
	@Profile(value = {"de"})
	public GreetingService germanGreetingServiceImpl(GreeetingServiceFatory greeetingServiceFatory) {
		return greeetingServiceFatory.creatingGreetingService("de");
	}
}
