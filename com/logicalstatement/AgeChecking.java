package com.logicalstatement;

import java.util.Scanner;

public class AgeChecking {
int age;
public static void main(String[]args) {
	AgeChecking AC=new AgeChecking();
	Scanner SC=new Scanner(System.in);
	System.out.println("Enter the Age :");
	int age=SC.nextInt();
	AC.checking(age);
	SC.close();
}
void checking(int age) {
	if(age>=60) {
		System.out.println("OLD AGE ");
	}
	else if(age>=40) {
		System.out.println("MIDDLE AGE ");
	}
	else if(age>=20) {
		System.out.println("YOUNGER AGE ");
	}
	else if(age>=13) {
		System.out.println(" TEEN AGE  ");
	}
	else if(age>=6) {
		System.out.println("CHILD AGE ");
	}
	else if(age>=0) {
		System.out.println("KID AGE ");
	}
}
}
