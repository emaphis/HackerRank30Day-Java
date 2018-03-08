/*
 * Hacker Rank Day 23 - Java
 * Review, Tic Tac Toe
 */
package day_23;

import java.util.ArrayList;
import java.util.Random;

class AI {

    // Pick a random spot (index) given an array of open spots. 
    public int pickSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList();
        for (int i = 0; i < 9; i++) {
            // if the slot is not taken, add it as a choice.
            if (game.board[i] == '-') {
                choices.add(i + 1);
            }
        }
        Random rand = new Random();
        int choice = choices.get(Math.abs(rand.nextInt() % choices.size()));
        return choice;
    }

}
