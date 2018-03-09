/*
 * Hacker Rank Day 24 - Java
 * Review, Hangman
 */
package day_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

class Hangman {
    
    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();

    int maxTries = 6;
    int currentTry = 0;

    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public Hangman() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();        
    }

    private void initializeStreams() throws IOException {
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();
            while (currentLine != null) {
                dictionary.add(currentLine);
                currentLine = bufferedFileReader.readLine();
            }
            System.out.println("*** dictionary size: " + dictionary.size());
            System.out.println("*** second item: " + dictionary.get(2));
            bufferedFileReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Could not init streams: " + e.getMessage());
        }
    }

    private String pickWord() {
        Random rand = new Random();
        int wordIndex = Math.abs(rand.nextInt() % dictionary.size());
        return dictionary.get(wordIndex);
    }

    private StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        // _A_B_C_D_...
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }
        return current;
    }

    // _ _ A _ _ B _ _
    public String getFormalCurrentGuess() {
        return "Current Guess: " + currentGuess.toString();
    }

    public boolean gameOver() {
        if (didWeWin()) {
            System.out.println();
            System.out.println("Congrats! You won! You guessed the right word!");
            return true;
        } else if (didWeLose()) {
            System.out.println();
            System.out.println("Sorry, you lost. You spent all of your 6 tries. "
                    + "The word was " + mysteryWord + ".");
            return true;
        }
        return false;
    }

    public boolean didWeLose() {
        return currentTry >= maxTries;
    }

    // _ _ _ A _B_  = _AB
    public boolean didWeWin() {
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }

    public String getCondensedCurrentGuess() {
        String guess = currentGuess.toString();
        return guess.replace(" ", "");
    }

    public boolean isGuessedAlready(char guess) {
        return previousGuesses.contains(guess);
    }

    public boolean playGuess(char guess) {
        boolean isItAGoodGuess = false;
        previousGuesses.add(guess);
        for (int i = 0; i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess) {
                currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
            }
        }

        if (!isItAGoodGuess) {
            currentTry++;
        }

        return isItAGoodGuess;
    }

    // " - - - - -\n"+
    // "|        |\n"+
    // "|        O\n" +
    // "|      / | \\ \n"+
    // "|        |\n" +
    // "|       / \\ \n" +
    // "|\n" +
    // "|\n";

    public String drawPicture() {
        switch (currentTry) {
            case 0: return noPersonDraw();
            case 1: return addHeaDraw();
            case 2: return addBodyDraw();
            case 3: return addOneArmDraw();
            case 4: return addSecondArmDraw();
            case 5: return addFirstLegDraw();
            default: return fullPersonDraw();
        }
    }

    private String noPersonDraw() {
        return  " - - - - -\n" +
                "|        |\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n";
    }

    private String addHeaDraw() {
        
        return  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n" +
                "|\n";
    }

    private String addBodyDraw() {
        
        return  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|        |\n" +
                "|        |S\n" +
                "|\n" +
                "|\n" +
                "|\n";
    }

    private String addOneArmDraw() {
        return  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / |\n" +
                "|        |\n" +
                "|\n" +
                "|\n" +
                "|\n";
    }

    private String addSecondArmDraw() {
        
        return  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|\n" +
                "|\n" +
                "|\n";
    }

    private String addFirstLegDraw() {
        return  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|       / \n" +
                "|\n" +
                "|\n";
    }

    private String fullPersonDraw() {
        return  " - - - - -\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }

}
