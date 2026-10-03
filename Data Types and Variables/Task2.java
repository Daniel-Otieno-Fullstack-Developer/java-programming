// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 2: Age Calculator

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2026;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth: ");
        int birthYear = input.nextInt();

        // Ages are whole numbers, so int is the right type
        int age = CURRENT_YEAR - birthYear;
        System.out.println("You are " + age + " years old");

        input.close();
    }
}
