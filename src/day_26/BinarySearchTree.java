/*
 * Hacker Rank Day 26 - Java
 * Unit Testing, Binary Search Trees
 */
package day_26;


public class BinarySearchTree {
    


    public static void main(String[] args) {
       EmptyBST e = new EmptyBST();
       NonEmptyBST n = new NonEmptyBST(5);
       try {
            Testers.checkIsEmpty(e);
            Testers.checkIsEmpty(n);
       } 
       catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
    }
}
