
/* Purpose: print all ints from  given integer to 0
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class CountDown{
  public static void main(String[] args){
    
    int i = 0;
    int max = Integer.parseInt(args[0]);
    
    while(max > i){
      System.out.println(max);
      max--;
    }
    
    
  }
}