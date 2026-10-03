// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 8: Word Statistics

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        // split on one or more spaces
        String[] words = sentence.split(" +");

        String longest = words[0];
        int totalLetters = 0;
        for (String word : words) {
            totalLetters += word.length();
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Words: " + words.length);
        System.out.println("Longest word: " + longest);
        System.out.printf("Average word length: %.2f%n", (double) totalLetters / words.length);
        System.out.println("First word: " + words[0]);
        System.out.println("Last word: " + words[words.length - 1]);
        System.out.println("Joined with dashes: " + String.join("-", words));

        input.close();
    }
}
