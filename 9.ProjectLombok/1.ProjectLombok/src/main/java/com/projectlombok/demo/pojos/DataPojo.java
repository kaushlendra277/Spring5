package com.projectlombok.demo.pojos;

import lombok.Data;

@Data
public class DataPojo {

	private String name;
	
	private String id;
	
	private final String finalField;
}
