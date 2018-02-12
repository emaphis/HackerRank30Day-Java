/*
 * Hacker Rank Day 9 - Java
 * Recursion
 */
package day_09;

public class RecursionGOODLUCK {

    public static int Summation(int n) {
        // Base case 
        if (n <= 0) {
            return 0;
        }
        // Recursive case
        else {
            return n + Summation(n - 1);
        }
    }

    public static int Factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }
        // Recursive case
        else {
            return n * Factorial(n - 1);
        }
    }

    // e(2,3) = 2*2*2
    // e(2,2) = 2*2
    // e(2,1) = 2
    public static int Exponentiation(int n, int p) {
        // Base case
        if (p <= 0) {
            return 1;
        }
        // Recursive case
        else {
            return n * Exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(5, 3));
    }
}
