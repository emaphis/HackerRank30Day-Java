/*
 * Hacker Rank Day 15 - Java
 * Linked List
 */
package day_15;

public class Node {
    // Properties
    Node next;
    int data;  // payload

    // Methods
    

    // Constructors
    public Node(int newData) {
        this.data = newData;
        this.next = null;
    }

    public Node(int newData, Node newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters
    public Node getNext() {
        return next;
    }

    public int getData() {
        return data;
    }
    
    // Setters
    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public void setData(int newData) {
        this.data = newData;
    }

}
