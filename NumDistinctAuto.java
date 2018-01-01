
/* Purpose: uses args to check how many distinct nums are given
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10 2017
 */

public class NumDistinctAuto{
  public static void main(String[] args){
    
    int num1;
    int num2;
    int num3;
    
    int distinct = 3;
    //checks if arg length is >= 3. returns otherwise
    if (args.length >= 3 ){
      // initialize variables with arguments
      num1 = Integer.parseInt(args[0]);
      num2 = Integer.parseInt(args[1]);
      num3 = Integer.parseInt(args[2]);
      
      // auto generates values if arg length is not >= 3
    }else{
      num1 = (int) (Math.random() *3 +1);
      num2 = (int) (Math.random() *3 +1);
      num3 = (int) (Math.random() *3 +1);
    }
    
    // Diagnostic: Make sure inputted values match
    System.out.println( " Values " + num1 + ", " + num2 + ", " + num3);
    
    // Checks if values are distinct
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
    
    System.out.println(" Number of distinct Numbers: " + distinct);
  }
}