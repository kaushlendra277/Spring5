package com.springframeworkconfiguration.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springframeworkconfiguration.demo.component.XYZComponent;
import com.springframeworkconfiguration.someotherpackage.services.XYZService;
import com.springframeworkconfiguration.someotherpackage.services.XYZServiceImpl;

@Configuration
public class XYZConfig {

	@Bean
	// in such cases bean "xyzService" will be created first supported by spring 5
	// in earlier version use @DependsOn("xyzService")
	public XYZComponent xyzComponent(XYZService xyzService) {
		return new XYZComponent(xyzService);
	}
	
	@Bean
	public XYZService xyzService() {
		return new XYZServiceImpl();
	}
}
