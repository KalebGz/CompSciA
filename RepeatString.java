/*Purpose: Print given string x number of times
 * 
 * Date: 10/22/17
 */
public class RepeatString{
  public static void main ( String[] args){
    
    
    int x = Integer.parseInt(args [1]);
    // loop runs  x number of times
    for ( int i = 0; i < x; i++){
      System.out.print( args[0] + " ");
      
    }
    // prints new line after program is done printing values
    System.out.println();
  }
}