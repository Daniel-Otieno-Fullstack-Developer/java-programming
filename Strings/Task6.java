// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Strings Assignment
// Task 6: Phone Number Check

import java.util.Scanner;

public class Task6 {

    // A Kenyan mobile number: 10 digits starting 07 or 01
    static boolean isValidPhone(String phone) {
        if (phone.length() != 10) {
            return false;
        }
        if (!phone.startsWith("07") && !phone.startsWith("01")) {
            return false;
        }
        for (char ch : phone.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Phone number: ");
            String phone = input.nextLine().replace(" ", "");   // allow 0712 345 678
            if (isValidPhone(phone)) {
                // Show it the international way: +254 and drop the first 0
                System.out.println("  Valid. International form: +254" + phone.substring(1));
            } else {
                System.out.println("  Not a valid Kenyan mobile number");
            }
        }

        input.close();
    }
}
