// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 2: Plot Measurements

import java.util.Scanner;

class Plot {
    double length;
    double width;

    // The constructor sets up a new Plot as soon as it is created
    Plot(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double fenceNeeded() {
        return 2 * (length + width);
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length of the plot (m): ");
        double length = input.nextDouble();
        System.out.print("Width of the plot (m): ");
        double width = input.nextDouble();

        Plot plot = new Plot(length, width);
        System.out.println("Area: " + plot.area() + " square metres");
        System.out.println("Fence needed: " + plot.fenceNeeded() + " m");

        Plot garden = new Plot(6, 4);
        System.out.println("The college garden is " + garden.area() + " square metres");

        input.close();
    }
}
