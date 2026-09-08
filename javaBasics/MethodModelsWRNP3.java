package javaBasics;

import java.util.Scanner;

public class MethodModelsWRNP3 {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		MethodModelsWRNP3 RP = new MethodModelsWRNP3();
		double sal = RP.employeeSalary();
		double bon = RP.employeeBonus();
		double pfAmount = RP.employeePF();
		double companyPF = RP.companyPF();
		System.out.println("The amount of pf cutting from salary :" + pfAmount);
		System.out.println("the total salary of an employee :" + (sal + bon - pfAmount));

		System.out.println("the adding of pf amount from company:" + (pfAmount + companyPF));
		SC.close();
	}

	double employeeSalary() {
		System.out.println("Enter the salary :");
		Scanner SC = new Scanner(System.in);
		double salary = SC.nextInt();
		return salary;
	}

	double employeeBonus() {
		System.out.println("Enter the Bonus");
		Scanner SC = new Scanner(System.in);

		double bonus = SC.nextInt();
		return bonus;
	}

	double employeePF() {
		Scanner SC = new Scanner(System.in);

		System.out.println("The Employee PF cutting from salary :");
		double PF = SC.nextInt();
		return PF;
	}

	double companyPF() {
		Scanner SC = new Scanner(System.in);

		System.out.println("The Employee PF adding from comapany :");
		double PFC = SC.nextInt();
		return PFC;
		
	}
}
