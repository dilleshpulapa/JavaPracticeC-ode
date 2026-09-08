package javaBasics;

public class Courier {
	String courierName;
	int courierId;
	String source;
	String destination;
	double weight;
	double deliveryAmount;

	static Courier C = new Courier();
	static int totalCouriers;
	static double totalWeight;
	static double totalAmountCollected;
	static int pricPerKg = 100;
	static {
		System.err.println("WELCOME  TO QUICKSHIP COURIER!");
	}

	void bookCourier() {
		deliveryAmount = weight * pricPerKg;
		System.out.println("the delivery amount was:" + deliveryAmount);
		totalCouriers++;
		totalWeight = totalWeight + weight;
		System.out.println("the totalweight is :" + totalWeight);
		totalAmountCollected = totalAmountCollected + deliveryAmount;
		System.out.println("the totalAmountCollected :" + totalAmountCollected);
		System.out.println("Courier Booked SuccessFully");
	}

	void displayCourierDetails() {
		System.out.println("CourierName :" + courierName);
		System.out.println("CourierID :" + courierId);
		System.out.println("from Source area :" + source);
		System.out.println("to destination area :" + destination);
		System.out.println("the Weight of the parcel is :" + weight);
		System.out.println("the amount for delivery :" + deliveryAmount);
	}

	static void displayTodayCollection() {
		System.out.println("The Total Couriers Booked :" + totalCouriers);
		System.out.println("The Total Weight :" + totalWeight);
		System.out.println("The Total Amount Collected :" + totalAmountCollected);
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("****The Delivery Item 1*****");
		C.courierName = "ElectricalApplinces";
		C.courierId = 1234;
		C.source = "Secundrabad";
		C.destination = "Visakhapatnam";
		C.weight = 5.50;
		C.displayCourierDetails();
		C.bookCourier();

		System.out.println("****The Delivery Item 2*****");
		C.courierName = "Decoration Items";
		C.courierId = 4543;
		C.source = "Hyderabad";
		C.destination = "Vizianagram";
		C.weight = 4.0;
		C.displayCourierDetails();
		C.bookCourier();
		System.out.println("---Total Couriers Details---");
		displayTodayCollection();
	}

}
