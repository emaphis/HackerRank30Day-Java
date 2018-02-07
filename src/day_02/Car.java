/*
 * Day 2 Car class
 */
package day_02;

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
        numberOfPeopleInCar++;
    }

    public double howManyMilesTillOutOfGas() {
        return mpg * currentFuel;
    }

    public double maxMilesPerFillUp() {
        return mpg * maxFuel;
    }

    public void getOut() {
        numberOfPeopleInCar--;
    }


    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car V1");
        birthdayPresent.printVariables();

        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max miles " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car V2");
        birthdayPresent.printVariables();

        birthdayPresent.getOut();
        System.out.println("Birthday Car V3");
        birthdayPresent.printVariables();


//        System.out.println("Christmas Car");
//        Car christmasPressent = new Car(550, 2000.0, false);
//        christmasPressent.printVariables();
    }
}
