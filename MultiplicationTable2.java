/* Purpose: prints out a multiplication table
 * 
 * Author:
 * Date: Oct 29
 */

public class MultiplicationTable2{
  public static void main(String[] args){
    
    // variable for what do you want the two biggest number multiplied to be
    int length = Integer.parseInt(args[0]);
    
    // increments number being multiplied each row
    for (int num  =1 ; num <= length; num++){
      if ( num == 1){
        System.out.print("      ");
      }
      
      // increments number being muliplied each collumn( separated by tab (\t))
      for ( int i = 1; i <= length ; i++){
                if ( num == 1){System.out.print((num * i ) + "\t"); }
      }
        System.out.print((num * i ) + "\t"); 

      System.out.println( );  
      System.out.print(num + "|    "); 
      
    }
    System.out.println( );             
  }
}