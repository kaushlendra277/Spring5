package com.springframeworkconfiguration.someotherpackage.services;

//@Service
//using xml based Configuration
public class XYZServiceImpl implements XYZService {

	@Override
	public void printSuccess() {
		System.out.println("Scope for XML  and JavaBased Spring Configuratin ran successfully");
	}

}
