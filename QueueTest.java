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
 *  made a test class to implement the methods
 *
 *  Input:
 *   N/A
 *  Output:
 *  N/A
 *
 *  Visible data fields:
 *  - Queue main
 *  - Scanner scan
 *
 *  Visible methods:
 *  ?
 *
 *
 *   Remarks
 *   
 *
 *
 *************************************************************************/
import java.util.*;

public class QueueTest {


public static void main(String[] args) {

    //Establishes queue object and scanner object to read user input
    Queue<Integer> Queue1 = new Queue<Integer>();
    Scanner scan = new Scanner(System.in);


    //Allows the user to create the queue size and add their own numbers
    System.out.println("How many numbers do you want in the queue: ");
    int queueSize = scan.nextInt();

    System.out.println("What are the numbers you would like to enter: ");
    for(int i = 0; i < queueSize; i++){
        int addNum = scan.nextInt();
        Queue1.enqueue(addNum);
    }

    //Prints the queue
    System.out.println("Your queue is: " + Queue1.toString());


    //Allows the user to enter the amount of times the queue can remove an item
    System.out.println("How many items would would you like to remove: ");
    int dequeueNum = scan.nextInt();
    for (int i = 0; i < dequeueNum; i++) {
        Queue1.dequeue();
    }

    //Prints the queue
    System.out.println("Your queue is: " + Queue1.toString());


    //Checks to see if the queue is empty
    if(Queue1.isEmpty()){
        System.out.println("The queue is empty.");
    }
    else {
        System.out.println("The queue is not empty.");
    }

    //Prints the queue
    System.out.println("Your queue is " + Queue1.toString());


    //Allows the user to check if the number entered is in the queue or not
    System.out.println("What number would you like to check?");
    {
        int checkQueue = scan.nextInt();
        if (Queue1.inQueue(checkQueue) == true) {
            System.out.println("That number is in the queue.");
        }
        else{
            System.out.println("That number is not in the queue.");
        }
    }

    //Prints the queue
    System.out.println("Your queue is " + Queue1.toString());

}
}
