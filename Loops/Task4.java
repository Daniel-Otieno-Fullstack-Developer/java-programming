// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 4: PIN Attempts

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        final int CORRECT_PIN = 4321;
        final int MAX_TRIES = 3;
        Scanner input = new Scanner(System.in);
        int tries = 0;
        int pin;

        // do while: the user must be asked at least once
        do {
            System.out.print("Enter PIN: ");
            pin = input.nextInt();
            tries++;
            if (pin != CORRECT_PIN && tries < MAX_TRIES) {
                System.out.println("Wrong PIN. Tries left: " + (MAX_TRIES - tries));
            }
        } while (pin != CORRECT_PIN && tries < MAX_TRIES);

        if (pin == CORRECT_PIN) {
            System.out.println("Welcome! Access granted after " + tries + " tries.");
        } else {
            System.out.println("Too many wrong tries. Account locked.");
        }

        input.close();
    }
}
