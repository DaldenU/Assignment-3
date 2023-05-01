import java.util.LinkedList;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    private LinkedList<T> linkStack; //Declaration of an LinkedList to hold the elements of the stack.

    public MyLinkedListStack() {
        linkStack = new LinkedList<>(); //Initialisation of LinkedList in the constructor
    }

    public void push(T element) {
        linkStack.addFirst(element); //adds an element to the top of the stack
    }

    public boolean isEmpty() {
        return linkStack.isEmpty(); //returns true if the stack is empty, otherwise false
    }

    public T pop() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return linkStack.removeFirst(); //returns the top element of the stack, while removing it
    }

    public T peek() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return linkStack.getFirst(); //returns the top element of the stack, without removing it
    }

    public int size() {
        return linkStack.size(); //returns the size of stack
    }
}
