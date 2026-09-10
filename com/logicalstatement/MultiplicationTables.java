package com.logicalstatement;

import java.util.Scanner;

public class MultiplicationTables {

	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Table Number :");
    int num= sc.nextInt();
    sc.close();
    multipletable(num);
	}

	private static void multipletable(int num) {
		for(int i=1;i<=20;i++){
			System.out.println(num + "X" + i + "=" + (num*i));
			
		}
			
		
	}
 
}
