package javaBasics;

public class StaticBlockVariables {

	static {
		System.out.println("static block is stareted now");
		System.out.println(" ************** ");
	}

	static StaticBlockVariables s = new StaticBlockVariables();

	static void method1() {

		s.method2();
		System.out.println("static method 1 is calling");
	}

	void method2() {
		method3();
		System.out.println("instance method 2 is calling");

	}

	static void method3() {

		s.method4();
		System.out.println("static method 3 is calling");
	}

	void method4() {
		System.out.println("instance method 4 is calling");
	}

	public static void main(String[] args) {
		System.out.println("mAIN METHOD Started");

		System.out.println("static methods called here");
		method1();
		System.out.println("main method ended");
	}

}

