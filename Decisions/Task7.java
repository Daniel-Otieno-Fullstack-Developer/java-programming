// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 7: Grade Comments

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade (A-E): ");
        char grade = input.next().toUpperCase().charAt(0);

        // A switch expression gives back a value, so no break is needed
        String comment = switch (grade) {
            case 'A' -> "Excellent work";
            case 'B' -> "Very good";
            case 'C' -> "Good, keep improving";
            case 'D' -> "Fair, more effort needed";
            case 'E' -> "Poor, see your teacher";
            default -> "Unknown grade";
        };

        boolean passed = switch (grade) {
            case 'A', 'B', 'C', 'D' -> true;
            default -> false;
        };

        System.out.println("Comment: " + comment);
        System.out.println("Passed: " + passed);

        input.close();
    }
}
