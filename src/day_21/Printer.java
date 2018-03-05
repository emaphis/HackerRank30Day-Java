/*
 * Hacker Rank Day 21 - Java
 * Generics Challenge
 */
package day_21;

public class Printer<T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param <T>
    *    @param A generic array
    **/    
    // Write your code here
    public <T> void printArray(T A[]) {
        for (T element : A) {
            System.out.println(element);
        }
    }
}
