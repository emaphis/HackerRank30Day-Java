/*
 * Hacker Rank Day 20 - Java
 * Reference, Enum, Alias
 */
package day_20;

import static day_20.HairColor.*;


public class Person {

    HairColor hairColor = BLACK;

    public Person() {
        
    }



    public static void main(String[] args) {
        Person peterParker = new Person();
        Person spiderMan = peterParker;  // alias
        peterParker.hairColor = PINK;
        System.out.println("Hair color of Peter Parker " + peterParker.hairColor);
        System.out.println("Hair color of Spider Man " + spiderMan.hairColor);
    }
}
