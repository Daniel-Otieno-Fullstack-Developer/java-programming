// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 1: Fees Reminder

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = input.nextLine();
        System.out.print("Fee balance owed (KES): ");
        int balance = input.nextInt();

        // Only students who still owe money get the reminder
        if (balance > 0) {
            System.out.println("Reminder: " + name + " owes KES " + balance);
            System.out.println("Please clear the balance before exams.");
        }

        // This line runs for everyone
        System.out.println("Thank you for checking, " + name + ".");

        input.close();
    }
}
