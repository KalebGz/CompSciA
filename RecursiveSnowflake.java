public class RecursiveSnowflake {
  public static void main (String[] args){
    
    drawSnowflake ( 0.5,0.5, 0.5, 6);
    
  }
  public static void drawSnowflake( double xCtr, double yCtr,double radius,  int n ) {
    
    StdDraw.setScale( -5,5);
    if ( n == 0) { return; }
    StdDraw.line (  xCtr - radius, yCtr , xCtr +radius , yCtr );
    StdDraw.line(xCtr -radius/2, yCtr + radius, xCtr + radius/2 , yCtr - radius);
    StdDraw.line(xCtr + radius/2, yCtr + radius, xCtr - radius/2 , yCtr - radius);
    
    drawSnowflake ( (xCtr + radius)/2, yCtr + radius, radius/2, n-1);
   // drawSnowflake ( (xCtr - radius) /2, yCtr - radius, radius/2, n-1);


  }
}