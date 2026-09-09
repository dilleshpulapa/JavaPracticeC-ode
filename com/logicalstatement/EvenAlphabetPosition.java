package com.logicalstatement;

import java.util.Scanner;

public class EvenAlphabetPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	if(i%2==0) {
		char letter = (char)('A'+(i-1));
		System.out.println(i+"->"+letter);
		System.out.println();
	}
}
	}

}
