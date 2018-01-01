
/* Purpose: print all ints from 0 to given integer
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class CountUp{
  public static void main(String[] args){
    
    int i = 1;
    int max = Integer.parseInt(args[0]);
    
    while(i < max +1 ){
      System.out.println(i);
      i++;
    }
    
    
  }
}