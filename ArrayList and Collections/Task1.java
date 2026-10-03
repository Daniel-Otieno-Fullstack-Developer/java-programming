// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - ArrayList and Collections Assignment
// Task 1: Shopping List

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();   // starts empty and grows as needed

        System.out.println("Type items for the shopping list (done to finish):");
        String item = input.nextLine();
        while (!item.equalsIgnoreCase("done")) {
            if (list.contains(item)) {
                System.out.println("  " + item + " is already on the list");
            } else {
                list.add(item);
            }
            item = input.nextLine();
        }

        System.out.println("Items: " + list.size());
        System.out.println("List: " + list);

        list.remove("Sugar");          // remove by value
        System.out.println("After buying sugar: " + list);
        System.out.println("First item: " + list.get(0));

        input.close();
    }
}
