package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("Setting Subject..");
		this.subject = subject;
	}

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annotation [subject=" + subject + "]";
	}

	
	@PostConstruct
	public void start() {
		System.out.println("Starting method : init method.");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending method : destroy method.");
	}
	
}
