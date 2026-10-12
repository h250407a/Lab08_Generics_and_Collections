// Uses a Set to filter out duplicate elements from a collection of names.
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesDemo {
    public static void main(String[] args) {
        List<String> rawNames = new ArrayList<>();
        rawNames.add("Tariro");
        rawNames.add("Farai");
        rawNames.add("Tariro");
        rawNames.add("Kudzai");
        rawNames.add("Farai");
        rawNames.add("Nyasha");

        System.out.println("Original list with duplicates: " + rawNames);

        // LinkedHashSet retains insertion order while stripping duplicate entries
        Set<String> uniqueNames = new LinkedHashSet<>(rawNames);
        System.out.println("Cleaned set without duplicates: " + uniqueNames);
    }
}
