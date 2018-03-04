/*
 * Hacker Rank Day 19 - Java
 * Interfaces
 */
package day_19;

import java.util.Random;


public class StarWarsInterfacePractice {

    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Hero();
        } else {
            return new Enemy();
        }
    }






    public static void main(String[] args) {
        Enemy darthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        darthVader.attack();
        ObiWanKenobi.attack();
        System.out.println("Enemy weapon: " + darthVader.getWeapon());
        System.out.println("Hero weapon: " + ObiWanKenobi.getWeapon());
        Character spy = summonCharacter();
        spy.attack();
        spy.heal();
    }
 
}
