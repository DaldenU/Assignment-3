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
}
