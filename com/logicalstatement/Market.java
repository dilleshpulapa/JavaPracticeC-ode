package com.logicalstatement;

import java.util.Scanner;

public class Market {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("WELCOME TO FRESH MARKET");
		String myn = "";
		double totalCost = 0;
		do {
			System.out.println("Enter the Categery to slect ..");
			String catg = SC.next();
			switch (catg) {
			case "fruits" -> {

				String fyn = "";
				double totalFruitsCost = 0;

				do {
					System.out.println("Enter The Item..");
					String item = SC.next();
					switch (item) {

					case "mango" -> {
						System.out.println("Mango Per KG is 170");
						double mangoPrice = 170;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double mangoCost = mangoPrice * quantity;
						totalFruitsCost = totalFruitsCost + mangoCost;

						System.out.println("Apple Cost = " + mangoCost);

					}
					case "apple" -> {
						System.out.println("Apple Per KG is 150");
						double applePrice = 150;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double appleCost = applePrice * quantity;
						totalFruitsCost = totalFruitsCost + appleCost;

						System.out.println("Apple Cost = " + appleCost);
					}
					case "orange" -> {
						System.out.println("Orange Per KG is 100");
						double orangePrice = 100;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double orangeCost = orangePrice * quantity;
						totalFruitsCost = totalFruitsCost + orangeCost;

						System.out.println("Orange Cost = " + orangeCost);
					}
					case "grapes" -> {
						System.out.println("Grapes Per KG is 120");
						double grapesPrice = 120;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double grapesCost = grapesPrice * quantity;
						totalFruitsCost = totalFruitsCost + grapesCost;

						System.out.println("Grapes Cost = " + grapesCost);
					}

					case "watermelon" -> {
						System.out.println("Watermelon Per KG is 40");
						double watermelonPrice = 40;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double watermelonCost = watermelonPrice * quantity;
						totalFruitsCost = totalFruitsCost + watermelonCost;

						System.out.println("Watermelon Cost = " + watermelonCost);

					}

					default -> System.out.println("Enter the items are not available");
					}
					System.out.println("DO YOU WANT TO CONTINUE  click y for yes n for NO...?");
					fyn = SC.next();

				} while (fyn.equalsIgnoreCase("y"));
				System.out.println("The Total Fruits Cost is :" + totalFruitsCost);
				totalCost = totalCost + totalFruitsCost;

				System.out.println("EXIT From Fruits");
			}
			case "veg" -> {
				String fyn = "";
				double totalVegCost = 0;
				do {

					System.out.println("Enter the item ..");
					String item = SC.next();

					switch (item) {
					case "brinjal" -> {
						System.out.println("brinajl Per KG is 70");
						double brinjalPrice = 70;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double brinjalCost = brinjalPrice * quantity;

						totalVegCost = totalVegCost + brinjalCost;

						System.out.println("Brinjal Cost = " + brinjalPrice);

					}
					case "potato" -> {
						System.out.println("potato Per KG is 30");
						double potatoPrice = 30;

						System.out.println("Enter quantity in KG:");
						double quantity = SC.nextDouble();

						double potatoCost = potatoPrice * quantity;
						totalVegCost = totalVegCost + potatoCost;
						System.out.println("Potato Cost is :" + potatoCost);
					}
					case "onion" -> {
						System.out.println("Onion Per KG is 50");
						double onionPrice = 50;
						System.out.println("Enter Quantity in kg");
						double quantity = SC.nextDouble();
						double onionCost = onionPrice * quantity;
						totalVegCost = totalVegCost + onionCost;
						System.out.println("Onion Cost :" + onionCost);
					}
					case "tomato" -> {
						System.out.println("tomoto Per KG is 20");
						double tomatoPrice = 20;
						System.out.println("Enter Quantity is :");
						double quantity = SC.nextDouble();
						double tomatoCost = tomatoPrice * quantity;
						totalVegCost = totalVegCost + tomatoCost;
						System.out.println("Tomato Cost is :" + tomatoCost);
					}

					case "cucumber" -> {
						System.out.println("cucumber Per KG is 40");
						double cucumberPrice = 40;
						System.out.println("Enter The Quantity :");
						double quantity = SC.nextDouble();
						double cucumberCost = cucumberPrice * quantity;
						totalVegCost = totalVegCost + cucumberCost;
						System.out.println("Cucumber Price :" + cucumberCost);
					}
					default -> System.out.println("Enter the items are not available");
					}
					System.out.println("DO YOU WANT TO CONTINUE  click y for yes n for NO...?");
					fyn = SC.next();

				} while (fyn.equalsIgnoreCase("y"));
				System.out.println("The TotalCost of vegetables :" + totalVegCost);
				totalCost = totalCost + totalVegCost;
				System.out.println("EXIT from Vegitables");
			}
			default -> System.out.println("Enter categery is not available  !! ");
			}
			System.out.println("Do You Want TO Continue With Categery !! Click y For Yes, n For No!!");
			myn = SC.next();
		} while (myn.equalsIgnoreCase("y"));
		System.out.println("THE TOTAL AMOUNT FOR MARKET :" + totalCost);
	}
}
