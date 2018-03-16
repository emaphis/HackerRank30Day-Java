/*
 * Hacker Rank Day 29 - Java
 * Bitwise And, Challenge.
 */
package day_29;

import java.util.Scanner;

public class Solution {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int max = 0;

            for (int s = 1; s < N; s++) {
                for (int r = s+1; r < N+1; r++) {
                    int q = s&r;
                    if (q < K && max < q) {
                        max = q;
                    }
                }
            }
            System.out.println(max);
        }

        sc.close();
    }
}
