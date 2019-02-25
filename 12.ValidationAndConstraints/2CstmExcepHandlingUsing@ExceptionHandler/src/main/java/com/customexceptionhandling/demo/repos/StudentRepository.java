package com.customexceptionhandling.demo.repos;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
	public Optional<String> getEmptyOptionalStudentsByName(String error){
		if(error.equals("showError"))
			return Optional.empty();
		else
			return Optional.of("KSC");
	}
}
