/*
 * Hacker Rank Day 10 Challenge - Java
 * Binary Numbers
 */
package day_10;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int countOnes = 0;
        int maxOnes  = 0;
        String binaryString = Integer.toBinaryString(num);
        char[] array = binaryString.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0') {
                countOnes = 0;
            } else {
                countOnes++;
            }

            // find max count
            if (countOnes > maxOnes) {
                maxOnes = countOnes;
            } // eles maxOnes holds max count
        }
        System.out.println(maxOnes);
    }
}
