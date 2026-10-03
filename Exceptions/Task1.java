// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 1: Safe Number Input

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter your age: ");
            try {
                age = input.nextInt();    // throws if the user types letters
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("  That is not a whole number. Try again.");
                input.nextLine();         // throw away the bad input
            }
        }

        System.out.println("Thank you. In 5 years you will be " + (age + 5) + ".");
        input.close();
    }
}
