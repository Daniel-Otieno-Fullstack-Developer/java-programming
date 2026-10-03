// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 5: Bubble Sort

import java.util.Arrays;

public class Task5 {

    // Repeatedly swaps neighbours that are in the wrong order
    static void bubbleSort(int[] numbers) {
        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int i = 0; i < numbers.length - 1 - pass; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            System.out.println("After pass " + (pass + 1) + ": " + Arrays.toString(numbers));
        }
    }

    public static void main(String[] args) {
        int[] prices = {450, 120, 380, 90, 250};
        System.out.println("Before:       " + Arrays.toString(prices));
        bubbleSort(prices);
    }
}
