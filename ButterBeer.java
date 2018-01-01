
/* Purpose: Sings "100 bottles of butterbeer on the wall"
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10
 */

public class ButterBeer{
  public static void main(String[] args){
    
    int max = 100;
    
    while( max > 1 ){
      System.out.println( max + " bottles of beer on the wall," + max + " bottles of beer. " + " Take one down pass it around " + (max -1) + " bottles of beer on the wall");
    max--;
    }
  }
}