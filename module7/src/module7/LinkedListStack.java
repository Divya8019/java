package module7;
import java.util.LinkedList; 

public class LinkedListStack<T> implements GenericStack<T> { 
    private LinkedList<T> list = new LinkedList<>(); 
 
    @Override 
    public void push(T element) { 
        list.addFirst(element); 
    } 
 
    @Override 
    public T pop() { 
        if (isEmpty()) { 
            throw new IllegalStateException("Stack is empty"); 
        } 
        return list.removeFirst(); 
    } 
 
    @Override 
    public T peek() { 
        if (isEmpty()) { 
            throw new IllegalStateException("Stack is empty"); 
        } 
        return list.getFirst(); 
    } 
 
    @Override 
    public boolean isEmpty() { 
        return list.isEmpty(); 
    } 
}
