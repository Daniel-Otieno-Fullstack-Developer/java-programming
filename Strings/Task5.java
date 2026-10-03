// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 5: Email Generator

import java.util.Scanner;

public class Task5 {

    // e.g. "Amina Wanjiku", 2026 -> "amina.wanjiku26@delhicollege.ac.ke"
    static String makeEmail(String fullName, int year) {
        String[] parts = fullName.trim().toLowerCase().split(" ");
        String first = parts[0];
        String last = parts[parts.length - 1];
        String yearDigits = String.valueOf(year).substring(2);
        return first + "." + last + yearDigits + "@delhicollege.ac.ke";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Student's full name: ");
        String name = input.nextLine();
        System.out.print("Year of admission: ");
        int year = input.nextInt();

        String email = makeEmail(name, year);
        System.out.println("College email: " + email);
        System.out.println("Username:      " + email.substring(0, email.indexOf('@')));

        input.close();
    }
}
