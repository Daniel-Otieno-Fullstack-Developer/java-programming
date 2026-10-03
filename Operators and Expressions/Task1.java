// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 1: Matatu Fare Budget

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fare for one trip (KES): ");
        int fare = input.nextInt();
        System.out.print("Trips per day: ");
        int tripsPerDay = input.nextInt();
        System.out.print("School days per week: ");
        int daysPerWeek = input.nextInt();

        // Multiply first, then multiply again for four weeks
        int weeklyCost = fare * tripsPerDay * daysPerWeek;
        int monthlyCost = weeklyCost * 4;
        int dailyCost = fare * tripsPerDay;

        System.out.println("Daily cost:   KES " + dailyCost);
        System.out.println("Weekly cost:  KES " + weeklyCost);
        System.out.println("Monthly cost: KES " + monthlyCost);

        input.close();
    }
}
