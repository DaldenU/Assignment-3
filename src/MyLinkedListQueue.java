import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private LinkedList<T> queue; //Declaration of LinkedList to hold the elements of the queue.

    public MyLinkedListQueue() {
        queue = new LinkedList<>(); //Initialisation of LinkedList in the constructor.
    }
}
