
/* Purpose: Calculates all divisors
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class Divisors{
  public static void main(String[] args){
    
    int min = 0;
    int i = Integer.parseInt(args[0]);
    int iMinus = i;
    
    while( iMinus  > 0 ){
      double div = i % iMinus ;
      if ( (div == 0)){
        System.out.println( iMinus);
      }
      iMinus--;
    }
    
    
  }
}