package com.springframeworkconfiguration.demo.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springframeworkconfiguration.someotherpackage.services.XYZService;

@Component(value ="xyzController")
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
