/*
 * Hacker Rank Day 12 - Java 
 * Inheritance Challenge 
 */
package day_12;

public class Student extends Person {
    private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int gradeTot = 0;
        for (int i = 0; i < testScores.length; i++) {
            gradeTot += testScores[i];
        }

        double gradeAve = gradeTot / testScores.length;
        if (gradeAve <= 100 && gradeAve >= 90) {
            return 'O';
        } else if (gradeAve < 90 && gradeAve >= 80) {
            return 'E';
        } else if (gradeAve < 80 && gradeAve >= 70) {
            return 'A';
        } else if (gradeAve < 70 && gradeAve >= 55) {
            return 'P';
        } else if (gradeAve < 55 && gradeAve >= 40) {
            return 'D';
        } else {
            return 'T';
        }
    }
}
