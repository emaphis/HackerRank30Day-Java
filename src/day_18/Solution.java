/*
 * Hacker Rank Day 18 - java
 * Stacks and Queues Challenge
 */
package day_18;

import java.util.Scanner;
import java.util.LinkedList;

public class Solution {
    // Write your code here.
    private final LinkedList stack;
    private final LinkedList queue;

    public Solution() {
        this.stack = new LinkedList();
        this.queue = new LinkedList();
    }

    public char popCharacter() {
        return (char) this.stack.removeLast(); // remove from front
    }

    public void pushCharacter(char ch) {
        this.stack.add(ch); // add at end
    } 

    public char dequeueCharacter() {
        return (char) this.queue.remove(); // remove from front
    }

    public void enqueueCharacter(char ch) {
        this.queue.add(ch); // add at end
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
