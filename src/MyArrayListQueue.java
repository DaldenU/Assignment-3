import java.util.ArrayList;
import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    private ArrayList<T> queue; // Declare an ArrayList to hold the elements of the queue.

    public MyArrayListQueue(){
        queue = new ArrayList<>(); // Initialisation of ArrayList in the constructor.
    }

    public void enqueue(T element) {
        queue.add(element); //Add an element to the back of the queue.
    }

    public boolean isEmpty() {
        return queue.isEmpty(); //returns true if the queue is empty, otherwise false
    }

    public T dequeue() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        T element = queue.get(0); //stores the front element
        queue.remove(0); //removes the front element
        return element; //returns the front element
    }

    public T peek() {
        if (isEmpty()) { //checks for whether the queue is empty
            throw new NoSuchElementException(); //throws an exception if true
        }
        return queue.get(0); //returns the front element of the queue without removing it
    }
}
