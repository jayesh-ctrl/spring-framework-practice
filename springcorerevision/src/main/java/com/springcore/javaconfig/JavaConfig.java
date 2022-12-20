package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosaObject() {
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	
	@Bean(name = {"student","temp","con"})
	public Student getStudentObject() {
		Student student = new Student(getSamosaObject());
		return student;
	}
}
