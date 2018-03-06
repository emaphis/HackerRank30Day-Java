/*
 * Hacker Rank Day 22 - Java
 * Heaps and Binary Search Trees
 */
package day_22;

public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST() {
        
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<>(elt);
    }
    
}
