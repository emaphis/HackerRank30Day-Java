/*
 * Hacker Rank Day 9 - Java
 * Recursion
 */
package day_09;

import java.util.Scanner;

public class Solution {

    static int factorial(int n) {
        // Complete this function
        if (n <= 1) {   // base case
            return 1;
        } else {        // recursive case
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
        in.close();
    }
 
}
