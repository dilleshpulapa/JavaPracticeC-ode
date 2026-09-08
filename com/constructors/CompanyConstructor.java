package com.constructors;

public class CompanyConstructor{
		static String companyName="Wipro";
		String employeeName;
		int age;
		double salary;

		CompanyConstructor( String employeeName, int age,double salary) {
			System.out.println("*******************************");
			System.out.println("Parameterized constructor");
			this.age=age;
			this.employeeName = employeeName;
			this.salary = salary;
		}
		CompanyConstructor(){
			System.out.println("***************************");
			System.out.println("no arg constructor ");
			employeeName="sai";
			age=24;
			salary =55000;
		}

		public static void main(String[] args) {
			CompanyConstructor C = new CompanyConstructor("dillesh",23,40000.49);		
			C.deatils();
			CompanyConstructor C1=new CompanyConstructor();
			C1.deatils();
		}

		void deatils() {
			System.out.println("COMPANY NAME :" + companyName);
			System.out.println("EMPLOYEE NAME :" + employeeName);
			System.out.println("Age of employee :"+age);
			System.out.println("SALARY :" + salary);
		}
	}

	

	
