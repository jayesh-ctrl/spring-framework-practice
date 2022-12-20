package com.springcore.auto.wire;

public class Employee {
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
