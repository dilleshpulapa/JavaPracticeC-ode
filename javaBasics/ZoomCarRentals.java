package javaBasics;

import java.util.Scanner;

public class ZoomCarRentals {

    static Scanner SC = new Scanner(System.in);

    String companyName() {
        return "ZOOM CAR RENTALS";
    }

    double dailyRate() {
        return 1500;
    }

    double calculateBaseRent(int days) {
        return dailyRate() * days;
    }

    double insuranceFee() {
        return 500;
    }

    double calculateTotalCost(double baseRent, double insurance) {
        double totalCost = baseRent + insurance;
        return totalCost;
    }

    public static void main(String[] args) {

        ZoomCarRentals Z = new ZoomCarRentals();

        // Company Name
        String company = Z.companyName();
        System.out.println(company);

        // Daily Rent
        double dailyRent = Z.dailyRate();
        System.out.println("The Daily Rent: " + dailyRent);

        // Number of days
        System.out.println("How many days for rent:");
        int days = SC.nextInt();

        // Calculate Base Rent
        double baseRent = Z.calculateBaseRent(days);
        System.out.println("The Base Rent is: " + baseRent);

        // Insurance Fee
        double insurance = Z.insuranceFee();
        System.out.println("The Insurance Fee: " + insurance);

        // Calculate Total Cost
        double totalAmount = Z.calculateTotalCost(baseRent, insurance);

        
        System.out.println("Total Cost of Rent: " + totalAmount);
    }
}