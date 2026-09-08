package javaBasics;

public class BlocksVariables {
	// static block in the static block we created an object with that obj we call methods
			static {
				System.out.println("Static Block 1 was  executed");
				
			}

			void method1() {
				method4();
				System.out.println("instance method 1 is created");
			}

			void method2() {
				System.out.println("instance method 2 is created");
			}
			static { 
				System.out.println("static block 2 was executed");
				BlocksVariables obj = new BlocksVariables();
				obj.method1();
			}

			void method3() {
				method2();
				System.out.println("instance method 3 is created");

			}

			void method4() {
				method3();
				System.out.println("instance method 4 is created");
			}

			public static void main(String[] args) {
				BlocksVariables obj1 = new BlocksVariables();
				System.out.println(obj1);
			}

		}




