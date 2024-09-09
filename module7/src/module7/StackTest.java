package module7;
public class StackTest { 
    public static void main(String[] args) { 
        // Test LinkedListStack 
        System.out.println("Testing LinkedListStack:"); 
        GenericStack<Integer> linkedListStack = new LinkedListStack<>(); 
        linkedListStack.push(1); 
        linkedListStack.push(2); 
        linkedListStack.push(3); 
        System.out.println("Peek: " + linkedListStack.peek()); 
        System.out.println("Pop: " + linkedListStack.pop()); 
        System.out.println("Peek after pop: " + linkedListStack.peek()); 
        System.out.println("Is empty: " + linkedListStack.isEmpty()); 
        System.out.println(); 
 
        // Test ArrayStack 
        System.out.println("Testing ArrayStack:"); 
        GenericStack<String> arrayStack = new ArrayStack<>(); 
        arrayStack.push("A"); 
        arrayStack.push("B"); 
        arrayStack.push("C"); 
        System.out.println("Peek: " + arrayStack.peek()); 
        System.out.println("Pop: " + arrayStack.pop()); 
        System.out.println("Peek after pop: " + arrayStack.peek()); 
        System.out.println("Is empty: " + arrayStack.isEmpty()); 
    } 
}
