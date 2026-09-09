package com.logicalstatement;

public class PrintNumbers {
	static void primeNumber(int n) {
		if(n>110) {
		return;
	}
	System.out.println(n);
	primeNumber(n + 1); 
	}
public static void main(String[]args) {
	primeNumber(1);
}
}
