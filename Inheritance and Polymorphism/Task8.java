// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Inheritance and Polymorphism Assignment
// Task 8: Staff Roles

abstract class StaffMember {
    protected final String name;

    StaffMember(String name) {
        this.name = name;
    }

    abstract String duty();
}

class Teacher extends StaffMember {
    private final String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    String duty() {
        return "teaches " + subject;
    }

    String getSubject() {
        return subject;
    }
}

class Driver extends StaffMember {
    private final String busPlate;

    Driver(String name, String busPlate) {
        super(name);
        this.busPlate = busPlate;
    }

    @Override
    String duty() {
        return "drives " + busPlate;
    }
}

public class Task8 {
    public static void main(String[] args) {
        StaffMember[] staff = {
            new Teacher("Mr. Mutua", "Java"), new Driver("Mr. Kamau", "KDC 555X"),
            new Teacher("Ms. Wairimu", "Business"), new Driver("Mr. Ochieng", "KBZ 909Q")
        };

        int teachers = 0;
        for (StaffMember s : staff) {
            System.out.println(s.name + " " + s.duty());   // polymorphism
            // instanceof checks the real type; the pattern gives a Teacher variable
            if (s instanceof Teacher t) {
                teachers++;
                System.out.println("  -> timetable entry for " + t.getSubject());
            }
        }
        System.out.println("Teachers: " + teachers + ", drivers: " + (staff.length - teachers));
    }
}
