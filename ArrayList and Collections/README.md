# Java ArrayList and Collections

Eight intermediate tasks on Java collections: `ArrayList`, wrapper classes, the `Collections` class, `Iterator` and `removeIf`, `HashMap`, `TreeMap` and lists of objects.

## Tasks

| File | Task | Covers | What it does |
|---|---|---|---|
| [Task1.java](Task1.java) | Shopping List | ArrayList<String> | `add`, `contains`, `remove` and `get` on a list |
| [Task2.java](Task2.java) | Marks Summary | ArrayList<Integer> and Collections | Autoboxing plus `Collections.max`, `min` and `sort` |
| [Task3.java](Task3.java) | Remove the Absentees | Iterator and removeIf | Safe removal with an `Iterator` and `removeIf` |
| [Task4.java](Task4.java) | Bursar's Queue | add, remove, set and `indexOf` | Uses a list as a queue: insert, find, replace and remove |
| [Task5.java](Task5.java) | Phone Book | HashMap<String, String> | `put`, `get`, `containsKey` and `getOrDefault` |
| [Task6.java](Task6.java) | Word Frequency | counting with a map | The `getOrDefault` counting pattern and a `TreeMap` |
| [Task7.java](Task7.java) | Class Ranking | `ArrayList` of objects | Sorts a list of objects with a lambda |
| [Task8.java](Task8.java) | Course Registers | map of lists | A `HashMap` whose values are lists |

## Sample output

**Task 6: Word Frequency**
```
Enter a sentence: the matatu passed the school and the matatu stopped
and: 1
matatu: 2
passed: 1
school: 1
stopped: 1
the: 3
9 words, 6 different
Most common: "the" (3 times)
```

**Task 8: Course Registers**
```
Java (3): [Amina, Chebet, Faith]
Networking (1): [Dahir]
Web Design (2): [Brian, Esther]
Largest class: Java
```

## Run a task

```bash
javac Task1.java
java Task1
```
