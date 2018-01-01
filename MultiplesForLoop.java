/*Purpose: prints multiples of a  from 0 to N
 *  @Author : kaleb
 * Date : Oct 19, 17
 */
public class MultiplesForLoop{
  public static void main (String[] args ){
    
    int a = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);  
            System.out.println(" value given: " + a );     
            System.out.println(" Highest Possible multiple: " + n );
            System.out.println(" (Smallest possible mulliple = 1"  );
    
    for ( int i = n ; i > 0; i--){
      if ( (a % i) == 0){
        System.out.println(i);
      }
    }
    
  }
}
