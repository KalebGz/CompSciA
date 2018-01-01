/* Purpose: prints n star stair in with lowest stair having the number of stars inputted
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 27
 */

public class NStarsLoop{
  public static void main(String[] args){
    
    // num decides when to go on to the next line
    for (int num  =1 ; num <= (Integer.parseInt(args [0])); num++){
      // prints out how many stars to print in each line ( number of starts corresponds to what line ( num))
      for ( int i = 0; i < num ; i++){
        System.out.print("*");
      }
          System.out.println();
    }

    
  }
}
    