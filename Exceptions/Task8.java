// Author: Daniel Otieno Odero - ICT Department, Delhi College
// Course: Java Programming - Exceptions Assignment
// Task 8: Mark Sheet Cleaner

// An unchecked exception: extends RuntimeException, so no throws clause is needed
class InvalidMarkException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    InvalidMarkException(int mark) {
        super("mark " + mark + " is outside 0 to 100");
    }
}

public class Task8 {

    static int parseMark(String text) {
        int mark = Integer.parseInt(text.trim());   // may throw NumberFormatException
        if (mark < 0 || mark > 100) {
            throw new InvalidMarkException(mark);
        }
        return mark;
    }

    public static void main(String[] args) {
        String[] rawMarks = {"72", " 65", "abc", "105", "48", "", "-3", "90"};
        int total = 0, good = 0, bad = 0;

        for (String raw : rawMarks) {
            try {
                total += parseMark(raw);
                good++;
            } catch (NumberFormatException | InvalidMarkException e) {
                // one catch block for two kinds of problem
                bad++;
                System.out.println("Skipped \"" + raw + "\": " + e.getMessage());
            }
        }

        System.out.println(good + " good marks, " + bad + " skipped");
        System.out.println("Average of good marks: " + (double) total / good);
    }
}
