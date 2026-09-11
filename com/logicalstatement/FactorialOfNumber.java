package com.logicalstatement;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter A Number :");
		int n = sc.nextInt();
		int fn =findFactorial(n);
		System.out.println("The Factorial Number Is :" + fn);

	}

	static int findFactorial(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			 fact = fact * i;
		}
			return fact;
		}
	}


