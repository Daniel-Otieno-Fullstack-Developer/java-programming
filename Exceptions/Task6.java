// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 6: Save and Load Marks

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task6 {

    // FileNotFoundException is CHECKED: the method must declare it with throws
    static void saveMarks(String fileName, int[] marks) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(fileName)) {   // closed automatically
            for (int mark : marks) {
                out.println(mark);
            }
        }
    }

    static double averageFromFile(String fileName) throws FileNotFoundException {
        int total = 0, count = 0;
        try (Scanner in = new Scanner(new File(fileName))) {
            while (in.hasNextInt()) {
                total += in.nextInt();
                count++;
            }
        }
        return (double) total / count;
    }

    public static void main(String[] args) {
        try {
            saveMarks("marks.txt", new int[] {64, 71, 58, 80});
            System.out.println("Saved four marks to marks.txt");
            System.out.println("Average from marks.txt: " + averageFromFile("marks.txt"));
            System.out.println("Average from old-marks.txt: " + averageFromFile("old-marks.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File problem: " + e.getMessage());
        }
    }
}
