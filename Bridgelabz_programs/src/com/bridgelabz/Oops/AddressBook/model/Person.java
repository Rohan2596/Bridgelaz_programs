package com.bridgelabz.Oops.AddressBook.model;

public class Person {
	public String name;
	public String phNumber;
	public Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phNumber=" + phNumber + ", address=" + address + "]";
	}
	
	
	
	

}
