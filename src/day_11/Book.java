/*
 * Hacker Rank Day 11 - Java
 * Book class for card catalogue 
 */
package day_11;

public class Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    // Setters
    public void setIsCheckedOut(boolean isCheckedOut, int currentDayCheckedOut) {
        this.isCheckedOut = isCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day) {
        this.dayCheckedOut = day;
    }
}
