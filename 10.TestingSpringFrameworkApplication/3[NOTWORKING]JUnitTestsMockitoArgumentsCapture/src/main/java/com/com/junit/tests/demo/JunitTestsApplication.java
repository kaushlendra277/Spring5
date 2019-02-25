package com.com.junit.tests.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.com.junit.tests.demo.pojos.Student;
import com.com.junit.tests.demo.services.StudentService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class JunitTestsApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(JunitTestsApplication.class, args);
		StudentService studentService = context.getBean("studentService",StudentService.class);
		for(Student student : studentService.getStudentsByName("", null)){
			log.info(student.getName());
		}
		log.info("Run src/test/java to run unit tests");
	}

}

