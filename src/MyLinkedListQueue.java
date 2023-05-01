import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private LinkedList<T> queue; //Declaration of LinkedList to hold the elements of the queue.

    public MyLinkedListQueue() {
        queue = new LinkedList<>(); //Initialisation of LinkedList in the constructor.
    }

    public void enqueue(T element) {
        queue.addLast(element); //Add an element to the back of the queue.
    }

    public boolean isEmpty() {
        return queue.isEmpty(); //returns true if the queue is empty, otherwise false
    }

    public T dequeue() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        return queue.removeFirst(); //returns the front element, while removing it
    }

    public T peek() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        return queue.getFirst(); //returns the front element, without removing it
    }

    public int size() {
        return queue.size(); //returns the size of queue
    }
}
