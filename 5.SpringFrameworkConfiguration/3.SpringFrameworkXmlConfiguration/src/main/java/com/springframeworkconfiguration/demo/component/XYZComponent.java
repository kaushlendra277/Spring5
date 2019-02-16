package com.springframeworkconfiguration.demo.component;

import org.springframework.beans.factory.annotation.Autowired;

import com.springframeworkconfiguration.someotherpackage.services.XYZService;

//@Component(value ="xyzController")
// using java based configuration
public class XYZComponent {
	
	private final XYZService xyzService;

	@Autowired
	public XYZComponent(XYZService xyzService) {
		super();
		this.xyzService = xyzService;
	}
	
	public void printSuccess() {
		xyzService.printSuccess();
	}

}
