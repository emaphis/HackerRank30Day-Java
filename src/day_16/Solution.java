/*
 * Hacker Rank Day 16 - Java
 * Exception Handling
 */
package day_16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int out = Integer.parseInt(S);
            System.out.println(out);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    } 
}
