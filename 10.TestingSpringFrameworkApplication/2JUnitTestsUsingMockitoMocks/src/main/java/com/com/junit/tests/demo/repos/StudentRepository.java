package com.com.junit.tests.demo.repos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.com.junit.tests.demo.pojos.Student;

@Repository
public class StudentRepository {
	
	public List<String> getStudentNames(){
		List<String> names = new ArrayList<String>();
		names.add("name1");
		names.add("name2");
		names.add("name3");
		return names;
	}
	
	public List<Student> getStudentsByName(String name){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("id1", "name1"));
		students.add(new Student("id2", "name2"));
		students.add(new Student("id3", "name3"));
		return students
				.stream()
				.filter(s -> s.getName().equals(name))
				.collect(Collectors.toList());
	}
}
