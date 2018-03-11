/*
 * Hacker Rank Day 27 - Java
 * More Unit Testing, Binary Search Trees
 */
package day_27;


public class BinarySearchTree {

    public static void main(String[] args) {
       EmptyBST e = new EmptyBST();
       NonEmptyBST n = new NonEmptyBST(5);
       try {
            Testers.checkIsEmpty(e);
            Testers.checkIsEmpty(n);
            Testers.checkAddMemberCardinality(e, 5);
            Testers.checkAddMemberCardinality(n, 5);
            Testers.checkAddMemberCardinality(n, 6);

            int tests = 1000;
            for (int i = 0; i < tests; i++) {
                Tree t;
                if (i % 10 == 0) {
                    t = Testers.rndTree(0);
                } else {
                    t = Testers.rndTree(i);
                }
                Testers.checkAddMemberCardinality(t, i);
            }

       } 
       catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
    }
}
