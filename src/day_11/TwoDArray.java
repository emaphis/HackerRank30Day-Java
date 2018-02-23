/*
 * Hacker Rank Day 11
 * Example of a 2D Array
 */
package day_11;


public class TwoDArray {
    public static void main(String[] args) {

        // declare array;
        int rowSize = 2;
        int colSize = 4;
        int[][] myArray = new int[rowSize][colSize];

        // intialize the array
        int count = 0;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++, count++) {
                myArray[i][j] = count;
            }
        }

        // print array
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
