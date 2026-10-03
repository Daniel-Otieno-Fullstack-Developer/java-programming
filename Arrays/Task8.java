// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 8: Grade Count

public class Task8 {
    public static void main(String[] args) {
        int[] marks = {82, 64, 71, 45, 58, 33, 90, 67, 52, 74, 61, 39};
        char[] grades = {'A', 'B', 'C', 'D', 'E'};
        int[] counts = new int[grades.length];   // starts as five zeros

        for (int mark : marks) {
            // Work out which slot to add one to: 0 for A, 1 for B, ...
            int slot;
            if (mark >= 70) {
                slot = 0;
            } else if (mark >= 60) {
                slot = 1;
            } else if (mark >= 50) {
                slot = 2;
            } else if (mark >= 40) {
                slot = 3;
            } else {
                slot = 4;
            }
            counts[slot]++;
        }

        System.out.println("Grade summary for " + marks.length + " students:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i] + ": " + "*".repeat(counts[i]) + " (" + counts[i] + ")");
        }
    }
}
