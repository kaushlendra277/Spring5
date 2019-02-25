package com.com.junit.tests.demo.pojos;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTests {

	private Student student;
	@Before
	public void setUp() throws Exception {
		this.student = new Student();
	}

	@After
	public void tearDown() throws Exception {
		this.student = null;
	}

	@Test
	public void studentNameTest() {
		String name = "ksc";
		this.student.setName(name);
		assertTrue(this.student.getName().equals(name));
	}

}
