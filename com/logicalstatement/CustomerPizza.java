package com.logicalstatement;

import java.util.Scanner;

public class CustomerPizza {
	static {
		System.out.println("WELCOME TO PIZZA HOUSE !!");
	}

	double getPriceBySize(char sizee) {
		if (sizee == 's' || sizee == 'S') {
			return 70.00;
		} else if (sizee == 'm' || sizee == 'M') {
			return 100.00;
		} else if (sizee == 'l' || sizee == 'M') {
			return 150.00;
		} else {
			return 0;
		}
	}

	double calculatePizzaCost(double price, int quantity) {
		return price * quantity;
	}

	double calculateDeliveryCharges(int distance) {
		if (distance < 10 && distance > 0) {
			return 0;
		} else {
			return 100.00;
		}
	}

	double finalBill(double pizzacost, double distcharges) {
		return pizzacost + distcharges;
	}

	void main() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Pizza ");
		char size = sc.next().charAt(0);
		double pizzaPrice = getPriceBySize(size);
		System.out.println("Enter the quantity of Pizza ");
		int quantitys = sc.nextInt();
		double quantity = calculatePizzaCost(pizzaPrice, quantitys);
		System.out.println("The  amount for Pizza :" + quantity);

		System.out.println("Enter the Distance from PizzaHouse ");
		int dist = sc.nextInt();
		double distcharge = calculateDeliveryCharges(dist);

		double totalBill = finalBill(quantity, distcharge);
		System.out.println("THE TOTAL BILL :" + totalBill);
		
		sc.close();
	}
}
