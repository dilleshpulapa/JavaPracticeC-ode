package javaBasics;

public class Pencils {
	int amount =100;
	int pencilcost = 7;
	int pencils=amount/pencilcost;
	int remainingamount = amount%pencilcost;

	
	public static void main(String[] args) {
		Pencils p= new Pencils();
		
		
		System.out.println("the total amount :"+p.amount);
		System.out.println("the each pencil cost :"+p.pencilcost);
		System.out.println("the total pencils :"+p.pencils);
		System.out.println("the remaining amount :"+p.remainingamount);
	}
}
