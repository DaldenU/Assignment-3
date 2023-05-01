import java.util.LinkedList;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    private LinkedList<T> linkStack; //Declaration of an LinkedList to hold the elements of the stack.

    public MyLinkedListStack() {
        linkStack = new LinkedList<>(); //Initialisation of LinkedList in the constructor
    }

    public void push(T element) {
        linkStack.addFirst(element); ////adds an element to the top of the stack
    }
}
