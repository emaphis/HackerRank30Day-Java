/*
 * Hacker Rank Day 6 Challenge
 */
package day_06;

import java.util.Scanner;

public class Solutions {

    public static void printArrays() {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= num; i++) {
            String str = scan.nextLine();
            char[] array = str.toCharArray();

            for (int j = 0; j < str.length(); j=j+2) {
                System.out.print(array[j]);
            }

            System.out.print(" ");

            for (int k = 1; k < str.length(); k=k+2) {
                System.out.print(array[k]);
            }
            System.out.println();
        }

        scan.close();
    }

    public static void main(String[] args) {
        printArrays();
    }
}
