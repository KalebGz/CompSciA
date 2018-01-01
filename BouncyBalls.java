/**
 * Displays a collections of balls bouncing around the window.
 * 
 * @author A. Jacoby (6 Jan 2016)
 */
public class BouncyBalls {
  // Array indices for ball information
  public static final int X = 0; // x center
  public static final int Y = 1; // y center
  public static final int XVEL = 2; // x velocity
  public static final int YVEL = 3; // y velocity
  public static final int R = 4; // radius
  
  // Force of gravity
  public static final double GRAVITY = -0.0001;
  
  public static void main(String[] args) {

        StdDraw.setPenRadius(1);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.line(5,0,5,10);

    int numBalls = (args.length > 0)? Integer.parseInt(args[0]) : 20;
    double[][] ballInfo = initialize(numBalls);
    StdDraw.enableDoubleBuffering();
    while (true) {
      drawBalls(ballInfo);
      updateBalls(ballInfo);
      StdDraw.pause(20);
    }
  }
  
  /**
   * Initializes all balls to random positions, sizes, and velocities.
   */
  public static double[][] initialize(int numBalls) {
    double[][] ballInfo = new double[numBalls][5];
    for (int i = 0; i < ballInfo.length; i++) {
      ballInfo[i][X] = Math.random(); // x between 0 and 1
      ballInfo[i][Y] = Math.random(); // y between 0 and 1
      ballInfo[i][R] = 0.01 + 0.06*Math.random(); // radius between 0.01 and 0.07
      // velocities between -0.01 and 0.01
      ballInfo[i][XVEL] = -0.01 + 0.02*Math.random();
      ballInfo[i][YVEL] = -0.01 + 0.02*Math.random();
    }
    return ballInfo;
  }
  
  /** Draws each ball in its current position. */
  public static void drawBalls(double[][] ballInfo) {
    StdDraw.clear();
    for (int i = 0; i < ballInfo.length; i++) {
      Snowflake.drawSnowflake(ballInfo[i][X], ballInfo[i][Y], ballInfo[i][R] , 2);
    }
    StdDraw.show();
  }
  
  /** Updates position and velocity of each ball. */
  public static void updateBalls(double[][] ballInfo) {
    for (int i = 0; i < ballInfo.length; i++) {
      ballInfo[i][X] += ballInfo[i][XVEL];
      ballInfo[i][Y] += ballInfo[i][YVEL];
      // bounce off left or right wall
      if (((ballInfo[i][X] - ballInfo[i][R]) <= 0 && ballInfo[i][XVEL] < 0) ||
          ((ballInfo[i][X] + ballInfo[i][R]) >= 1 && ballInfo[i][XVEL] > 0)) {
        ballInfo[i][XVEL] = -ballInfo[i][XVEL];
      }
      // bounce off bottom or top wall
      if (((ballInfo[i][Y] - ballInfo[i][R]) <= 0 && ballInfo[i][YVEL] < 0) ||
          ((ballInfo[i][Y] + ballInfo[i][R]) >= 1 && ballInfo[i][YVEL] > 0)) {
        ballInfo[i][YVEL] = -ballInfo[i][YVEL];
      } else {
        // Add some gravity
        ballInfo[i][YVEL] += GRAVITY;        
      }
    }
  }
  
}

