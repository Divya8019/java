package module7;
public class ArrayStack<T> implements GenericStack<T> { 
    private static final int INITIAL_CAPACITY = 10; 
    private Object[] array; 
    private int size; 
 
    public ArrayStack() { 
        array = new Object[INITIAL_CAPACITY]; 
        size = 0; 
    } 
 
    @Override 
    public void push(T element) { 
        ensureCapacity(); 
        array[size++] = element; 
    } 
 
    @SuppressWarnings("unchecked") 
    @Override 
    public T pop() { 
        if (isEmpty()) { 
            throw new IllegalStateException("Stack is empty"); 
        } 
        T element = (T) array[--size]; 
        array[size] = null; // Avoid memory leak 
        return element; 
    } 
 
    @SuppressWarnings("unchecked") 
    @Override 
    public T peek() { 
        if (isEmpty()) { 
            throw new IllegalStateException("Stack is empty"); 
        } 
        return (T) array[size - 1]; 
    } 
 
    @Override 
    public boolean isEmpty() { 
        return size == 0; 
    } 
 
    private void ensureCapacity() { 
        if (size == array.length) { 
            int newCapacity = array.length * 2; 
            Object[] newArray = new Object[newCapacity]; 
            System.arraycopy(array, 0, newArray, 0, size); 
            array = newArray; 
        } 
    } 
}
