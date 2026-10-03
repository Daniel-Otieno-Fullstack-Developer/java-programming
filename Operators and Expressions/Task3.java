// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Operators and Expressions Assignment
// Task 3: Time Converter

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / SECONDS_PER_HOUR;
        int remaining = totalSeconds % SECONDS_PER_HOUR;   // seconds not used by the hours
        int minutes = remaining / SECONDS_PER_MINUTE;
        int seconds = remaining % SECONDS_PER_MINUTE;

        System.out.println(totalSeconds + " seconds is " + hours + " h " + minutes
                + " min " + seconds + " s");

        input.close();
    }
}
