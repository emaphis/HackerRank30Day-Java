/*
 * Hacker Rank Day 27 - Java
 * Challenge
 */
package day_27;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ret_day = sc.nextInt();
        int ret_month = sc.nextInt();
        int ret_year = sc.nextInt();
        int due_day = sc.nextInt();
        int due_month = sc.nextInt();
        int due_year = sc.nextInt();

        int fine = 0;
        if (ret_year > due_year) {
            fine = 10000;
        } else if (ret_year == due_year) {
            if (ret_month > due_month) {
                fine = (ret_month - due_month) * 500;
            } else if (ret_month == due_month) {
                if (ret_day > due_day) {
                    fine = (ret_day - due_day) * 15;
                }
            }
        }
        System.out.println(fine);
    }
}