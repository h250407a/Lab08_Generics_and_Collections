# Lab 08: Generics and the Collections Framework

**Student Details:**
- **Name:** Anesu B Kahanda
- **Registration Number:** H250407A
- **Department:** Computer Science
- **Course:** Object-Oriented Programming in Java

---

## Overview
This laboratory examines compile-time type safety with generics and core Java collections:
1. Writing parameterized generic classes (`Box<T>`, `Pair<K, V>`).
2. Writing generic methods with bounded type parameters (`<T extends Comparable<T>>`).
3. Core collections: `List` (ordered), `Set` (unique), `Map` (key-value), and `Deque` (LIFO/FIFO).
4. Sorting collections using `Comparable<T>` and chained `Comparator<T>` extractors.
5. Understanding Java type erasure and why primitive arrays like `int[]` cannot satisfy generic type bounds directly.

---

## Files in this Directory

| File Name | Description |
|---|---|
| `GenericsDemo.java` | Program 8.1: Generic `Box<T>`, `Pair<K, V>`, generic `printAll()`, and bounded `maxOf()`. |
| `CollectionsDemo.java` | Program 8.2: Comprehensive usage of `ArrayList`, `TreeSet`, `HashMap`, frequency counting, and `ArrayDeque`. |
| `SortingDemo.java` | Program 8.3: Object sorting using natural order and reversed comparator extractors. |
| `IntegerListDemo.java` | Exercise 1: Stores 10 integers in an `ArrayList`, finds sum, maximum, and reverses the list. |
| `RemoveDuplicatesDemo.java` | Exercise 2: Strips duplicate strings by passing an `ArrayList` into a `LinkedHashSet`. |
| `CustomGenericStackDemo.java` | Exercise 3: Custom generic `GenericStack<T>` data structure backed by `ArrayList<T>`. |
| `WordFrequencyDemo.java` | Exercise 4: Parses words from a paragraph and outputs frequencies sorted in descending order. |
| `GenericBubbleSortDemo.java` | Exercise 5: Generic bubble sort algorithm bounded by `Comparable<T>` and explanation of primitive array limitations. |

---

## How to Compile and Run

To compile all files:
```bash
javac *.java
```

To run individual programs:
```bash
java GenericsDemo
java CollectionsDemo
java SortingDemo
java IntegerListDemo
java RemoveDuplicatesDemo
java CustomGenericStackDemo
java WordFrequencyDemo
java GenericBubbleSortDemo
```

---

## Expected Output Samples

### `WordFrequencyDemo.java`
```
Word Frequencies (Highest to Lowest):
and             : 2 times
is              : 2 times
java            : 2 times
a               : 1 times
language        : 1 times
object          : 1 times
oriented        : 1 times
popular         : 1 times
powerful        : 1 times
programming     : 1 times
```

### `GenericBubbleSortDemo.java`
```
Original Integer array: [64, 34, 25, 12, 22, 11, 90]
Sorted Integer array  : [11, 12, 22, 25, 34, 64, 90]

Original String array : [orange, apple, banana, mango, grape]
Sorted String array   : [apple, banana, grape, mango, orange]
```
