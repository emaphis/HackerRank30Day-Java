/*
 * Hacker Rank Day 25 - Java
 * Run Times
 */
package day_25;

import java.util.HashMap;

public class RunTimePractice {

    public static int findNumsOfRepetitions(String s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumsOfRepetitionsV1(String s, char[] c) {
        int[] sums = new int[c.length];
        for (int i = 0; i < s.length(); i++) {  // n
            for (int j = 0; j < c.length; j++) {  // n*m
                if (s.charAt(i) == c[j]) {
                    sums[j]++;
                }
            }
        }
        return sums;
    }

    public static int[] findNumsOfRepetitionsV2(String s, char[] c) {
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }

        for (int j = 0; j < c.length; j++) {
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitions("abca;lksdjf", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");

        //char[] a = {'a', 'b'};
        char[] a = {'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b', 'c', 'd', 'e', 'f'};

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsV1("abca;lksdjflksjdf'laksjdflkasjdflkasjdf'askdjfl'kasdjfal'ksdjfl'kasdjf'laksdjfl'kasjdf'laksdjf'lkasdjf'lkasjdf'lkajsd'flkjasd'lkfjads'lkfjas'lkdfjal'ksdfj'lkasdjf'lkasdjfl'kasdjfkl'asdjf'lkasdjf'lkasdjf'lkasdjf'laskdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");

        startTime = System.currentTimeMillis();
        System.out.println(findNumsOfRepetitionsV2("abca;lksdjflksjdf'laksjdflkasjdflkasjdf'askdjfl'kasdjfal'ksdjfl'kasdjf'laksdjfl'kasjdf'laksdjf'lkasdjf'lkasjdf'lkajsd'flkjasd'lkfjads'lkfjas'lkdfjal'ksdfj'lkasdjf'lkasdjfl'kasdjfkl'asdjf'lkasdjf'lkasdjf'lkasdjf'laskdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf'lkasdjf", a));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + "ms");

    }
}
