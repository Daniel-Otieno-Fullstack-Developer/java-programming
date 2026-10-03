// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 4: Palindrome Checker

import java.util.Scanner;

public class Task4 {

    // Keeps only the letters, in lower case, so spaces and capitals do not matter
    static String cleanUp(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }

    static boolean isPalindrome(String text) {
        String clean = cleanUp(text);
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Word or phrase: ");
            String text = input.nextLine();
            if (isPalindrome(text)) {
                System.out.println("\"" + text + "\" is a palindrome");
            } else {
                System.out.println("\"" + text + "\" is not a palindrome");
            }
        }

        input.close();
    }
}
