/*
 * Hacker Rank Day 5 Challenge
 */
package day_05;

import java.util.Scanner;

public class Solution {

    public static void printLoop(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printLoop(n);
    }
}
