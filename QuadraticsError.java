/** Purpose: Finds roots of quadratic using quadratic formula
 * @param
 * @author: Kaleb Gezahegn
 * @return: roots of f(x)
 * 
 */
public class QuadraticsError {
  public static void main(String[] args){
    
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);

    double disc = discriminant (  a,  b,  c);;
    double negb = -1*b;
    
    double denom =  2 * a;
    double calc = ((negb + disc)/denom);
    double calc2 = ((negb - disc)/denom);
    
    if (  disc < 0){
      System.out.println( "Roots are imaginary");
    }else if (a == 0){
      System.out.println( "Roots are undefined");
    }else{
      System.out.println("Roots are " + calc + ", " + calc2);
    }
    
    
    
    

    }
  /** Purpose: Finds the discrimnant of f(x)
 * @param: Cooefficient's: Double A 
 * @author: Kaleb Gezahegn
 * @return: roots of f(x)
 * 
 */
  public static double discriminant ( double a, double b, double c){
      
      double disc = ((b*b)-(4*a*c));
      Math.sqrt(disc);
      return disc;
    }
  }