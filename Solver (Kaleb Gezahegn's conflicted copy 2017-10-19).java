import java.util.Scanner;
/**Purpose: Uses Binary search t tell you one zero of x if a - b of f(x) is continuous and a and b have opposite signs
  * 
  * @author: Kaleb Gezahegn
  * Date: Oct 17, 18
  */
public class Solver{
  public static void main(String args[]){
    // initializing vars from input
    Scanner input = new Scanner ( System.in);
    System.out.println(" Enter a/ min: " );  
    int a = input.nextInt();
    
    System.out.println(" Enter b/ max: " );   
    int b = input.nextInt();
    
    System.out.println(" Enter Epsilon: " );
    int e = input.nextInt();
    
    System.out.println(" a: " + a + "b; "  + b + "Epsilon " + e);
    
    double min = a;
    double max = b;
    double x = ( min + max) / 2;
    
                          
      
    while (Math.abs(f(x)) > e) {
      if (Math.signum(f(x)) == Math.singnum(f(min))){
        min = x;
      }else {
        max = x;
      }
      x = (min + max) /2;
      
  }
   System.out.println( " Found root: x = " + x);  
}
    public static double f ( double x){
      return ( x  * Math.sin(x) -3);
    }   
}