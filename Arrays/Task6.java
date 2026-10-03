// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 6: Arrays Class Tools

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] scores = {58, 91, 73, 40, 66, 85};

        // copyOf makes a separate array, so sorting it leaves the original alone
        int[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);

        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted:   " + Arrays.toString(sorted));
        System.out.println("Top three: " + sorted[sorted.length - 1] + ", "
                + sorted[sorted.length - 2] + ", " + sorted[sorted.length - 3]);

        // binarySearch only works on a sorted array
        int where = Arrays.binarySearch(sorted, 73);
        System.out.println("73 is at index " + where + " of the sorted array");

        int[] bonus = new int[4];
        Arrays.fill(bonus, 5);
        System.out.println("Bonus marks: " + Arrays.toString(bonus));
        System.out.println("Same marks? " + Arrays.equals(scores, sorted));
    }
}
