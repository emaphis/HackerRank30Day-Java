/*
 * Hacker Rank Day 14 - Java
 * Packages, Imports, Scope - Challenge
 */
package day_14;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        maximumDifference = 0;
        this.elements = elements;
    }

    public void computeDifference() {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int difference = Math.abs(elements[i] - elements[j]);
                maximumDifference = Math.max(maximumDifference, difference);
            }
        }
        //System.out.println(maximumDifference);
    }

}
