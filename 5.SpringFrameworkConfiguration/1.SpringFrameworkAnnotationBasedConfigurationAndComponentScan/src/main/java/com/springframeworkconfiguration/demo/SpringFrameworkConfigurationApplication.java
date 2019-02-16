package com.springframeworkconfiguration.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.springframeworkconfiguration.demo.component.XYZComponent;

@SpringBootApplication
@ComponentScans({
			@ComponentScan(basePackages = {"com.springframeworkconfiguration.someotherpackage.services"})
		})
public class SpringFrameworkConfigurationApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication
										.run(SpringFrameworkConfigurationApplication.class, args);
		XYZComponent xyzController = context.getBean("xyzController", XYZComponent.class);
		xyzController.printSuccess();
	}

}
