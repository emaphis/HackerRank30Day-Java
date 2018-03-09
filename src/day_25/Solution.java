/*
 * Hacker Rank Day 25 - Java
 * Run Time of Programs - Challenge
 */
package day_25;

import java.util.Scanner;

/**
 * Calculate Prime Numbers
 * @author emaphis
 */
public class Solution {

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        //check if n is a multiple of 2
        if (num % 2 == 0) return false;
        //if not, then just check the odds
        for(int i = 3; i*i <= num; i+=2) {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if (num >= 2 && isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
