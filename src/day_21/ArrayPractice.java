/*
 * Hacker Rank Day 21
 * Generics - Array Practice from day 7
 */
package day_21;

import java.util.Arrays;

public class ArrayPractice {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Declaring, Allocating, and Initializing
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        Integer[] intArray3 = {5, 2, 9, 1, 3};

        String[] shoppingList = {"bananas", "apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        // Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        // Custom Array Printing
        printArray(intArray2);
        printArray(intArray3);

        // Retrieve objects
        System.out.println(intArray2[3]);
        //System.out.println();

        // Given Functions
        Arrays.sort(intArray3); // Destructive sort
        printArray(intArray3);
       // System.out.println();

        // Print string array
        printArray(shoppingList);

        // Special for loop: foreach
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
