/*
 * Day 3 Car class
 */
package day_03;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079.0;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";

    double maxFuel = 16.0;
    double currentFuel = 8.0;
    double mpg = 26.4;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeople = 6;

    public Car() { }

    public Car(int customMaxSpeed, double customWeight, boolean customCarOn) {
      this.maxSpeed = customMaxSpeed;
      this.weight = customWeight;
      this.isTheCarOn = customCarOn;
    }


    public void printVariables() {
        System.out.println("This is maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }

    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn() {
        if (numberOfPeopleInCar < maxNumberOfPeople) {
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        } else {
            System.out.println("The car is full " + numberOfPeopleInCar + 
                    " = " + maxNumberOfPeople );
        }
    }

    public double howManyMilesTillOutOfGas() {
        return mpg * currentFuel;
    }

    public double maxMilesPerFillUp() {
        return mpg * maxFuel;
    }

    public void getOut() {
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
        } else {
            System.out.println("No one is in the car " + numberOfPeopleInCar);
        }
    }

    public void turnTheCarOn() {
        if (!isTheCarOn) {
            isTheCarOn = true;
        } else {
            System.out.println("The car is already on " + isTheCarOn);
        }
    }


    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();
    }
}
