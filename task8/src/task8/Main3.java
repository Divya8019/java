package task8;

import java.util.*;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline to filter even numbers, double them, and collect into a list
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)  // Filter even numbers
                                      .map(n -> n * 2)          // Double the numbers
                                      .collect(Collectors.toList());  // Collect to a list

        // Output the result
        System.out.println(result);
    }
}

