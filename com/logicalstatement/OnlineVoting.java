package com.logicalstatement;

import java.util.Scanner;

public class OnlineVoting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
System.out.println("Enter Age :");
int age=sc.nextInt();
if (age<=18) {
	System.out.println("not eligible for voting");	
}
else {
	System.out.println("Enter your Gender m/f :");
	char gender=sc.next().charAt(0);
	if(gender!='m' && gender !='M'&& gender!='F'&& gender!='f') {
		System.out.println("Not eligible");
	}else {
		System.out.println("Enter your voter id ");
		String voterid=sc.next();
		System.out.println("****CANDIDATE OPTIONS*****");
		System.out.println("1.Mohan");
		System.out.println("2.vivek");
		System.out.println("3.Devaraj");
		System.out.println("4.Jagan");
		
			System.out.println("Enter your vote ...");
			int voteoption=sc.nextInt();
			switch(voteoption) {
			case 1->
				System.out.println(" you enter your vote for candidate MOHAN");
				

			case 2->System.out.println("enter your vote for candidate VIVIEK");
			case 3->System.out.println("enter your vote for candidate DEVARAJ");
			case 4->System.out.println("enter your vote for candidate JAGAN");
			default->System.out.println("enter invalid option or nota ");
			}



	}
}

	}

}
