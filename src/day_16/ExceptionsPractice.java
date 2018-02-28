/*
 * Hacker Rank Day 16
 * Java Exceptions
 */
package day_16;

public class ExceptionsPractice {

    public static void main(String[] args) {
        //int[] intArray = new int[10];
        //System.out.println(intArray[10]);

        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 is" + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            System.out.println("Finally clause of try/catch");
        }
    }
}
