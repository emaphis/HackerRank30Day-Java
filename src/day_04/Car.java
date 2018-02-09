/*
 * Day 4 Car class
 * Getters and setters (properties).
 * Boolean Operators
 */
package day_04;

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

    // Getters and Setters 

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }


    public int getMinSpeed() {
        return this.minSpeed;
    }

    public void setMinSpeed(int newMinSpeed) {
        this.minSpeed = newMinSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public boolean getIsTheCarOn() {
        return this.isTheCarOn;
    }

    public void setIsTheCarOn(boolean newIsTheCarOn) {
        this.isTheCarOn = newIsTheCarOn;
    }

    public char getCondition() {
        return condition;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }


    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getNumberOfPeopleInCar() {
        return numberOfPeopleInCar;
    }

    public void setNumberOfPeopleInCar(int numberOfPeopleInCar) {
        this.numberOfPeopleInCar = numberOfPeopleInCar;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public void printVariables() {
        System.out.println("This is maxSpeed " + getMaxSpeed());
        System.out.println(getMinSpeed());
        System.out.println(getWeight());
        System.out.println(getIsTheCarOn());
        System.out.println(getCondition());
        System.out.println(getNameOfCar());
        System.out.println(getNumberOfPeopleInCar());
    }

    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() +  10);
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
