import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    private ArrayList<T> arrStack; //Declaration of an ArrayList to hold the elements of the stack.

    public MyArrayListStack() {
        arrStack = new ArrayList<>(); //Initialisation of ArrayList in the constructor
    }

    public void push(T element) {
        arrStack.add(element); //adds an element to the top of the stack
    }

    public int size() {
        return arrStack.size(); //returns the size of stack
    }

    public boolean isEmpty() {
        return arrStack.isEmpty(); //returns true if the stack is empty, otherwise false
    }

    public T pop() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return arrStack.remove(size() - 1); //returns the top element of the stack, while removing it
    }

    public T peek() {
        if (isEmpty()) { //checks for whether the stack is empty
            throw new EmptyStackException(); //throws an exception if true
        }
        return arrStack.get(size() - 1); //returns the top element of the stack, without removing it
    }
}
