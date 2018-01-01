/*Purpose: prints ints from N to 0
 *  @Author : kaleb
 * Date : Oct 19, 17
 */
public class NToZero{
  public static void main (String[] args ){
    
    int n = Integer.parseInt(args[0]);
    for ( int i = n ; i >= 0; i --){
      System.out.println(i);
    }
    
  }
}
