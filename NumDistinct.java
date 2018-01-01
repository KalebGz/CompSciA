import java.util.Scanner;
/* Purpose: uses a scanner to ask for three numbers
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 4 2017
 */

public class NumDistinctArgs{
  public static void main(String[] args){
    
    System.out.println(" Values Entered" + args[0] + ", " args[1] + ", " + args[2]);

    int num1 = args[0];
    int num2 = args[1];
    int num3 = args[2];
    
    int distinct = 3;
    
    if (args.length() < 3 ){
      return;
    }
    if(num1 == num2){
      distinct--;
    }
    if (num2 == num3){
      distinct--;
    } if (num1 == num3){
      distinct--;
    }
    
    
    System.out.println(" Number of distinct " + distinct);
  }
}