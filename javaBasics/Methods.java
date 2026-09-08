package javaBasics;

public class Methods {
	static  Methods t =new Methods();
	static void addition() {
		
		multiplication();// static method refrence in static method without any obj name 
		t.subtraction();// instance mathod refrence in static method with obj name 
		int a =10;
		int b =23;
		
		System.out.println("the value add is :"+ (a+b));
		System.out.println("the value addconcate is :"+ a+b);

	}
	static void multiplication(){
		int a =33;
		int b = 2;
		int c =a*b;
				System.out.println("the value  mul is :"+c);
		
	}
		void subtraction(){
			divison();//instance method refrence in instance method without obj name

		int a =12;
		int b =13;
		int c =a-b;
		System.out.println("the value of subt is :"+c);
		}
		
		void divison() {
			
			int a =25;
			int b =5;
			int c =a/b;
			System.out.println("the value of div is :"+c);
		}
		

	public static void main(String[] args) {
		
		Methods t =new Methods();
		t.addition();
	}

}


