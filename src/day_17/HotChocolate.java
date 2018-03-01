/*
 * Hacker Rank Day 17 - Java
 * Exceptions 2
 */
package day_17;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185.0;
    public static final double tooCold = 160.0;

    public static void drinkHotChocolate(double cocoaTemp)
            throws TooHotException, TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        double currentCocoaTemp = 170;
        boolean wrongTemp = true;

        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e) {
                System.out.println("THATS'S TOO HOT!");
                currentCocoaTemp -= 5;
            } catch (TooColdException e) {
                System.out.println("THAT'S SO COLD! It's like the arctic.");
                currentCocoaTemp += 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }

        System.out.println("And it's gone.");
    }

}
