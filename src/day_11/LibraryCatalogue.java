/*
 * Hacker Rank Day 11
 */
package day_11;

import java.util.Map;
import java.util.HashMap;

public class LibraryCatalogue {

    // Properties
    Map<String,Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double intialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String,Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod,
            double initialLateFee, double feePerLateDat) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.intialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDat;
    }

    // Getters 
    public int getCurrentDay() {
        return currentDay;
    }

    public Map<String,Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public double getIntialLateFee() {
        return intialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    // Setters
    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        this.currentDay = day;
    }

    // Instance methods
    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + book.getTitle() + " It is due on day " +
                   (getCurrentDay() + getLengthOfCheckoutPeriod()));
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getIntialLateFee() + daysLate + getFeePerLateDay()) +
                    " because your book is " + daysLate + " days overdue");
        } else {
            System.out.println("Book Returned. Thank you.");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
                + "It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }


    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter", 827123, 9999999);
        bookCollection.put(harry.getTitle(), harry);

        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOut("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOut("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOut("Harry Potter");
    }
}
