/*Purpose: Draws a checkerboard
 * 
 * Date: 10/25
 */
public class Checkerboard{
  public static void main (String[] args){
    
        StdDraw.setScale(0,50);
    double x = 0.05;
    double y = 49.95;
    double length = 0.05;


    for( int i = 2;;){
      // StdDraw.filledRectangle(double x, double y, double halfWidth, double halfHeight)
      if ( i % 2 == 0){
        StdDraw.filledRectangle( x,  y, length, length);
      } else {
        StdDraw.rectangle( x,  y, length,  length);
      }
      y-=length * 2;
      if ( y < 0){ y = 49.95; x+= (length * 2); i++; }
      i++;
     
    }
    
  }
}



