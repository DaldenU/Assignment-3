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
}
