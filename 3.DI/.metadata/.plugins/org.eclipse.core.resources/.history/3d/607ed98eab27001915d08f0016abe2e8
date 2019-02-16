package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.controllers.ConstructorInjectedController;
import com.example.demo.controllers.MyController;
import com.example.demo.controllers.PropertyInjectedController;
import com.example.demo.controllers.SetterInjectedContoller;

@SpringBootApplication
public class DIviaSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication
									.run(DIviaSpringBootApplication.class, args);
		MyController myController = context
									.getBean("myController", MyController.class);
		myController.sayHello();
		
		System.out.println(context
			.getBean("propertyInjectedController", PropertyInjectedController.class)
			.sayHello());
		
		System.out.println(context
		.getBean("setterInjectedContoller", SetterInjectedContoller.class)
		.sayHello());
		
		System.out.println(context
		.getBean("constructorInjectedController", ConstructorInjectedController.class)
		.sayHello());
		
		System
			.out
			.println("Application teminated");
	}

}

