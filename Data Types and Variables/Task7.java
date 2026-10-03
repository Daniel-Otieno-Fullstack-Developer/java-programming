// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Data Types and Variables Assignment
// Task 7: About Me

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // nextLine reads the whole line, spaces included
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.print("Enter your course: ");
        String course = input.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = input.nextLine();   // a String: we never do arithmetic on it

        System.out.println();
        System.out.println("Name:   " + fullName);
        System.out.println("Course: " + course);
        System.out.println("Phone:  " + phone);
        System.out.println("Your name has " + fullName.length() + " characters");

        input.close();
    }
}
