package com.customexceptionhandling.demo.pojos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.Getter;
import lombok.Setter;

public class Student {

	@Getter
	@Setter
	@Null
	private String id;
	
	@Getter
	@Setter
	@NotNull
	private String name;
	
	@Getter
	@Setter
	@Min(1)
	@Max(100)
	private int age;
}
