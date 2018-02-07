/*
 * Hacker Rank Day 2 Challenge.
 */
package day_02;

import java.util.Scanner;

public class Arithmetic {
    
    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      
      // Enter your code here!
      // Run some computations....

      int total = (int) Math.round(M + (M*T)/100.0 + (M*X)/100.0);
      
      // ...then print!
      System.out.println("The final price of the meal is $" + total + ".");
    }
}
