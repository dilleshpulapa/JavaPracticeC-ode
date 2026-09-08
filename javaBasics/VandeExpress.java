package javaBasics;

public class VandeExpress {
String passengerName;
int age;
String departure;
String destination;
int numberOfTickets;
 
static int totalTicketsBought;
static double totalAmount;
static double price=500;
static {
	System.out.println("WELCOME TO VANDE EXPRESS ....THANK YOU FOR CHOOSING US");
}
void bookTickets() {
	double ticketAmount=numberOfTickets*price;
	totalTicketsBought=totalTicketsBought+numberOfTickets;
	totalAmount=totalAmount+ticketAmount;
	System.out.println("Tickets Booked Successfully");
}
void displayBookingDetails() {
	System.out.println("the passenger name :"+passengerName);
	System.out.println("age :"+age);
	System.err.println("departure station :"+departure);
	System.out.println("the destionation station :"+destination);
	System.out.println("the number of tickets we want :"+numberOfTickets);
	
}
static void ticketCounter() {
	System.out.println("totalTicketsBought :"+totalTicketsBought);
	System.out.println("totalAmount is :"+totalAmount);
}

	public static void main(String[] args) {
	
		VandeExpress V=new VandeExpress();
	V.passengerName="Dillesh";
	V.age=23;
	V.departure="secundrabad";
	V.destination="visakhapatnam";
	V.numberOfTickets=4;
	V.bookTickets();
	V.displayBookingDetails();
	ticketCounter();
	
System.out.println(" VISIT AGAIN");
	}

}
