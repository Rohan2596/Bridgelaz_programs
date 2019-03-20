package com.bridgelabz.Oops.AddressBook.model;

public class Person {
	public String name;
	public String phNumber;
	public String address;
	@Override
	public String toString() {
		return "Person [name=" + name + ", phNumber=" + phNumber + ", Address=" + address + "]";
	}

	public Person() {
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
