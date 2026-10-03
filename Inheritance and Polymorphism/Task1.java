// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 1: People at College

class Person {
    protected String name;
    protected String phone;

    Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    void introduce() {
        System.out.println("I am " + name + ", phone " + phone);
    }
}

// A Lecturer IS A Person, so it gets name, phone and introduce() for free
class Lecturer extends Person {
    private final String department;

    Lecturer(String name, String phone, String department) {
        super(name, phone);          // let Person set up its own fields
        this.department = department;
    }

    void teach(String unit) {
        System.out.println(name + " (" + department + ") is teaching " + unit);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Person visitor = new Person("Fatuma Ali", "0722 111 222");
        Lecturer lecturer = new Lecturer("Peter Mwangi", "0711 333 444", "ICT");

        visitor.introduce();
        lecturer.introduce();        // inherited from Person
        lecturer.teach("Java Programming");
    }
}
