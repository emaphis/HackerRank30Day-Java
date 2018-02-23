/*
 * Hacker Rank Day 11
 * Multi Dementional Arrays
 */
package day_11;

import java.util.Scanner;

public class Solution {

    // calculate the 'I' pattern
    public static int calcI(int arr[][], int i, int j) {
        int ret;
        ret = arr[i+0][j+0] + arr[i+0][j+1] + arr[i+0][j+2] +
                              arr[i+1][j+1] +
              arr[i+2][j+0] + arr[i+2][j+1] + arr[i+2][j+2];
        return ret;
    }

    // calculate the I patterns in the passed array
    public static int calcArr(int arr[][]) {
        int ret = -100;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ret = Math.max(ret, calcI(arr,i,j));
            }
        }
        return ret;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(calcArr(arr));
    } 
}
