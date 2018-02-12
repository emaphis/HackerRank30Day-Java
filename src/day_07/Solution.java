/*
 * Hacker Rank Day 7  Challenge 
 * Arrays
 */
package day_07;

import java.util.Scanner;


public class Solution {

    public static void printReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        printReverse(arr);
        in.close();
    }
}
