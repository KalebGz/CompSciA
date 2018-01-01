
/* Purpose: Generates random password based on given length
 * 
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 11
 */

public class RandomPassword{
  public static void main(String[] args){
    // initialises length given into variable
    int length = Integer.parseInt(args[0]);
    
    while ( length > 0){
      // generates a value beween 60 - 125( generally numbers and alphabet in ascii) and coverts it into charcarters
      char pass = (char) Math.ceil(Math.random() *65 + 60);
      System.out.print(pass);
      length--;               
    }     
    System.out.println();
    
    
  }
  
}
