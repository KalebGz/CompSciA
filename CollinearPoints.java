/** Purpose:"returns true if the three points (x1, y1), (x2, y2), and (x3, y3) lie on the same line, and false otherwise."
  * @param (int x1, int y1, int x2, int y2, int x3, int y3)
  * @author
  * @return True or False
  * 
  */
public class CollinearPoints{
  public static void main(String[] args){
    
    int x1 = Integer.parseInt(args[0]);
    int y1 = Integer.parseInt(args[1]);
    int x2 = Integer.parseInt(args[2]);
    int y2 = Integer.parseInt(args[3]);
    int x3 = Integer.parseInt(args[4]);
    int y3 = Integer.parseInt(args[5]);
    
    double slope = slope(  x1,  y1,  x2,  y2);
    int yIntercept = yIntercept((int)slope,  x1,  y1);
    System.out.println( "(y = mx + b)" + " y = " + slope + "x + " + yIntercept);
    
    double y3Guess = (slope * x3) + yIntercept;
    if ( y3Guess == y3){ 
      System.out.println("TRUE. Points are Collinear");
    }else {
        System.out.println("FALSE. Points are not Collinear");
      }
      
  }
      public static double slope (int x1, int y1, int x2, int y2){
        double slope = (y2-y1)/ (x2-x1);
        return slope;
      }
      
      public static int yIntercept ( int slope, int x1, int y1){
        int yIntercept =(int) y1 - (slope * x1);
        return yIntercept;
      }
  }