/*
 * Hacker Rank Day 24 - Java
 * Review, Hang Man
 */
package day_24;

import java.util.Scanner;
import java.io.IOException;

public class HangmanApplication {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Hangman! I will pick a word and you will "
                + "try to guess it character "
                + "by character. "
                + "If you guess wrong 6 times, then I win.\nIf you can guess it before then, you win."
                + "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture, and below "
                + "that is your current guess, which starts off as noting.\nEvery time you "
                + "guess incorrectly I add a body part to the picture. When there is a full"
                + " person, you lose.");

        // Allows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            // Setting up the game
            System.out.println();
            System.out.println("Alright! Let's play!");
            Hangman game = new Hangman();
            do {
                // Draw the things...
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord); // cheat for testing.
                System.out.println();

                // Get the guess
                System.out.println("Enter a charaacter that you think is in the word.");
                char guess = (sc.next().toLowerCase()).charAt(0);
                System.out.println();

                // Check if the character has already been guessed
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You've already guessed that character.");
                    guess = (sc.next().toLowerCase()).charAt(0);
                }

                // Play the guess
                if (game.playGuess(guess)) {
                    System.out.println("Great guess! That character is in the word");
                } else {
                    System.out.println("Unfortunately that charcter isn't in the word");
                }
            }
            while (!game.gameOver());  // Keep playing until the game is over.

            // Play again or no?
            System.out.println("");
            System.out.println("Do you want to play another game? Enter Y if you do.");
            Character response = (sc.next().toUpperCase()).charAt(0);
            doYouWantToPlay = (response == 'Y');
            
        }
        
    }
}