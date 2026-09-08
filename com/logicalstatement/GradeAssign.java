package com.logicalstatement;

import java.util.Scanner;

public class GradeAssign {
	public static void main(String[] args) {

		System.out.println("*** ASSIGN GRADES TO STUDENTS MARKS ***");

		Scanner SC = new Scanner(System.in);

		System.out.println("Enter the marks :");

		int marks = SC.nextInt();
		
		SC.close();
		String grade = (marks < 0) || (marks > 100) ? "INVALID MARKS"

				: (marks >= 91 && marks <= 100) ? "A"

						: (marks >= 81 && marks <= 90) ? "B"

								: (marks >= 80 && marks <= 71) ? "C"

										: (marks >= 70 && marks <= 61) ? "D"

												: (marks >= 60 && marks <= 45) ? "E"

														: (marks <= 45) ? "FAIL" : "invalid";

		System.out.println("The Result is :" + grade);

	}
}
