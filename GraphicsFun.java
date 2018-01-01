public class GraphicsFun{
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
      // draw circle
      StdDraw.circle(xCtr,yCtr, radius);
      StdDraw.circle((xCtr/2),yCtr/2, radius/2);
      
      StdDraw.show();
      StdDraw.pause(10);
      xCtr += xVel;
      yCtr += yVel;
      //
      if (xCtr + radius >= 1 || xCtr - radius <= -1){ xVel = -xVel; }
      if (yCtr + radius >= 1 || yCtr - radius <= -1){ yVel = -yVel; }
    }
  }
}



