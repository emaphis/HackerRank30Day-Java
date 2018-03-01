/*
 * Hacker Rank Day 18 - Java
 * Stacks and Queues
 */
package day_18;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Queuey {

    LinkedList queue;

    // Making a queuey instance
    public Queuey() {
        queue = new LinkedList();
    }

    // Is our queuey empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Return size of queue
    public int size() {
        return queue.size();
    }

    // Enqueueing an item
    public void enqueue(String n) {
        queue.addLast(n);
    }

    // Dequeue an item
    public String dequeue() {
        return (String) queue.remove(0);
    }

    // Peek at first item
    public String peek() {
       return (String) queue.get(0);
    }

    public static void main(String[] args) {
        Stack stacky = new Stack();
        stacky.push("there");
        stacky.push("hello");
        System.out.println("Peek: " + (String) stacky.peek());
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + ".");
        System.out.println("Size: " + stacky.size());

        Queue<String> queue = new LinkedList<>();


//        Queuey numberQueue = new Queuey();
//        numberQueue.enqueue(5);
//        numberQueue.enqueue(7);
//        numberQueue.enqueue(6);
//        System.out.println("Frist out: " + numberQueue.dequeue());
//        System.out.println("Peek at second item: " + numberQueue.peek());
//        System.out.println("Second out: " + numberQueue.dequeue());
//        System.out.println("Third out: " + numberQueue.dequeue());
    }
}
