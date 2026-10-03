# Java Strings

Eight beginner tasks on working with text in Java: `String` methods, `equals` and `compareTo`, the `Character` class, `StringBuilder`, `split` and `printf`.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Name Formatter | trim, `indexOf` and `substring` | Slices a name into parts and initials |
| [Task2.java](Task2.java) | Password Check | `equals` and equalsIgnoreCase | Case-insensitive username, case-sensitive password |
| [Task3.java](Task3.java) | Character Count | `charAt` and `Character` | Classifies every character with the `Character` class |
| [Task4.java](Task4.java) | Palindrome Checker | `StringBuilder.reverse` | Cleans the text and compares it with its reverse |
| [Task5.java](Task5.java) | Email Generator | split and toLowerCase | Builds an email from split name parts and the year |
| [Task6.java](Task6.java) | Phone Number Check | startsWith and validation | Checks length, prefix and digits, then formats +254 |
| [Task7.java](Task7.java) | Receipt Builder | `StringBuilder` and `String.format` | Formats aligned receipt lines into a `StringBuilder` |
| [Task8.java](Task8.java) | Word Statistics | split and `String.join` | Splits a sentence into words and analyses them |

## Sample output

**Task 1: Name Formatter**
```
Enter your full name: Amina Wanjiku
Upper case:   AMINA WANJIKU
Lower case:   amina wanjiku
First name:   Amina
Last name:    Wanjiku
Initials:     A.W.
Characters:   13
```

**Task 7: Receipt Builder**
```
DELHI COLLEGE BOOKSHOP
----------------------------------------
Exercise book      6 x  55.00    330.00
Pen               10 x  20.00    200.00
Maths set          1 x 350.00    350.00
Ream of paper      1 x 680.00    680.00
----------------------------------------
TOTAL (KES)                      1560.00
```

## Run a task

```bash
javac Task1.java
java Task1
```
