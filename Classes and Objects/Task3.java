// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 3: Matatu Fleet

class Matatu {
    String plate;
    String route;
    int seats;

    // Full constructor: the caller gives every value
    Matatu(String plate, String route, int seats) {
        this.plate = plate;
        this.route = route;
        this.seats = seats;
    }

    // Shorter constructor: most matatus have 14 seats, so pass that on with this(...)
    Matatu(String plate, String route) {
        this(plate, route, 14);
    }

    void describe() {
        System.out.println(plate + " | " + route + " | " + seats + " seats");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Matatu m1 = new Matatu("KDA 123A", "Eastleigh - CBD");
        Matatu m2 = new Matatu("KCZ 456B", "CBD - Thika", 33);
        Matatu m3 = new Matatu("KDB 789C", "Eastleigh - Westlands");

        m1.describe();
        m2.describe();
        m3.describe();
        System.out.println("Fleet seats: " + (m1.seats + m2.seats + m3.seats));
    }
}
