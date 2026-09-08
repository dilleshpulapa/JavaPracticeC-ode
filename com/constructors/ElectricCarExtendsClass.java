package com.constructors;
 
class Vehicle {
    String type;
    
    Vehicle(){ 
    	System.out.println(" NO ARG CONSTRUCTOR !!");
    }

    // One-argument constructor
    Vehicle(String type) {
        this.type = type;
    }
}

class Car extends Vehicle {
    String brand;
    double price;

    // Three-argument constructor
    Car(String type, String brand, double price) {
        super(type); // Pass type to Vehicle constructor
        this.brand = brand;
        this.price = price;
    }
}

public class ElectricCarExtendsClass extends Car {
    double batteryCapacity;

    // Four-argument constructor
    ElectricCarExtendsClass(String type, String brand, double price, double batteryCapacity) {
        super(type, brand, price); // Pass values to Car constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Display method
    void display() {
    	System.out.println("********************************");
        System.out.println("Type             : " + type);
        System.out.println("Brand            : " + brand);
        System.out.println("Price            : " + price);
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
    }

    public static void main(String[] args) {
        // Creating ElectricCar object by passing all four values
        ElectricCarExtendsClass car = new ElectricCarExtendsClass(
            "Electric",
            "Tesla",
            45000.0,
            75.0
        );
        car.display();
        ElectricCarExtendsClass car1 = new ElectricCarExtendsClass(
                "Electric",
                "TATA SAFARI",
                450000.0,
                75.0
            );
        car.display();
    }
}