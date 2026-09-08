package javaBasics;

public class MethodChainingCalcualter {

	void addition(int a, int b) {
		int add;
		add = a + b;
		System.out.println("Sum of the two values  :" + add);
		subtraction(add, 13);
	}

	void subtraction(int a, int b) {
		int sub = a - b;
		System.out.println("Diffrence of the two values  :" + sub);
		multiplication(sub, 3);
	}

	void multiplication(int a, int b) {
		int mul = a * b;
		System.out.println("multiplication of two values:" + mul);
		division(mul, 10);
	}

	void division(int a, int b) {
		int div = a / b;
		System.out.println("Qoutient of two values:" + div);
		modules(div, 4);
	}

	void modules(double a, double b) {
		double mod = a % b;
		System.out.println("reminder of two values:" + a % b);
	}

	public static void main(String[] args) {
		MethodChainingCalcualter C = new MethodChainingCalcualter();
		System.out.println("***ADDITON OF 1 VALUES***");
		C.addition(23, 10);
		System.out.println();
		System.out.println("***ADDITON OF 2 VALUES***");
		C.addition(26, 20);
	}
}
