/*************************************************************************
 *
 *  Pace University
 *  Fall 2018
 *  Data Structures and Algorithms
 *
 *  Course: CS 241
 *  Team members: Elly
 *  Collaborators: NONE
 *  References: NONE
 *
 *  Assignment: #2
 *  Problem: Write a program using queues
 *  Description: I created a Queue class using the basic methods we discussed in class and then
 *  *  made a test class to implement the methods
 *
 *  Input: N/A
 *  Output: N/A
 *
 *  Visible data fields:
 *  - LinkedList<T> myQueue
 *
 *  Visible methods:
 *  - public void enqueue(T item)
 *  - public void dequeue()
 *  - public boolean inQueue(T item)
 *  - public boolean isEmpty()
 *  - public String toString()
 *
 *
 *   Remarks
 *   N/A
 *
 *   Question 3:
 *
 *   Run times for each method:
 *   - public void enqueue(T item): O(1) because you are just adding something to the queue, you don't have to iterate through
 *   - public void dequeue(): O(1) because you are just removing from the back of the queue, you don't have to iterate through
 *   - public boolean inQueue(T item): O(n) because you have to search through the queue which is n items. 
 *   - public boolean isEmpty(): O(1) because you just have to check the first value to see if the queue is empty. 
 *   - public String toString(): O(1) because it is a simple toString method.
 *
 *************************************************************************/
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