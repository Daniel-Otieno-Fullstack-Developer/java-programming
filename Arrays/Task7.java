// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 7: Mark Sheet

public class Task7 {
    public static void main(String[] args) {
        String[] students = {"Amina", "Brian", "Chebet"};
        String[] subjects = {"Java", "Web", "Maths"};
        // one row per student, one column per subject
        int[][] marks = {
            {78, 65, 70},
            {55, 72, 48},
            {90, 84, 77}
        };

        System.out.printf("%-8s", "Name");
        for (String subject : subjects) {
            System.out.printf("%6s", subject);
        }
        System.out.printf("%8s%n", "Average");

        for (int row = 0; row < marks.length; row++) {
            int total = 0;
            System.out.printf("%-8s", students[row]);
            for (int col = 0; col < marks[row].length; col++) {
                System.out.printf("%6d", marks[row][col]);
                total += marks[row][col];
            }
            System.out.printf("%8.1f%n", (double) total / marks[row].length);
        }

        // Column totals give each subject's average
        System.out.printf("%-8s", "Subject");
        for (int col = 0; col < subjects.length; col++) {
            int total = 0;
            for (int row = 0; row < marks.length; row++) {
                total += marks[row][col];
            }
            System.out.printf("%6.1f", (double) total / marks.length);
        }
        System.out.println();
    }
}
