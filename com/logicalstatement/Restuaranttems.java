package com.logicalstatement;

import java.util.Scanner;

public class Restuaranttems {

	public static void main(String[] args) {
		System.out.println("!! WELCOME TO GOLD COIN RESTUARANT !!");
		Scanner sc = new Scanner(System.in);
		String vnyn="";
		double totalBill=0;
		double totalNonVegCost = 0;
		double totalVegMeals = 0;
		do {
			System.out.println("Enter The Category Of Food ...?");
			String category = sc.next();
			switch (category) {
//VEG BIRYANI BLOCK
			case "veg" -> {
				String vyn = "";
				
				double vegMeals = 0;

				do {
					System.out.println("Enter the Food items ..");

					String item = sc.next();

					switch (item) {

					case "pannerbiryani" -> {
						System.out.println("Panner Biryani Price is 250 ");
						double pannerBiryani = 250;
						System.out.println("Enter the quantity :");
						int quantity = sc.nextInt();
						vegMeals = pannerBiryani * quantity;
						totalVegMeals += vegMeals;
						System.out.println("Panner Biryani is :" + vegMeals);
					}
					case "mushroombiryani" -> {
						System.out.println("Mushroom Biryani Price is 270 ");
						double mushroomBiryani = 270;
						System.out.println("Enter the quantity :");
						int quantity = sc.nextInt();
						vegMeals = mushroomBiryani * quantity;
						totalVegMeals += vegMeals;
						System.out.println("mushroom Biryani is :" + vegMeals);
					}
					case "vegbiryani" -> {
						System.out.println("veg Biryani Price is 200 ");
						double vegBiryani = 200;
						System.out.println("Enter the quantity :");
						int quantity = sc.nextInt();
						vegMeals = vegBiryani * quantity;
						totalVegMeals += vegMeals;
						System.out.println("Panner Biryani is :" + vegMeals);
					}

					default -> System.out.println("enter invalid item");

					}
					System.out.println("can you want to Continue click y for Yes and no for No !!");
					vyn = sc.next();
				
				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("the totalBill for veg :" + totalVegMeals);
				System.out.println("Exit from veg ");
			}
			//NON VEG  BIRYANI  BLOCK
			case "nonveg" -> {
				
				double cost = 0;
				String vyn = "";
				do {
					System.out.println("Enter the item ..");
					String item = sc.next();
					
					switch (item) {

					case "chickenbiryani" -> {
						System.out.println("the Chicken biryani Cost 240");
						double chiBiryaniCost = 240;
						System.out.println("enter the quantity ..");
						int quantity = sc.nextInt();
						
						cost = chiBiryaniCost * quantity;
						totalNonVegCost += cost;
						System.out.println("Chicken Birayani Amount :" + cost);
					}
					case "muttonbiryani" -> {
						System.out.println("the mutton biryani Cost 430");
						double muttonCost = 430;
						System.out.println("enter the quantity ..");
						int quantity = sc.nextInt();
						cost = muttonCost * quantity;
						totalNonVegCost += cost;
						System.out.println("mutton Birayani Amount :" + cost);
					}
					case "prawnsbiryani" -> {
						System.out.println("the prawns biryani Cost 340");
						double praBiryaniCost = 340;
						System.out.println("enter the quantity ..");
						int quantity = sc.nextInt();
						cost = praBiryaniCost * quantity;
						totalNonVegCost += cost;
						System.out.println("Prawns Birayani Amount :" + cost);
					}
					case "eggbiryani" -> {
						System.out.println("the EGG biryani Cost 120");
						double eggCost = 120;
						System.out.println("enter the quantity ..");
						int quantity = sc.nextInt();
						cost = eggCost * quantity;
						totalNonVegCost+= cost;
						System.out.println("egg Birayani Amount :" + cost);
					}
					default -> 
					System.out.println("enter invalid item in NoN veg");
					}
					System.out.println("can you want to continue with nonveg click y for yes and n for No !!");
					vyn = sc.next();
				} while(vyn.equalsIgnoreCase("y"));
				System.out.println("The TotalBill for Non veg :"+totalNonVegCost);
				System.out.println("Exit from Non veg");
			}
			//VEG STARTERS BLOCK
			case "vegstarters" -> {

			    double vegStarterCost = 0;
			    String vyn = "";

			    do {
			        System.out.println("Enter the Veg Starter item:");

			        String item = sc.next();

			        switch (item) {

			        case "paneertikka" -> {
			            System.out.println("Paneer Tikka Price is 180");
			            double price = 180;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            vegStarterCost = price * quantity;
			            totalVegMeals += vegStarterCost;

			            System.out.println("Paneer Tikka Amount: " + vegStarterCost);
			        }

			        case "gobimanchurian" -> {
			            System.out.println("Gobi Manchurian Price is 150");
			            double price = 150;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            vegStarterCost = price * quantity;
			            totalVegMeals += vegStarterCost;

			            System.out.println("Gobi Manchurian Amount: " + vegStarterCost);
			        }

			        case "vegmanchurian" -> {
			            System.out.println("Veg Manchurian Price is 160");
			            double price = 160;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            vegStarterCost = price * quantity;
			            totalVegMeals += vegStarterCost;

			            System.out.println("Veg Manchurian Amount: " + vegStarterCost);
			        }

			        case "babycorn" -> {
			            System.out.println("Baby Corn Price is 170");
			            double price = 170;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            vegStarterCost = price * quantity;
			            totalVegMeals += vegStarterCost;

			            System.out.println("Baby Corn Amount: " + vegStarterCost);
			        }

			        default -> System.out.println("Invalid Veg Starter");

			        }

			        System.out.println("Continue Veg Starters? Enter y for Yes or n for No:");
			        vyn = sc.next();

			    } while (vyn.equalsIgnoreCase("y"));

			    System.out.println("Total Veg Starter Bill: " + totalVegMeals);
			    System.out.println("Exit from Veg Starters");
			}
			// NON VEG STATERS BLOCK
			case "nonvegstarters" -> {

			    double nonVegStarterCost = 0;
			    String vyn = "";

			    do {
			        System.out.println("Enter the Non-Veg Starter item:");

			        String item = sc.next();

			        switch (item) {

			        case "chicken65" -> {
			            System.out.println("Chicken 65 Price is 220");
			            double price = 220;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            nonVegStarterCost = price * quantity;
			            totalNonVegCost += nonVegStarterCost;

			            System.out.println("Chicken 65 Amount: " + nonVegStarterCost);
			        }

			        case "chickentikka" -> {
			            System.out.println("Chicken Tikka Price is 250");
			            double price = 250;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            nonVegStarterCost = price * quantity;
			            totalNonVegCost += nonVegStarterCost;

			            System.out.println("Chicken Tikka Amount: " + nonVegStarterCost);
			        }

			        case "chickenlollipop" -> {
			            System.out.println("Chicken Lollipop Price is 280");
			            double price = 280;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            nonVegStarterCost = price * quantity;
			            totalNonVegCost += nonVegStarterCost;

			            System.out.println("Chicken Lollipop Amount: " + nonVegStarterCost);
			        }

			        case "chillichicken" -> {
			            System.out.println("Chilli Chicken Price is 240");
			            double price = 240;

			            System.out.println("Enter the quantity:");
			            int quantity = sc.nextInt();

			            nonVegStarterCost = price * quantity;
			            totalNonVegCost += nonVegStarterCost;

			            System.out.println("Chilli Chicken Amount: " + nonVegStarterCost);
			        }

			        default -> System.out.println("Invalid Non-Veg Starter");

			        }

			        System.out.println("Continue Non-Veg Starters? Enter y for Yes or n for No:");
			        vyn = sc.next();

			    } while (vyn.equalsIgnoreCase("y"));

			    System.out.println("Total Non-Veg Starter Bill: " + totalNonVegCost);
			    System.out.println("Exit from Non-Veg Starters");
			}
			}System.out.println("can you want to continue with category click y for yes or n for no !!");
			vnyn=sc.next();
		}while(vnyn.equalsIgnoreCase("y"));
	totalBill=totalNonVegCost+totalVegMeals;
		System.out.println("THE FOOD BILL IS :"+totalBill);
		sc.close();
	}
}
