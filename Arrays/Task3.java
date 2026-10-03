// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 3: Above Average

public class Task3 {
    public static void main(String[] args) {
        String[] names = {"Amina", "Brian", "Chebet", "Dahir", "Esther", "Faith"};
        int[] marks = {72, 48, 65, 81, 55, 60};

        // First pass: work out the average
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = (double) total / marks.length;
        System.out.println("Class average: " + average);

        // Second pass: compare each mark with it
        System.out.println("Above average:");
        int above = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > average) {
                System.out.println("  " + names[i] + " (" + marks[i] + ")");
                above++;
            }
        }
        System.out.println(above + " of " + marks.length + " students are above average");
    }
}
