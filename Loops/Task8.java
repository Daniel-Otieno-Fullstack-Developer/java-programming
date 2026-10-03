// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Loops Assignment
// Task 8: Vowel Counter

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type a sentence: ");
        String sentence = input.nextLine();

        int vowels = 0;
        int letters = 0;
        // The enhanced for loop visits every character in turn
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + (letters - vowels));

        input.close();
    }
}
