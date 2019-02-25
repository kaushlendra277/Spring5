package com.com.junit.tests.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest // optional
public class JunitTestsApplicationTests {

	@Test
	// this is to test application context is loading 
	public void contextLoads() {
	}

}

