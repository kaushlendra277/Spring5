package com.springframeworkconfiguration.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springframeworkconfiguration.demo.component.XYZComponent;

@SpringBootApplication
public class SpringFrameworkConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication
										.run(SpringFrameworkConfigurationApplication.class, args);
		XYZComponent xyzController = context.getBean("xyzComponent", XYZComponent.class);
		xyzController.printSuccess();
	}

}

