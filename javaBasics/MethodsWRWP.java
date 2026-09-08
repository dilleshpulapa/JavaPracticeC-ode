package javaBasics;

import java.util.Scanner;

public class MethodsWRWP {
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		MethodsWRWP RP = new MethodsWRWP();

		System.out.println("MAIN METHOD STARTED");

		System.out.println("Enter the side of the square :");
		double side = SC.nextDouble();
		double arOfSq = RP.areaOfSquare(side);
		System.out.println("Area of Square :" + arOfSq);
		System.out.println("**************************************");
		System.out.println();
		System.out.println("ENTER THE BASE VALUE OF A TRIANGLE :");
		int base=SC.nextInt();
		System.out.println("ENTER THE VALUE OF HEIGHT :");
		int height =SC.nextInt();
		double arOfTri=RP.areaOfTriangle(base,height);
		System.out.println("THE AREA OF TRINGLE :"+arOfTri);
		System.out.println("**************************************");
		System.out.println();

		System.out.println("enter the length of side :");
		double len = SC.nextDouble();
		System.out.println("Enter the breadth :");
		double bre = SC.nextDouble();
		double arOfRec = RP.areaOfRectangle(len, bre);
		System.out.println("THE AREA OF RECTANGLE IS :" + arOfRec);
		System.out.println("****************************************");
		System.out.println();

		System.out.println("Enter the Items :");
		float item = SC.nextFloat();
		System.out.println("Enter the Price :");
		float pri = SC.nextFloat();
		double shopping = shoppingBill(item, pri);
		System.out.println("THE TOTAL SHOPPINGBILL AMOUNT :" + shopping);
		System.out.println("********************************************");
		System.out.println();
		System.out.println("enter the totaltickets sales :");
		int tickets=SC.nextInt();
		System.out.println("Enter the cost of tickets :");
		int cost=SC.nextInt();
		float movie=movieTickets(tickets,cost);
		System.out.println("The Total Numbers of tickes sale :"+movie);
		System.out.println("********************************************");
		System.out.println();
		System.out.println("Enter The RoomPrice :");
		int roomPrice=SC.nextInt();
		System.out.println("Enter the cost Per day :");
		int costprice=SC.nextInt();
		int totalPrice=RP.hotelBill(roomPrice,costprice);
		System.out.println("The Total bill of hotel for staying :"+totalPrice);
		
	}

	double areaOfSquare(double side) {
		double arSq = side * side;
		return arSq;
	}

	double areaOfTriangle(double base,double height){
		double arTri = 0.5*base*height;
		return arTri;
	}

	double areaOfRectangle(double length, double breadth) {
		double arRec = length * breadth;
		return arRec;
	}

	static float shoppingBill(float items, float price) {
		float bill = items * price;
		return bill;
	}
	static float movieTickets(float ticketPrice,float numberOfTickets) {
		float countTickets=ticketPrice*numberOfTickets;
		return countTickets;
	}
	int hotelBill(int roomPrice,int days) {
		int hotel=roomPrice*days;
		return hotel;
		
	}

}
