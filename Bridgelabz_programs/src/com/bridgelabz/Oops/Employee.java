package com.bridgelabz.Oops;

import java.io.Serializable;

public class Employee implements Serializable {
 int empNo;
 String name;
 double salary;
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
