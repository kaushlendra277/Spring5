package com.com.junit.tests.demo.pojos;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
public class Student {
	
	@Getter
	@Setter
	private String id;
	
	@Getter
	@Setter
	private String name;

	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
