// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 2: Password Check

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final String SAVED_PASSWORD = "Delhi2026";
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        // Usernames ignore capitals; passwords must match exactly
        boolean userOk = username.equalsIgnoreCase("admin");
        boolean passwordOk = password.equals(SAVED_PASSWORD);

        if (userOk && passwordOk) {
            System.out.println("Login successful. Welcome, " + username + ".");
        } else if (userOk) {
            System.out.println("Wrong password. Passwords are case-sensitive.");
        } else {
            System.out.println("Unknown user.");
        }

        input.close();
    }
}
