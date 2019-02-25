package com.customexceptionhandling.demo.repos;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	public Optional<String> getEmptyOptionalStudentsByName(){
		return Optional.empty();
	}
}
