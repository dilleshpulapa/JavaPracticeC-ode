package javaBasics;

public class StaticBlock {
	static {
		System.out.println("static block is stareted now");
		System.out.println(" ************** ");
	}
	static StaticBlock d = new StaticBlock ();

	static void method1() {
		
		d.method2();
		d.method4();
		System.out.println("static method 1 is calling");
	}

	void method2() {
		
		System.out.println("instance method 2 is calling");

	}

	static void method3() {

		d.method4();
		System.out.println("static method 3is calling");
	}

	void method4() {
		method2();
		System.out.println("instance method 4 is calling");
	}

	public static void main(String[] args) {
		System.out.println("mAIN METHOD Started");

		System.out.println("static methods called here");

		method1();

	}

}




