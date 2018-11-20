package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean(name="student")
	public Student getStudentBean() {
		System.out.println("Student Bean is created");
		return new Student();
	}
}
