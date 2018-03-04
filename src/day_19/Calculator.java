/*
 * Hacker Rank Day 19 - Java
 * Interface Challenge
 */
package day_19;

public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sumDivisors = 0;
        for (int i = 1; i <= n; i++) {
            // check if divisor - evenly dividable
            if (n % i == 0) {
                sumDivisors += i;
            }
        }
        return sumDivisors;
    }
}
