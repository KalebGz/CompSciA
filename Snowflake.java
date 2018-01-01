/** draws a snowflake */
public class Snowflake {
  public static void main (String[] args){
    StdDraw.setScale ( 0,10);
    
    
    StdDraw.setPenRadius(1);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.line(5,0,5,10);
    drawSnowflake (5,5,2,3); 
  }
  public static void drawSnowflake ( double xCtr, double yCtr, double radius, int n ) {
    StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.setPenRadius(.005);
    
    //StdDraw.enableDoubleBuffering();
    StdDraw.line( xCtr - radius, yCtr , xCtr + radius, yCtr);
    StdDraw.line( xCtr - radius/2, yCtr +radius, xCtr + radius/2, yCtr -radius);
    StdDraw.line( xCtr + radius/2, yCtr +radius, xCtr - radius/2, yCtr -radius);
    if ( n == 0) { return;}
    
    drawSnowflake(xCtr + radius/2, yCtr + radius, radius/4, n-1);
    // drawSnowflake(xCtr , yCtr , radius/4, n-1);
    drawSnowflake(xCtr - radius/2, yCtr + radius, radius/4, n-1);
    drawSnowflake(xCtr + radius, yCtr , radius/4, n-1);
    drawSnowflake(xCtr - radius, yCtr , radius/4, n-1);
    drawSnowflake(xCtr + radius/2, yCtr - radius , radius/4, n-1);
    drawSnowflake(xCtr - radius/2, yCtr - radius, radius/4, n-1);
    
    //  StdDraw.disableDoubleBuffering();
    //  StdDraw.show();
  }
}