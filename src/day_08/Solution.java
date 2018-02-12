/*
 * Hacker Rank Day 8 Challenge
 * Maps and Dictionarys
 */
package day_08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                int num = phoneBook.get(s);
                System.out.println(s + "=" + num);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
