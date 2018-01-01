/*Purpose: prints all perfect number up to given point
 * 
 * Date: 10/22/17
 */
public class PerfectNumberChallenge{
  public static void main ( String[] args){
    
    
// loop runs for every number before given number down to 0 and checks if num is a perfect number
    for (int num = Integer.parseInt(args[0]) ; num> 0; num--){
      int sum = 0;
      // checks if i is factor of num and adds it to the sum if so
      for ( int i= 1; i <= num/2; i++){
        if ( num % i == 0){
          sum+=i;
        }
      }
      
      // if the sum of num's factor = num; num is a perfect number
      if ( sum == num){
        System.out.println( num + " is a perfect number.");
      }
    }
  }
}
