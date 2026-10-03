// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 6: Visitor Counter

class Visitor {
    // static: ONE counter shared by every Visitor object
    private static int count = 0;

    // instance fields: each Visitor has its own
    private final int ticketNumber;
    private final String name;

    Visitor(String name) {
        this.name = name;
        count++;
        this.ticketNumber = count;
    }

    static int getCount() {
        return count;
    }

    String badge() {
        return "Ticket " + ticketNumber + ": " + name;
    }
}

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Visitors so far: " + Visitor.getCount());

        Visitor v1 = new Visitor("Mr. Otieno");
        Visitor v2 = new Visitor("Mrs. Hassan");
        Visitor v3 = new Visitor("Ms. Njeri");

        System.out.println(v1.badge());
        System.out.println(v2.badge());
        System.out.println(v3.badge());
        System.out.println("Visitors so far: " + Visitor.getCount());
    }
}
