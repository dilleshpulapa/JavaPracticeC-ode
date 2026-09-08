package com.logicalstatement;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Connection Type if Domestic select 1 or Commercial for 2");
		String type = sc.next();
		switch (type) {
		case "domestic" -> {
			double totalBill = 0;
			System.out.println("Domestic Connection connection type");
			System.out.println("Enter the Units ");
			int units = sc.nextInt();

			if (units <= 100) {
				totalBill = units * 2;
				System.out.println("The Rate Per Unit : 2");

			} else if (units <= 300) {

				totalBill = units * 3;
				System.out.println("The Rate Per Unit : 3");
			} else {
				System.out.println("invalid");
			}
			System.out.println("The Units Consumed :" + units);
			System.out.println("The Electricity Bill was:" + totalBill);

		}
		case "commercial" -> {
			double commercialBill = 0;
			System.out.println("Commercial  Connection");
			System.out.println("Enter the Units ");
			int units = sc.nextInt();

			if (units <= 100) {
				commercialBill = units * 4;
				System.out.println("The Rate Per Unit : 4");


			} else if (units < 300) {
				commercialBill = units * 6;
				System.out.println("The Rate Per Unit : 4");

			} else {
				System.out.println("invalid");
			}
			System.out.println("The Units Consumed :" + units);

			System.out.println("The Electricity Bill was:" + commercialBill);

		}

		}

	}

}
