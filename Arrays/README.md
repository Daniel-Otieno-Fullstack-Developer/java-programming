# Java Arrays

Eight beginner tasks on Java arrays: creating and indexing them, totals and averages, linear search, bubble sort, 2D arrays and the `Arrays` class.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Weekly Fares | `int[]` and `String[]` | Parallel arrays of days and fares, with total and average |
| [Task2.java](Task2.java) | Class Marks | `new` int[n] | Fills an array from the keyboard, then finds highest, lowest, average |
| [Task3.java](Task3.java) | Above Average | two passes | One loop finds the average, a second compares each mark |
| [Task4.java](Task4.java) | Find a Student | linear search | A linear search method that returns an index or -1 |
| [Task5.java](Task5.java) | Bubble Sort | sorting with swaps | Bubble sort with a swap, showing each pass |
| [Task6.java](Task6.java) | Arrays Class Tools | java.util.Arrays | Uses `copyOf`, `sort`, `binarySearch`, `fill` and `equals` |
| [Task7.java](Task7.java) | Mark Sheet | 2D array | Row and column averages of a 2D array |
| [Task8.java](Task8.java) | Grade Count | counting array | An array of counters drawn as a bar chart |

## Sample output

**Task 5: Bubble Sort**
```
Before:       [450, 120, 380, 90, 250]
After pass 1: [120, 380, 90, 250, 450]
After pass 2: [120, 90, 250, 380, 450]
After pass 3: [90, 120, 250, 380, 450]
After pass 4: [90, 120, 250, 380, 450]
```

**Task 7: Mark Sheet**
```
Name      Java   Web Maths Average
Amina       78    65    70    71.0
Brian       55    72    48    58.3
Chebet      90    84    77    83.7
Subject   74.3  73.7  65.0
```

## Run a task

```bash
javac Task1.java
java Task1
```
