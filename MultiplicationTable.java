/* Purpose: prints out a multiplication table
 * 
 * Author:
 * Date: Oct 29
 */

public class MultiplicationTable{
  public static void main(String[] args){
    
    // variable for what do you want the two biggest number multiplied to be
    int length = Integer.parseInt(args[0]);
    
    // increments number being multiplied each row
    for (int num  =1 ; num <= length; num++){
      if (num ==1){System.out.print(  "\t");   } 
      else {System.out.print(num + "|\t");   } 
      
      // increments number being muliplied each collumn( separated by tab (\t))
      for ( int i = 1; i <= length ; i++){
        System.out.print((num * i ) + "\t"); 
      }       
      System.out.println(); 
    }
    
    
  }
}
