// Counts word frequencies using a Map and displays them sorted descending by frequency.
import java.util.*;

public class WordFrequencyDemo {
    public static void main(String[] args) {
        String paragraph = "Java is a popular programming language and Java is object oriented and powerful";
        System.out.println("Input Paragraph:\n\"" + paragraph + "\"\n");

        // Step 1: Count word occurrences using HashMap
        Map<String, Integer> countMap = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("\\s+");

        for (String w : words) {
            countMap.put(w, countMap.getOrDefault(w, 0) + 1);
        }

        // Step 2: Sort entries by frequency descending
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(countMap.entrySet());
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Word Frequencies (Highest to Lowest):");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.printf("%-15s : %d times%n", entry.getKey(), entry.getValue());
        }
    }
}
