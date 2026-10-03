// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 2: Even or Odd

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        // An even number leaves no remainder when divided by 2
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        input.close();
    }
}
