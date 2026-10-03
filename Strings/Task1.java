// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 1: Name Formatter

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine().trim();   // trim removes stray spaces at the ends

        int space = fullName.indexOf(' ');
        String firstName = fullName.substring(0, space);
        String lastName = fullName.substring(space + 1);

        System.out.println("Upper case:   " + fullName.toUpperCase());
        System.out.println("Lower case:   " + fullName.toLowerCase());
        System.out.println("First name:   " + firstName);
        System.out.println("Last name:    " + lastName);
        System.out.println("Initials:     " + firstName.charAt(0) + "." + lastName.charAt(0) + ".");
        System.out.println("Characters:   " + fullName.length());

        input.close();
    }
}
