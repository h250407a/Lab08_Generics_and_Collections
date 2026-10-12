// Implements generic bubble sort bounded by Comparable<T> and tests on reference arrays.
import java.util.Arrays;

public class GenericBubbleSortDemo {
    // Generic bubble sort with bounded type parameter
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Integer array: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("Sorted Integer array  : " + Arrays.toString(numbers));

        String[] fruits = {"orange", "apple", "banana", "mango", "grape"};
        System.out.println("\nOriginal String array : " + Arrays.toString(fruits));
        bubbleSort(fruits);
        System.out.println("Sorted String array   : " + Arrays.toString(fruits));

        System.out.println("\nWhy 'int[]' will not compile:");
        System.out.println("1. Java generics operate solely on reference types (subtypes of Object). Primitive types like 'int' cannot substitute type parameter T.");
        System.out.println("2. An 'int[]' is an object, but its elements are primitive ints, which do not implement Comparable<int>.");
        System.out.println("3. Therefore, developers must use the wrapper class array 'Integer[]' rather than the primitive array 'int[]'.");
    }
}
