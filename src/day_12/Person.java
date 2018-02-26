/*
 * Hacker Rank Day 12 - Java 
 * Inheritance Challenge
 */
package day_12;

public class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
          "Name: " + lastName + ", " + firstName 
        + "\nID: " + idNumber); 
    }	 
}
