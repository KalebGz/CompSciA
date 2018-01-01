public class RecursionCircleDemo{
  public static void main ( String args[] ){
    for ( int i = 0; i < 10; i++){
    drawCircles(0.5,0.5,i*.1,5);
    StdDraw.setPenColor(i  , i *10, i*10);

    }
    System.out.println("Happy Holidays");
    
    
  }
  public static void drawCircles ( double xCtr, double yCtr, double r, int n ){
    
    if ( n== 0) {return ;}
    StdDraw.circle(xCtr,yCtr,r);
    drawCircles (xCtr, yCtr + r, r/3, n-1);
    drawCircles (xCtr, yCtr - r, r/3, n-1);
    drawCircles (xCtr+r, yCtr , r/3, n-1);
    drawCircles (xCtr-r, yCtr , r/3, n-1);

  }
  }
