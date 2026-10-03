// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Arrays Assignment
// Task 4: Find a Student

import java.util.Scanner;

public class Task4 {

    // Linear search: returns the position of the name, or -1 if it is not there
    static int findStudent(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Amina", "Brian", "Chebet", "Dahir", "Esther"};
        String[] rooms = {"Room 2", "Room 4", "Lab 1", "Room 4", "Lab 2"};
        Scanner input = new Scanner(System.in);

        for (int search = 1; search <= 2; search++) {
            System.out.print("Name to find: ");
            String target = input.nextLine();
            int position = findStudent(names, target);
            if (position == -1) {
                System.out.println(target + " is not on the class list");
            } else {
                System.out.println(names[position] + " is student " + (position + 1)
                        + ", in " + rooms[position]);
            }
        }

        input.close();
    }
}
