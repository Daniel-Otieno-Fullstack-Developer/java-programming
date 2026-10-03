// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Classes and Objects Assignment
// Task 8: Library Loans

class Book {
    private final String title;
    private String borrower;   // null means the book is on the shelf

    Book(String title) {
        this.title = title;
    }

    boolean isAvailable() {
        return borrower == null;
    }

    void lendTo(String student) {
        if (isAvailable()) {
            borrower = student;
            System.out.println(title + " lent to " + student);
        } else {
            System.out.println("Sorry " + student + ", " + title + " is with " + borrower);
        }
    }

    void giveBack() {
        System.out.println(title + " returned by " + borrower);
        borrower = null;
    }
}

public class Task8 {
    public static void main(String[] args) {
        Book java = new Book("Java for Beginners");
        Book web = new Book("Web Design Basics");

        java.lendTo("Amina");
        java.lendTo("Brian");      // already out
        web.lendTo("Brian");
        java.giveBack();
        java.lendTo("Brian");      // now it is free

        System.out.println("Java book available? " + java.isAvailable());
        System.out.println("Web book available? " + web.isAvailable());
    }
}
