// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 1: Student Record

// The blueprint: every Student object gets its own copy of these fields
class Student {
    String name;
    int admissionNumber;
    String course;
    int mark;

    void printRecord() {
        System.out.println(admissionNumber + "  " + name + "  (" + course + ")  mark " + mark);
    }

    boolean hasPassed() {
        return mark >= 40;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student first = new Student();
        first.name = "Amina Wanjiku";
        first.admissionNumber = 4521;
        first.course = "Diploma in ICT";
        first.mark = 72;

        Student second = new Student();
        second.name = "Brian Kiprop";
        second.admissionNumber = 4533;
        second.course = "Certificate in ICT";
        second.mark = 38;

        first.printRecord();
        second.printRecord();
        System.out.println(first.name + " passed: " + first.hasPassed());
        System.out.println(second.name + " passed: " + second.hasPassed());
    }
}
