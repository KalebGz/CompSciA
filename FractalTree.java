public class FractalTree {
  public static void main (String[] args){
    StdDraw.setScale ( 0,10);
    double angle = 1;
    drawBranch ( 5,0,1,1,6,5);
  }
  public static void drawBranch ( double xCtr,double yCtr, double radius, double  angle, double penRad, int n){
    if ( n==0 ) { return;}
    StdDraw.setPenRadius(penRad/1000);
   
    StdDraw.line( xCtr , yCtr  , xCtr - angle, yCtr + radius ) ;
    drawBranch ( xCtr , yCtr + radius, radius/2, angle/2, penRad/2, n-1);
  }
}