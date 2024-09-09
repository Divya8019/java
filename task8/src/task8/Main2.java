package task8;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "banana", "grape");

        // Sort the list in descending order using a lambda expression
        strings.sort((s1, s2) -> s2.compareTo(s1));

        // Output the sorted list
        System.out.println(strings);
    }
}
