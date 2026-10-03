// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 5: Phone Book

import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Each key (a name) maps to one value (a phone number)
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Registrar", "0712 100 200");
        phoneBook.put("Bursar", "0712 100 300");
        phoneBook.put("ICT Office", "0712 100 400");
        phoneBook.put("Library", "0712 100 500");
        phoneBook.put("Bursar", "0712 100 333");     // same key: the old number is replaced

        System.out.println(phoneBook.size() + " contacts saved");
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) {
            System.out.print("Who do you want to call? ");
            String name = input.nextLine();
            if (phoneBook.containsKey(name)) {
                System.out.println("  " + name + ": " + phoneBook.get(name));
            } else {
                System.out.println("  No number for " + name);
            }
        }

        System.out.println("Hostel: " + phoneBook.getOrDefault("Hostel", "not listed"));
        input.close();
    }
}
