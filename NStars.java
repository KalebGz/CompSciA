
/* Purpose: prints n starts
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class NStars{
  public static void main(String[] args){
    

    int i = Integer.parseInt(args[0]);
    
    while( i > 0){
      System.out.print( "*");
    i--;
    }
    System.out.println();
  }
}
    