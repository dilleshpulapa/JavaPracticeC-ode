package com.operators;

import java.util.Scanner;

public class IntrgerModulusChecking {
	public static void main(String[] args) {
		System.out.println("*** INTEGER DIVISIBLE BY 3 AND 4");
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter The Integer Value ");
		int value = SC.nextInt();
		SC.close();
		if (value % 3 == 0 && value % 5 == 0) {
			System.out.println("FIZZ BUZZ");

		} else if (value % 3 == 0) {
			System.out.println("FIZZ");
			
		} else if (value % 5 == 0) {
			System.out.println("BUZZ");
		}
	}

}


