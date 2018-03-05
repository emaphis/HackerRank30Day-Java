/*
 * Hacker Rank Day 21 - Java
 * Generics - Stacks and Queues
 */
package day_21;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Queuey<D> {

    LinkedList<D> queue;

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
    public void enqueue(D n) {
        queue.addLast(n);
    }

    // Dequeue an item
    public D dequeue() {
        return queue.remove(0);
    }

    // Peek at first item
    public D peek() {
       return queue.get(0);
    }

    public static void main(String[] args) {
        Stack stacky = new Stack();
        stacky.push("there");
        stacky.push("hello");
        System.out.println("Peek: " + (String) stacky.peek());
        System.out.print(stacky.pop() + " ");
        System.out.println(stacky.pop() + ".");
        System.out.println("Size: " + stacky.size());

        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.print(stringQueue.dequeue() + " ");
        System.out.println(stringQueue.dequeue() + ".");

        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("Frist out: " + numberQueue.dequeue());
        System.out.println("Peek at second item: " + numberQueue.peek());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
    }
}
