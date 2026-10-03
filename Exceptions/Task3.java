// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 3: Class List Lookup

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] classList = {"Amina", "Brian", "Chebet", "Dahir", "Esther"};
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Position on the list (1-5): ");
            String typed = input.nextLine();
            try {
                int position = Integer.parseInt(typed);       // may throw NumberFormatException
                String name = classList[position - 1];      // may throw ArrayIndexOutOfBounds...
                System.out.println("  Student " + position + " is " + name);
            } catch (NumberFormatException e) {
                System.out.println("  \"" + typed + "\" is not a number");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("  There is no student at position " + typed);
            }
        }

        input.close();
    }
}
