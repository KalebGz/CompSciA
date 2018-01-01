
/* Purpose: uses args to check how many distinct nums are given
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 4 2017
 */

public class NumDistinctArgs{
  public static void main(String[] args){
    
    
    
    int distinct = 3;
    //checks if arg length is >= 3. returns otherwise
    if (args.length >= 3 ){
      // initialize variables with arguments
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int num3 = Integer.parseInt(args[2]);
      
      // Diagnostic: Make sure inputted values match
      System.out.println( " Values Entered " + num1 + ", " + num2 + ", " + num3);
      
      if(num1 == num2){
        distinct--;
      }
      if (num2 == num3){
        distinct--;
      } if (num1 == num3){
        distinct--;
      }
      // if all values are equal you have 1 distinct value
      if ( (num1 == num2) && (num2 == num3)){
        distinct = 1;
      }
          
          }else{
            return;
          }
          
          
          System.out.println(" Number of distinct Numbers: " + distinct);
          }
}