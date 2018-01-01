/**
 * Mancala game for 2 players.
 * 
 * @author A. Jacoby (11/29/17: Method Stubs)
 */
public class MancalaJacoby {
  public final static int BOARD_SIZE = 14;
  public final static int NUM_STONES_INITIAL = 4;
  public final static int P1_MANCALA_IDX = BOARD_SIZE/2 - 1;
  public final static int P2_MANCALA_IDX = BOARD_SIZE - 1;

  /** Plays Mancala until user quits. */
  public static void main(String[] args) {
    int[] board = createBoard();
    drawBoard(board, "Hi!");
  }
  
  /** Plays one game of Mancala. */
  public static void playGame() {

  }
  
  /**
   * Current player makes their move.  Returns true if they ended their move in
   * their mancala and therefor get to go again.
   */
  public static boolean makeMove(int[] board, boolean p1Turn) {
    return false;
  }
  
  /**
   * If pit belongs to player and has only one stone in it (meaning it used to
   * be empty), and there are stones in the pit opposite, capture that stone
   * and the stones in the opposite pit.
   */
  private static void captureIfPossible(int[] board, boolean p1Turn, int pit) {
  }
  
  /**
   * Returns valid pit index selected by current player. Pit must belong to
   * current player, not be a mancala, and not be empty.
   */
  private static int getSelectedPit(int[] board, boolean p1Turn) {
    return -1;
  }
  
  /** Verify we haven't lost any stones, and other sanity checks. */
  private static void sanityCheck(int[] board) {
  }
  
  /** Returns true if all of one player's pits are empty. */
  private static boolean isGameOver(int[] board) {
    return false;
  }
  
  /**
   * Returns a new board, with all pits (not Mancalas)
   * initialized to 4 stones.
   */
  private static int[] createBoard() {
    int[] board = new int[BOARD_SIZE];
    for (int i = 0; i < board.length; i++) {
      if (i != P1_MANCALA_IDX && i != P2_MANCALA_IDX) {
        board[i] = NUM_STONES_INITIAL;
      }
      // board[i] = i; // uncomment to debug graphics
    }
    return board;
  }
  
  /** Draws the board with given status message. */
  private static void drawBoard(int[] board, String status) {
    // TODO: Define constants for board dimensions
    StdDraw.clear();
    StdDraw.setXscale(-1, 9); // main board goes 0..8
    StdDraw.setYscale(-0.5, 3.5); // main board goes 0..2
    // Draw bottom and top rows of pits
    for (int i = 0; i < board.length/2 - 1; i++) {
      double x = i + 1.5;
      StdDraw.circle(x, 0.5, 0.4);
      StdDraw.text(x, 0.5, "" + board[i]);
      StdDraw.circle(x, 1.5, 0.4);
      StdDraw.text(x, 1.5, "" + board[board.length - 2 - i]);
    }
    // Draw left (p2) and right (p1) mancalas
    StdDraw.circle(0.5, 1, 0.5);
    StdDraw.text(0.5, 1, "" + board[board.length - 1]);
    StdDraw.circle(board.length / 2 + 0.5, 1, 0.5);
    StdDraw.text(board.length / 2 + 0.5, 1, "" + board[board.length / 2 - 1]);
    // Draw status message (centered at top)
    StdDraw.text(4, 3, status);
  }
}