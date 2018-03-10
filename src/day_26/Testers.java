/*
 * Hacker Rank Day 26 - Java
 * Unit Testing, Binary Search Tree
 */
package day_26;


public class Testers {

    public static void checkIsEmpty(Tree t) throws Exception {
        // If the tree t is an instance of EmptyBST -> t.isEmpty -> true
        // If the tree t is an instance of NonEmptyBST -> t.isEmpty -> false
        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is not good, the tree is an EmptyBST and is not-empty");
            }
        } else if (t instanceof NonEmptyBST) {
            if (t.isEmpty()) {
                throw new Exception("All is not good, the tree is a NonEmptyBST and is empty");
            }
        }
    }
}
