// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 6: Seconds Alive

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final int SECONDS_PER_DAY = 24 * 60 * 60;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an age in years: ");
        int years = input.nextInt();

        // int arithmetic overflows past 2,147,483,647 and gives a wrong answer
        int secondsAsInt = years * 365 * SECONDS_PER_DAY;
        // Starting with a long (the L) makes the whole calculation use long
        long secondsAsLong = years * 365L * SECONDS_PER_DAY;

        System.out.println("Using int:  " + secondsAsInt);
        System.out.println("Using long: " + secondsAsLong);

        input.close();
    }
}
