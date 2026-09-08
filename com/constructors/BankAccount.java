package com.constructors;

//COPY CONSTRUCTOR with PARAMETRIZED CONSTRUCTOR 

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;
	String branch;

	BankAccount(int accountNumber, String accountHolderName, double balance, String branch) {
		
		System.out.println("Parameterized Constructor !!");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.branch = branch;
	}

	public BankAccount(BankAccount BA, String branch, int balance) {
		this.accountHolderName = BA.accountHolderName;
		this.accountNumber = BA.accountNumber;
		this.balance = balance;
		this.branch = branch;
	}
	public BankAccount(BankAccount b, String branc) {
			this.accountHolderName = b.accountHolderName; 
			this.accountNumber = b.accountNumber;
			this.balance = b.balance;
			branch = branc;
	}

	public static void main(String[] args) {
		
		BankAccount BA = new BankAccount(12443, "Dillesh", 2300, "Vizag");
		BA.display();
		BankAccount b = new BankAccount(BA, "Hyderabad", 12000);
		b.display();
		BankAccount BA1 = new BankAccount(b, "Vizyanagram");
		BA1.display();
	}

	void display() {
		System.out.println("**************************");
		System.out.println("Branch :" + branch);

		System.out.println("Account NUmber :" + accountNumber);
		System.out.println("AccountHolderName :" + accountHolderName);
		System.out.println("Account Balance :" + balance);

	}
}
