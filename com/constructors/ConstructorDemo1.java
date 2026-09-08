package com.constructors;

public class ConstructorDemo1 {
	int empId;
	String empName;
	double salary;
	int age;

	ConstructorDemo1(int empId, String empname, double salary,int age) {
		System.out.println("****Parameterized constructor****");
		this.empId = empId;
		empName = empname;
		this.salary = salary;
		this.age=age;
	}
	ConstructorDemo1(){
		System.out.println("****NO ARG CONSTRUCTOR***** ");
		empId=2345;
		empName="Dillu";
	
		
	}

	public static void main(String[] args) {
		ConstructorDemo1 CD = new ConstructorDemo1(1011, "Dillesh", 250000.00,22);
		CD.deatils();
		ConstructorDemo1 CD1 = new ConstructorDemo1(1021, "SAI", 20000.00,23);
		CD1.deatils();
		ConstructorDemo1 Cd=new ConstructorDemo1();
		
		Cd.deatils();
	}
	

	void deatils() {
		
		System.out.println("EMPID :" + empId);
		System.out.println("EmpName :" + empName);
		System.out.println("Salary :" + salary);
		System.out.println("Age of emp :"+age);
	}
}

