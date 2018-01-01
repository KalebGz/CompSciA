
/* Purpose: Checks if given number is prime + prints out its divisors
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class Prime{
  public static void main(String[] args){
    
    // variable initialization
    int num = (Integer.parseInt(args[0]) );
    int i = num;
    int divisors = 0;
    
    // checks if given number is divisable by each integer behind it on the numberline. 
    while( i > 0 ){
      double div = num % i;
      // Diagnostic Check - System.out.println( "number mod i:" + num + "   " + i + "    " + div);
      if ( div == 0){
        // if given number is divisable by i, number of divsors go up    
        divisors++;
        // Diagnostic -     System.out.println( " divisors " + divisors);
      }
      i--;
    }
    // if divisors > 2, number is not prime
    if ( divisors >2){
      System.out.println( (num ) + " has " + (divisors ) + " divisors - <is not prime>");
    }else{
      System.out.println( (num ) + " has 2 divisors - <is prime>  ");
    }
    
  }
}