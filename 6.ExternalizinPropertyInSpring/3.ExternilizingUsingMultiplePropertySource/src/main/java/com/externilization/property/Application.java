package com.externilization.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.externilization.property.pojos.FakeDataSource;
import com.externilization.property.pojos.FakeJmsSource;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		FakeDataSource fakeDataSource = context.getBean("fakeDataSource",FakeDataSource.class);
		System.out.println("********************** reading from propertyfile1");
		System.out.println(fakeDataSource.getUserName());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());
		
		FakeJmsSource fakeJmsSource = context.getBean("fakeJmsSource",FakeJmsSource.class);
		System.out.println("********************** reading from propertyfile2");
		System.out.println(fakeJmsSource.getJmsUserName());
		System.out.println(fakeJmsSource.getJmsPassword());
		System.out.println(fakeJmsSource.getJmsUrl());
		
		System.out.println("Externilaztion using multiple custom.properties Successfull");
	}
}

