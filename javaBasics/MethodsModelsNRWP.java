package javaBasics;

import java.lang.Math;

public class MethodsModelsNRWP {
	void addition(int a, float b) {
		System.out.println("sum of two number :" + (a + b));
	}

	void add(float a, double b) {
		System.out.println("sum of two number :" + (a + b));
	}

	static void sub(int a, int b) {
		System.out.println("diffrence of two number :" + (a - b));
	}

	void subtraction(double a, double b) {
		System.out.println("diffrence of two number :" + (a - b));
	}

	static void product(long a, long b) {
		System.out.println("product of two number :" + a * b);
	}

	void qoutient(int a, double b) {
		System.out.println("qoutient of int and double :" + b / a);
	}

	static void modulus(double a, double b) {
		System.out.println("modulus of two numbers:" + a % b);
	}

	static void average(double a, double b, int c) {
		System.out.println("average of two numbers:" + (a + b + c) / 3);
	}

	void square(double a) {
		System.out.println("square of 2 numbers :" + a * a);

	}

	static void cube(int a) {
		System.out.println("cube of 2 numbers :" + a * a * a);

	}

	void rectangle(double a, double b) {
		System.out.println("Area of Rectangle a=L*B:" + 2 * (a + b));
	}

	static void areaOfSquare(double a) {
		System.out.println("Area Of Square :" + a * a);
	}

	void perimeterOfSquare(double a) {
		System.out.println("Perimeter of square: " + 4 * a);
	}

	static void areaOfCircle(int b) {
		System.out.println("Area Of Circle :" + 3.14 * (b * b));
	}

	void simpleIntrest(double a, double b, int c) {
		System.out.println("Simple Intrest :" + (a * b * c) / 100);
	}

	static void totalMarks(int a, int b, int c, int d, int e, int f) {
		System.out.println("The Total Marks :" + (a + b + c + d + e + f));
	}

	static void totalPercentage(int a, int b, int c, int d, int e, int f) {
		System.out.println("The Totalmarks percentage :" + (((a + b + c + d + e + f)/600.0)*100));
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		MethodsModelsNRWP M = new MethodsModelsNRWP();
		M.addition(10, 13.7f);
		M.add(10.5f, 13.5f);
		sub(27, 34);
		M.subtraction(24, 20);
		product(267555453, 475757759);
		M.qoutient(2, 25.55);
		modulus(95, 4);
		average(12.3, 35.5, 40);
		M.square(4);
		cube(6);
		M.rectangle(2.5, 3);
		areaOfSquare(10.2);
		M.perimeterOfSquare(2);
		areaOfCircle(3);
		M.simpleIntrest(100000, 1.5, 12);
		totalMarks(64, 67, 79, 89, 89, 78);
		totalPercentage(84, 79, 94, 86, 89, 78);
	}
}