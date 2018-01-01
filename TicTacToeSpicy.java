/**
 * Two player tic-tac-toe.
 * 
 * Version: Spicy
 * 
 * TODO: Finish all methods!
 * 
 * @author Kaleb Gezahegn and A. Jacoby (Dec 2017)
 */
public class TicTacToeSpicy {
  /** Board value for empty square. */
  public static final char EMPTY = ' ';
  /** Board value for player X. */
  public static final char X = 'X';
  /** Board value for player O. */
  public static final char O = 'O';
  /** Cat's game (game over, but no winner). */
  public static final char CATS = 'C';
  
  /** Plays one game of TicTacToe. */
  public static void main(String[] args) {
    // TODO: Finish this
    
  }
  
  /** Returns a new, blank board (all squares EMPTY). */
  private static char[][] initBoard() {
    
    char[][] gameBoard = new char(3)
      return null;
  }
  
  /** Updates board with move given by coords {row, col} and xTurn. */
  private static void makeMove(char[][] board, int[] coords,
                               boolean xTurn)
  {
    // TODO: Finish this method!
  }
  
  /** Returns X, O, CATS, or EMPTY (if no winner yet). */
  private static char checkForWinner(char[][] board) {
    // TODO: Finish this
    return EMPTY;
  }

  /**
   * Returns { row, col } of selected board location.
   * Location is guaranteed to be currently EMPTY.
   */
  private static int[] getCoords(char[][] board) {
    // TODO: Finish this
    return null;
  }
    
  /** Draws board and given message. */
  public static void drawBoard(char[][] board, String msg) {
    
    
    StdDraw.setScale(0,3);
      
    StdDraw.line ( 1,0, 1, 3);
    StdDraw.line ( 2,0, 2, 3);
    StdDraw.line (0,1,3,1);
    StdDraw.line ( 0,2,3,2);
    
     for ( int row = 0; row < N; row++) {
        for ( int col = 0; col < N; col++){
          
          System.out.print ( 
          
        }
     }
    
  }
}
