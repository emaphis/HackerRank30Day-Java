/*
 * Hacker Rank Day 23 - Java
 * Review, Tick Tack Toe
 */
package day_23;

public class TicTacToe {

    /// Picture of Game with Index;
    // For Storage:
    //  0 | 1 | 2
    // -----------
    //  3 | 4 | 5
    // -----------
    //  6 | 7 | 8
    // What the user thinks
    //  1 | 2 | 3
    // -----------
    //  4 | 5 | 6
    // -----------
    //  7 | 8 | 9

    // UI Picture of Game:
    // Init:
    //  - | - | -
    // -----------
    //  - | - | -
    // -----------
    //  - | - | -

    // Game Play:
    //  O | - | O
    // -----------
    //  - | X | -
    // -----------
    //  - | - | X

    protected static char[] board;
    protected char userMarker;
    protected char aiMarker;
    protected char winner;
    protected char currentMarker;

    public TicTacToe(char playerToken, char aiMarker) {
        this.userMarker = playerToken;
        this.aiMarker = aiMarker;
        this.winner = '-';
        this.board = setBoard();
    }

    public static char[] setBoard() {
        char[] board = new char[9];
        for (int i = 0; i < board.length; i++) {
            board[i] = '-';
        }
        return board;
    }
    
    public boolean playTurn(int spot) {
        boolean isValid = withinRange(spot) && !isSpotTaken(spot);
        if (isValid) {
            board[spot-1] = currentMarker;
            // flip market
            currentMarker = (currentMarker == userMarker) ? aiMarker : userMarker;
        }
        return isValid;
    }

    // Check if our spot is within range
    public boolean withinRange(int spot) {
        return spot > 0 && spot < board.length; 
    }

    // Check if spot is taken.
    public boolean isSpotTaken(int spot) {
        return board[spot-1] != '-';
    }

    public void printBoard() {    
        //  - | - | -
        // -----------
        //  - | - | -
        // -----------
        //  - | - | -

        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
                System.out.println("-----------");
                System.out.println("");
            } else {
                System.out.print(" | " + board[i]);
            }
            System.out.println();
        }
    }

    public static void printIndexBoard() {
        
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                System.out.println();
                System.out.println("-----------");
                System.out.println("");
            } else {
                System.out.print(" | " + (i+1));
            }
            System.out.println();
        }
    }

    public boolean isThereAWiner() {
        boolean diagonalAndMiddles = rightDi() || leftDi() || middleRow() || secondCol() && board[4] != '-';
        boolean topAndFirst = topRow() || firstCol() && board[0] != '-';
        boolean bottomAndThird = bottomRow() || thirdCol() && board[8] != '-';
        if (diagonalAndMiddles) {
            this.winner = board[4];
        } else if (topAndFirst) {
            this.winner = board[0];
        } else if (bottomAndThird) {
            this.winner = board[8];
        } else {
            this.winner = '-';
        }
        return diagonalAndMiddles || topAndFirst || bottomAndThird;
    }

    private boolean topRow() {
        return board[0] == board[1] && board[1] == board[2];
    }

    private boolean middleRow() {
        return board[3] == board[4] && board[4] == board[5];
    }

    private boolean bottomRow() {
        return board[6] == board[7] && board[7] == board[8];
    }

    private boolean firstCol() {
        return board[0] == board[3] && board[3] == board[6];
    }

    private boolean secondCol() {
        return board[1] == board[4] && board[4] == board[7];
    } 

    private boolean thirdCol() {
        return board[2] == board[5] && board[5] == board[8];
    }

    private boolean rightDi() {
        return board[0] == board[4] && board[4] == board[8]; 
    }

    private boolean leftDi() {
        return board[2] == board[4] && board[4] == board[6];
    }

    public boolean isTheBoardFilled() {
        for (int i = 0; i < board.length; i++) {
             if (board[i] == '-') {
                 return false;
             }
        }
        return true;
    }

    public String gameOver() {
        boolean didSomeoneWin = isThereAWiner();
        if (didSomeoneWin) {
            return "We have a winner! The winner is " + this.winner + "'s";
        } else if (isTheBoardFilled()) {
            return "Draw: Game Over!";
        } else {
            return "notOver";
        }
    }
}

