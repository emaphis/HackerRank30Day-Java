/*
 * Hacker Rank Day 13 - Java
 * Abstract Classes
 */
package day_13;

public abstract class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public abstract void eat();
 
    public void sleep() {
        System.out.println("An animal is sleeping");
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.eat();
        d.sleep();
        c.sleep();

        // Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();

        Object str = "est";
        String realStr = (String) str;
        System.out.println(realStr.length());

        // run time testing
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal animal = (Animal) doggy;
            animal.sleep();
        }
        doggy.sleep();
    }
}
