package com.operators;

public class Swaping {
	
	public static void main(String[] args) {
		Swaping S=new Swaping();
		// Before Swaping 
		int a=10;
		int b=20;
		System.out.println("A :" +a);
		System.out.println("B :"  +b);
		//swaping with Arthemetic operator 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("*****************************");

		System.out.println("A  After Swap:" +a);
		System.out.println("B After Swap:"  +b);
		// Swaping With Temp 
		int temp=a;
		a=b;
		b=temp;
		System.out.println("*****************************");
		System.out.println("A After Swap with temp :"  +a);
		System.out.println("B After Swap with temp :"  +b);
		// Swaping With BitWise Operaters XOR ^ ,  
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("*****************************");
		System.out.println("A After Swap with temp :"  +a);
		System.out.println("B After Swap with temp :"  +b);
	}

}
