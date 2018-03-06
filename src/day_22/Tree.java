/*
 * Hacker Rank Day 22 - Java
 * Heaps and Binary Search Trees
 */
package day_22;

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
