/*
 * Hacker Rank Day 15 - Java
 * Linked List
 */
package day_15;

import java.util.LinkedList;

public class LinkedListUS {

    // Properties    
    Node head;
    int count;

    // Constructors
    public LinkedListUS() {
        head = null;
        count = 0;
    }

    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }

    // Methods

    // add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    // get
    public int get(int index) {
        if (index <= 0) {
            return -1;    // hacky
        }
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove(int index) {
        // remove from back of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Alice");
        System.out.println(linkedList);
        linkedList.add("Alicey");
        System.out.println(linkedList);
    }
}
