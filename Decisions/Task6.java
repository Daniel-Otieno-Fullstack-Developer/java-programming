// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Decisions Assignment
// Task 6: Day of the Week

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int day = input.nextInt();

        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "not a day";
        }
        System.out.println("Day " + day + " is " + dayName);

        // Cases with no break fall through to the next one
        switch (day) {
            case 6:
            case 7:
                System.out.println("No classes today: it is the weekend");
                break;
            default:
                System.out.println("Classes start at 8:00 am");
        }

        input.close();
    }
}
