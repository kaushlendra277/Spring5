package com.com.junit.tests.demo.pojos;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class Student {
	
	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String name;
}
