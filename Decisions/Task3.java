// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 3: Grade Calculator

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0-100): ");
        int mark = input.nextInt();

        // Check for impossible marks first, then go from the top band down
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid mark");
        } else if (mark >= 70) {
            System.out.println("Grade: A");
        } else if (mark >= 60) {
            System.out.println("Grade: B");
        } else if (mark >= 50) {
            System.out.println("Grade: C");
        } else if (mark >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }

        input.close();
    }
}
