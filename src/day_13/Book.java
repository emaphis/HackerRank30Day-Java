/*
 * Hacker Rank Day 13 - Java
 * Abstract Class Challenge
 */
package day_13;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}
