package module6;

import java.util.Arrays;
import java.util.Comparator;

// Define a generic interface for finding min and max
interface MinMax<T> {
    T findMin(T[] array);
    T findMax(T[] array);
}

// Implement the interface using a generic class
class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
    
    // Method to find the minimum value in an array
    @Override
    public T findMin(T[] array) {
        return Arrays.stream(array).min(Comparator.naturalOrder()).orElse(null);
    }
    
    // Method to find the maximum value in an array
    @Override
    public T findMax(T[] array) {
        return Arrays.stream(array).max(Comparator.naturalOrder()).orElse(null);
    }
}

// Main class to test the functionality
public class Main5 {
    public static void main(String[] args) {
        
        // Arrays of different types
        Integer[] intArray = {2, 4, 5, 1, 9, 0};
        String[] strArray = {"apple", "orange", "banana", "grape"};
        Character[] charArray = {'a', 'z', 'b', 'm', 'k'};
        Float[] floatArray = {2.4f, 5.6f, 1.2f, 9.8f, 0.3f};
        
        // Create MinMaxImpl objects for different types
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
        
        // Finding min and max values for different types of arrays
        System.out.println("Integer Array - Min: " + intMinMax.findMin(intArray) + ", Max: " + intMinMax.findMax(intArray));
        System.out.println("String Array - Min: " + strMinMax.findMin(strArray) + ", Max: " + strMinMax.findMax(strArray));
        System.out.println("Character Array - Min: " + charMinMax.findMin(charArray) + ", Max: " + charMinMax.findMax(charArray));
        System.out.println("Float Array - Min: " + floatMinMax.findMin(floatArray) + ", Max: " + floatMinMax.findMax(floatArray));
    }
}

