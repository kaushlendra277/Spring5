package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controllers.MyController;

@SpringBootApplication
public class DIviaSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication
									.run(DIviaSpringBootApplication.class, args);
		MyController myController = context
									.getBean("myController", MyController.class);
		System.out.println(myController.sayHello());
		
		System
			.out
			.println("Application teminated");
	}

}
