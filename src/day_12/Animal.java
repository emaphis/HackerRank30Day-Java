/*
 * Hacker Rank Day 12 - Java
 * Multiple Inheritanc
 */
package day_12;

public class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created!");
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("An animal is eating.");
    }
 
    public static void main(String[] args) {
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.getAge());
        c.meow();
        System.out.println(c.getAge());
        a.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
    }
}
