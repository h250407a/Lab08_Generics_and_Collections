// Shows object sorting via Comparable natural ordering and chained Comparator lambdas.
import java.util.*;

class Student implements Comparable<Student> {
    private final String name;
    private final double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    String getName() { return name; }
    double getGpa() { return gpa; }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + "(" + gpa + ")";
    }
}

public class SortingDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>(List.of(
            new Student("Kuda", 3.2),
            new Student("Ada", 3.9),
            new Student("Lynn", 3.5)
        ));

        // Sort by natural ordering (name)
        Collections.sort(list);
        System.out.println("By name: " + list);

        // Sort using Comparator by GPA descending
        list.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("By GPA desc: " + list);

        // Sort using Comparator by name descending
        list.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println("By name desc: " + list);
    }
}
