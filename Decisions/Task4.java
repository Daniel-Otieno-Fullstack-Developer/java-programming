// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 4: Matatu Peak Fare

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        final int NORMAL_FARE = 70;
        final int PEAK_FARE = 100;
        final int NIGHT_FARE = 120;
        Scanner input = new Scanner(System.in);

        System.out.print("Hour of travel (0-23): ");
        int hour = input.nextInt();

        boolean morningRush = hour >= 6 && hour <= 8;
        boolean eveningRush = hour >= 17 && hour <= 19;
        boolean lateNight = hour >= 22 || hour < 5;

        int fare;
        if (morningRush || eveningRush) {
            fare = PEAK_FARE;
        } else if (lateNight) {
            fare = NIGHT_FARE;
        } else {
            fare = NORMAL_FARE;
        }

        if (hour < 0 || hour > 23) {
            System.out.println("That is not a valid hour");
        } else {
            System.out.println("Fare at " + hour + ":00 is KES " + fare);
        }

        input.close();
    }
}
