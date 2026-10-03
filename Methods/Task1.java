// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 1: Welcome Banner

public class Task1 {

    // A void method: it does a job but gives nothing back
    static void showBanner() {
        System.out.println("******************************");
        System.out.println("   WELCOME TO DELHI COLLEGE");
        System.out.println("******************************");
    }

    public static void main(String[] args) {
        showBanner();
        System.out.println("Today: Java Methods, Room 4");
        System.out.println("Bring your notes and a flash disk.");
        showBanner();   // written once, used twice
    }
}
