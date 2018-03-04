/*
 * Hacker Rank Day 19 - Java
 * Interfaces
 */
package day_19;

public class Hero implements Character {
    public String weapon = "The Force";

    @Override
    public String getWeapon() {
        return this.weapon;
    }

    @Override
    public void attack() {
        System.out.println("The hero attacks the enemy.");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals you.");
    }

}
