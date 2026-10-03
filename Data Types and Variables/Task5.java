// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 5: Pass or Fail

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final int PASS_MARK = 40;   // below 40 is an E, which is a fail
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark out of 100: ");
        int mark = input.nextInt();

        // A comparison already gives true or false, so store it straight in a boolean
        boolean passed = mark >= PASS_MARK;
        boolean distinction = mark >= 70;

        System.out.println("Passed: " + passed);
        System.out.println("Distinction (A): " + distinction);

        input.close();
    }
}
