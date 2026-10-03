// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 1: Weekly Fares

public class Task1 {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        int[] fares = {100, 140, 100, 160, 120};

        int total = 0;
        // fares.length is 5, so i runs from 0 to 4
        for (int i = 0; i < fares.length; i++) {
            System.out.println(days[i] + ": KES " + fares[i]);
            total += fares[i];
        }

        System.out.println("Total for the week: KES " + total);
        System.out.println("Average per day: KES " + (double) total / fares.length);
    }
}
