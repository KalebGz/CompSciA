
/* Purpose: print all evens from  given integer to 0
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class Evens{
  public static void main(String[] args){
    
    int max = 1;
    int i = Integer.parseInt(args[0]);
    
    while( (i  > max )){
      double div = i % 2;
      if ( (div == 0)){
        System.out.println( i);
      }
      i--;
    }
    
    
  }
}