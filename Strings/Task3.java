// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 3: Character Count

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String text = input.nextLine();

        int letters = 0, digits = 0, spaces = 0, others = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits:  " + digits);
        System.out.println("Spaces:  " + spaces);
        System.out.println("Others:  " + others);

        input.close();
    }
}
