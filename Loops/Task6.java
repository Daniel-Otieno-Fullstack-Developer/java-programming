// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 6: Guess the Number

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        final int SECRET = 37;
        Scanner input = new Scanner(System.in);
        int guesses = 0;

        System.out.println("I am thinking of a number from 1 to 100.");
        // Keep going until break: we cannot know how many guesses it will take
        while (true) {
            System.out.print("Your guess: ");
            int guess = input.nextInt();
            guesses++;

            if (guess == SECRET) {
                System.out.println("Correct! You got it in " + guesses + " guesses.");
                break;
            } else if (guess > SECRET) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }

        input.close();
    }
}
