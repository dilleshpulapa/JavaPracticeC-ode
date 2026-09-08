package javaBasics;

public class ShoppingCart {
	static String storeName = "VISHAL MART";
	String customerName;
	String productName;
	double price;
	int quantity;
	double finalAmount;

	void addProducts(String pName, double pr, int quant) {
		productName = pName;
		price = pr;
		quantity = quant;
		System.out.println("Products Added succcesfully!");

	}

	void caluculateTotal(double discount) {
		double totalAmount = price * quantity;
		double discountAmount = totalAmount * discount / 100;
		finalAmount = totalAmount - discountAmount;

	}

	void displayCart() {
		System.out.println("StoreName :" + storeName);
		System.out.println("CustomerName :" + customerName);
		System.out.println("ProductDetails :" + productName);
		System.out.println("the product price :" + price);
		System.out.println("the quantity of products :" + quantity);
		System.out.println("the Final Amount :" + finalAmount);
	}

	public static void main(String[] args) {
		ShoppingCart S = new ShoppingCart();
		System.out.println("main method started");

		System.out.println("*****CUSTOMER 1 DETAILS*****");
		S.customerName = "Dillesh";

		S.addProducts("Umberella", 245, 4);
		S.caluculateTotal(10);
		S.displayCart();
		System.out.println("*****CUSTOMER 2 DETAILS*****");
		S.customerName = "Naveenkumar";

		S.addProducts("Laptop",55000, 2);
		S.caluculateTotal(10);
		S.displayCart();
	}

}
