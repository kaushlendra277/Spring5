package com.projectlombok.demo.pojos;

import lombok.SneakyThrows;

public class SneakyThrowsPojo {
	@SneakyThrows
	public static void sneakyThrosDemo(){
		System.out.println("Testing @SneakyThrows");
		throw new Exception();
	} 
}