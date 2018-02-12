/*
 * Hacker Rank Day 7
 * Array Practice
 */
package day_07;

import java.util.Arrays;


public class ArrayPractice {


    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Declaring, Allocating, and Initializing
        int[] intArray1;
        int[] intArray2 = new int[4];
        int[] intArray3 = {5, 2, 9, 1, 3};

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
