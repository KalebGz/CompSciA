/*Purpose: TESTS HOW 
 *  @Author : kaleb
 * Date : Oct 19, 17
 */
public class TimeCounter{
  public static void main (String[] args ){
    long startTime = System.currentTimeMillis();
    double count= 0;
    long time =0;
    long stopTime;
    
    while ( time < 1000){
      count ++;
      
       stopTime = System.currentTimeMillis();
       time = stopTime - startTime;
        // System.out.println( "count = " + count);
  }
 
  System.out.println( "count = " + count);
      
  }
}
