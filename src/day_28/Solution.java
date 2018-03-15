/*
 * Hacker Rank Day 28
 * Databases, Regex, Challenge
 */
package day_28;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num_rec = sc.nextInt();

        String name;
        String email;

        Pattern pattern = Pattern.compile(".+@gmail\\.com");
        Matcher matcher;

        List<String> emailList = new ArrayList<>();

        for (int i = 0; i < num_rec; i++) {
            name = sc.next();
            email = sc.next();
            matcher = pattern.matcher(email);
            if (matcher.find()) {
                emailList.add(name);
            }
        }
        Collections.sort(emailList);
        
        emailList.forEach((output) -> {
            System.out.println(output);
        });
        
        sc.close();
    }
}
