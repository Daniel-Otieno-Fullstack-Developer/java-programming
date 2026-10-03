// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 5: Leap Year Checker

import java.util.Scanner;

public class Task5 {

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    // One method can call another
    static int daysInFebruary(int year) {
        if (isLeapYear(year)) {
            return 29;
        }
        return 28;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        System.out.println("February " + year + " has " + daysInFebruary(year) + " days");

        input.close();
    }
}
