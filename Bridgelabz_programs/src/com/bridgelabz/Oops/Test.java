package com.bridgelabz.Oops;

public class Test {

	public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setEmpNo(07);
	emp.setName("Rohan");
	emp.setSalary(5000000.0);
	String JsonEmployee=JsonUtil.convertJavaToJson(emp);
	System.out.println(JsonEmployee);
	System.out.println("+++++++++++++++++++++++++");
	Employee emp1=JsonUtil.covertJsontoJava(JsonEmployee,Employee.class);
	System.out.println(emp1.getEmpNo()+" "+emp1.getName()+" "+emp1.salary);
	
	
	}

}
