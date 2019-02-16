package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIviaSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication
									.run(DIviaSpringBootApplication.class, args);
		
		System
			.out
			.println("Application teminated");
	}

}

