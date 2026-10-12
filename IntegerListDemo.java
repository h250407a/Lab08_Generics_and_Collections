// Stores 10 integers in an ArrayList and computes sum, max, and reversed order.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int[] data = {14, 28, 5, 92, 47, 63, 81, 36, 19, 74};

        for (int num : data) {
            numbers.add(num);
        }

        System.out.println("Original List: " + numbers);

        // Calculate sum and maximum
        int sum = 0;
        int max = numbers.get(0);
        for (int val : numbers) {
            sum += val;
            if (val > max) {
                max = val;
            }
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Maximum element: " + max);

        // Reverse the list
        List<Integer> reversed = new ArrayList<>(numbers);
        Collections.reverse(reversed);
        System.out.println("Reversed List  : " + reversed);
    }
}
