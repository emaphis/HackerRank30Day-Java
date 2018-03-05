/*
 * Hacker Rank Day 21 - Java
 * Generics - Linked List
 */
package day_21;

public class Node<D> {
    // Properties
    Node<D> next;
    D data;  // payload

    // Methods
    
    // Constructors
    public Node(D newData) {
        this.data = newData;
        this.next = null;
    }

    public Node(D newData, Node<D> newNext) {
        this.data = newData;
        this.next = newNext;
    }

    // Getters
    public Node<D> getNext() {
        return next;
    }

    public D getData() {
        return data;
    }
    
    // Setters
    public void setNext(Node<D> newNext) {
        this.next = newNext;
    }

    public void setData(D newData) {
        this.data = newData;
    }

}
