package com.projectlombok.demo;

import com.projectlombok.demo.pojos.DataPojo;
import com.projectlombok.demo.pojos.SneakyThrowsPojo;

import lombok.extern.slf4j.Slf4j;

//@SpringBootApplication
@Slf4j
public class ProjectLombokApplication {
	// @SneakyThrows
	// it is commented since we are using @SneakyThrows SneakyThrowsPojo.sneakyThrosDemo()
	// if we have used throws then we need to have @SneakyThrows
	public static void main(String[] args){
		
		DataPojo dataPojo = new DataPojo("DataPojo.finalField.value");
		dataPojo.setId("DataPojo.id");
		dataPojo.setName("DataPojo.name");
		System.out.println(dataPojo.toString());
		System.out.println("**********************************INFO");
		log.info(dataPojo.toString());
		System.out.println("**********************************DEBUG");
		log.debug(dataPojo.toString());
		System.out.println("**********************************Error");
		log.error(dataPojo.toString());
		
		SneakyThrowsPojo.sneakyThrosDemo();
	}
	
	

}

