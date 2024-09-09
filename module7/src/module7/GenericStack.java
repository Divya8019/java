package module7;

public interface GenericStack<T> { 
    void push(T element); 
    T pop(); 
    T peek(); 
    boolean isEmpty(); 
}
