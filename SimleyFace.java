/*Purpose: Draws a smiley face that goes to the right border then goes back to the left border
 * 
 * Date: 10/25
 */
public class SimleyFace{
  public static void main (String[] args){
    
    StdDraw.setScale(-1,1);
    double xCtr = 0.5;
    double yCtr = 0.5;
    double xVel = 0.01;
    double yVel = 0.02;
    double radius = 0.1;
    StdDraw.enableDoubleBuffering();
    for (;;){
      StdDraw.clear();
      // draw smileyface
      StdDraw.circle(xCtr,yCtr, radius);
      StdDraw.circle((xCtr-0.05),yCtr+0.005, radius/4);
      StdDraw.circle((xCtr+0.05),yCtr+0.005, radius/4);
      StdDraw.line(xCtr -0.05 ,yCtr-0.1 + 0.05,xCtr + 0.05, yCtr -0.05 );
      

      StdDraw.show();
      StdDraw.pause(10);
      
      xCtr += xVel;

      
      //
      if (xCtr + radius >= 1 || xCtr - radius <= -1){ xCtr*=-1; yCtr*=-1; }
      if (yCtr + radius >= 1 || yCtr - radius <= -1){ xCtr*=-1; yCtr*=-1 ;}
    }
  }
}



