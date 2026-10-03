// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 2: Vehicles and Buses

import java.util.Scanner;

class Vehicle {
    protected final String plate;
    protected final int wheels;

    Vehicle(String plate, int wheels) {
        this.plate = plate;
        this.wheels = wheels;
        System.out.println("Vehicle part set up for " + plate);
    }

    String describe() {
        return plate + " with " + wheels + " wheels";
    }
}

class Bus extends Vehicle {
    private final int seats;

    Bus(String plate, int seats) {
        super(plate, 6);             // must be the first line: the parent is built first
        this.seats = seats;
        System.out.println("Bus part set up: " + seats + " seats");
    }

    int fullFareTakings(int fare) {
        return seats * fare;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bus plate: ");
        String plate = input.nextLine();
        System.out.print("Seats: ");
        int seats = input.nextInt();
        System.out.print("Fare (KES): ");
        int fare = input.nextInt();

        Bus bus = new Bus(plate, seats);
        System.out.println(bus.describe());
        System.out.println("A full trip earns KES " + bus.fullFareTakings(fare));

        input.close();
    }
}
