/** Purpose: finds 1 root of f(x)
  * 
  * Date: 10/18
  */
public class Solver{
  public static void main ( String[] args){
    
    double a ;
    double b;
    double epsilon;
    int count = 0;
    // default values for a, b, and epsilon if args.length == 0
    if(args.length == 0 ){
      a = 0;
      b = 20;
      epsilon = 0.5;
      
    }else{
      a = Double.parseDouble(args[0]);
      b = Double.parseDouble(args[1]);
      epsilon = Double.parseDouble(args[2]);
      
    }
    
    if (Math.signum(f(a)) == Math.signum(f(b))){
      System.out.println( " A and B have the same signs");
    } else {
      System.out.println( " A and B have different signs");
    }
    System.out.println( " Searching for roorts from " + a + " to " + b);
    System.out.println( " epsilon:  " + epsilon);
    
    double min = a;
    double max = b;
    double x = (min + max) / 2;
    while ( Math.abs(f(x)) > epsilon ){
      //System.out.println( " min:  " + min +  "max:   " + max + "x= " + x);
      
      count++;
      if ((f(x)>0) == (f(min)>0)) { //checks if have same sign
        //if (Math.signum(f(x)) == Math.signum(f(min)))
        min = x;
        
      } else {
        max = x;
        
      }
      
    }
    System.out.println("found root: x=" +x);
    System.out.println("Count: " + count);    
  }
  
  /** Returns x*sin(x) - 3. */
  public static double f (double x) {
    //return x* Math.sin(x) -3;
    return Math.abs(x)/x;
    // return Math.pow(x,2) -2;
  }
}