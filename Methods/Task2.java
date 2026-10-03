// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Methods Assignment
// Task 2: Matatu Tickets

public class Task2 {

    // Three parameters: the caller decides what goes on each ticket
    static void printTicket(String passenger, String route, int fare) {
        System.out.println("---------- TICKET ----------");
        System.out.println("Passenger: " + passenger);
        System.out.println("Route:     " + route);
        System.out.println("Fare:      KES " + fare);
    }

    public static void main(String[] args) {
        printTicket("Wanjiru Kamau", "Eastleigh - CBD", 50);
        printTicket("Hassan Omar", "CBD - Westlands", 70);
    }
}
