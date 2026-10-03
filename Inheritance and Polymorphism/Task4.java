// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 4: Shapes

abstract class Shape {
    private final String label;

    Shape(String label) {
        this.label = label;
    }

    // Every shape has an area, but only the subclasses know how to work it out
    abstract double area();

    String getLabel() {
        return label;
    }
}

class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private final double length, width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    private final double base, height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class Task4 {
    public static void main(String[] args) {
        // A Shape array can hold any kind of shape
        Shape[] shapes = {new Circle(3), new Rectangle(5, 4), new Triangle(6, 2.5)};

        double total = 0;
        for (Shape s : shapes) {
            System.out.printf("%-10s area %7.2f%n", s.getLabel(), s.area());
            total += s.area();
        }
        System.out.printf("Total area: %.2f%n", total);
    }
}
