// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 4: Exam Session

import java.util.Scanner;

public class Task4 {

    // finally runs whether the try block worked or not
    static void markScript(String student, String answer) {
        System.out.println("Opening script for " + student);
        try {
            int score = Integer.parseInt(answer);
            System.out.println("  Score recorded: " + score);
        } catch (NumberFormatException e) {
            System.out.println("  Could not read the score \"" + answer + "\"");
        } finally {
            System.out.println("  Script for " + student + " returned to the file");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Score for Amina: ");
        markScript("Amina", input.nextLine());
        System.out.print("Score for Brian: ");
        markScript("Brian", input.nextLine());

        input.close();
    }
}
