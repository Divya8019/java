package module7;

import java.util.ArrayList;
import java.util.NoSuchElementException;

 class GenericPriorityQueue<T extends Comparable<T>> {
    private ArrayList<T> heap;

    // Constructor to initialize the heap
    public GenericPriorityQueue() {
        heap = new ArrayList<>();
    }

    // Insert an element into the priority queue
    public void insert(T element) {
        heap.add(element);  // Add the new element to the end
        heapifyUp(heap.size() - 1);  // Restore the heap property
    }

    // Remove and return the highest priority (smallest) element
    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        T top = heap.get(0);
        T lastElement = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, lastElement);
            heapifyDown(0);
        }
        return top;
    }

    // Peek at the highest priority element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        return heap.get(0);
    }

    // Check if the priority queue is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Heapify up to maintain heap property after insertion
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        T element = heap.get(index);

        while (index > 0 && heap.get(parentIndex).compareTo(element) > 0) {
            heap.set(index, heap.get(parentIndex));
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
        heap.set(index, element);
    }

    // Heapify down to maintain heap property after removal
    private void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallest = index;

        // Check if left child is smaller than the current element
        if (leftChild < heap.size() && heap.get(leftChild).compareTo(heap.get(smallest)) < 0) {
            smallest = leftChild;
        }

        // Check if right child is smaller than the smallest so far
        if (rightChild < heap.size() && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChild;
        }

        // Swap and continue heapifying down if needed
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
public class Main9 {
    public static void main(String[] args) {
        // Test priority queue with Integer
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.insert(5);
        intQueue.insert(1);
        intQueue.insert(3);
        System.out.println("Integer Priority Queue (Min Element): " + intQueue.peek());  // 1
        System.out.println("Removed Element: " + intQueue.remove());  // 1
        System.out.println("New Min Element: " + intQueue.peek());  // 3

        // Test priority queue with Double
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.insert(5.5);
        doubleQueue.insert(1.1);
        doubleQueue.insert(3.3);
        System.out.println("Double Priority Queue (Min Element): " + doubleQueue.peek());  // 1.1
        System.out.println("Removed Element: " + doubleQueue.remove());  // 1.1
        System.out.println("New Min Element: " + doubleQueue.peek());  // 3.3

        // Test priority queue with String
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>();
        stringQueue.insert("banana");
        stringQueue.insert("apple");
        stringQueue.insert("cherry");
        System.out.println("String Priority Queue (Min Element): " + stringQueue.peek());  // apple
        System.out.println("Removed Element: " + stringQueue.remove());  // apple
        System.out.println("New Min Element: " + stringQueue.peek());  // banana
    }
}

