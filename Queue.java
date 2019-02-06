//Queue
import java.util.*;

public class Queue <T> {

    //Data
    LinkedList<T> myQueue = new LinkedList<T>();

    //Constructor
    public Queue() {

    }

    //Methods

    //Adding to the queue
    public void enqueue(T item) {
        //Adds a new item to the back of the queue
        myQueue.addLast(item);
    }

    //Removing form the queue
    public void dequeue() {
        //Removes an item from the front of the queue
        myQueue.removeFirst();
    }

    //Returns true if the queue contains the item
    public boolean inQueue(T item)//Task task = new Task(T item);
    {
        if (myQueue.contains(item)) {
            return true;
        } else {
            return false;
        }
    }

    //Returns true if the queue is empty
    public boolean isEmpty() {
        if (myQueue.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Override the Object Class' toString method
    public String toString() {
/*        String result = "";
        for (int i = 0; i < myQueue.size() ; i++) {
            final String result1 = result;

            return result1;
        }
*/
        return myQueue.toString();

    }

}
