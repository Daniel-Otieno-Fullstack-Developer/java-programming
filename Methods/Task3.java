// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 3: Circle Calculator

import java.util.Scanner;

public class Task3 {

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Rounds to two decimal places, e.g. 153.938... becomes 153.94
    static double round2(double value) {
        return Math.round(value * 100) / 100.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Radius of the garden (m): ");
        double radius = input.nextDouble();

        // The value each method returns is used straight away
        System.out.println("Area: " + round2(area(radius)) + " square metres");
        System.out.println("Fence needed: " + round2(circumference(radius)) + " m");

        input.close();
    }
}
