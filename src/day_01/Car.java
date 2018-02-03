/*
 * Day 1 Car class
 */
package day_01;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079.0;
    boolean isTheCarOn = false;
    char condition = 'A';

    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        Car aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice's Car");
        aliceCar.printVariables();
    }
}
