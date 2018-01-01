/*Purpose: checks if value given is a perfect number
 * 
 * Date: 10/22/17
 */
public class PerfectNumber{
  public static void main ( String[] args){
    // initialize vars
    int num = Integer.parseInt(args[0]);
    int sum = 0;
    // loop runs till num has been divinded by every number up to it
    for ( int i= 1; i < num; i++){
      // checks if i is factor of num and adds it to the sum if so
      if ( num % i == 0){        
        sum+=i;
      }
    }
          System.out.println("Number given:"+ num +  " Sum: " + sum);
          // if the sum of num's factor = num; num is a perfect number
    if ( sum == num){
      System.out.println( num + " is a perfect number.");
    }else{
            System.out.println( num + " is NOT a perfect number.");
    }
     }
  }
