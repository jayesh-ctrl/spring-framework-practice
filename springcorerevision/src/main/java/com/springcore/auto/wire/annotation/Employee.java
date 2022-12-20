package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("tempAddress")
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("Setting Value...");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Autowire using Constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
