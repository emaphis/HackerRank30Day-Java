/*
 * Hacker Rank Day 21 - Java
 * Generics - Video Lecture
 */
package day_21;

public class GenericsLec {

    public static <T extends Comparable<T>> T findMax(T a, T b) {
        int comp = a.compareTo(b);
        if (comp < 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMax(2, 3));
        System.out.println(findMax(3, 2));
        System.out.println(findMax(3, 3));

        System.out.println(findMax(2.0, 3.0));
        System.out.println(findMax('a', 'b'));
        System.out.println(findMax("Hello", "There"));
    }
}
