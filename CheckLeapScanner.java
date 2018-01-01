/**Purpose : Checks if the year is a leap year
  * 
  * Date: OCT 2, 2017
  */


import java.util.Scanner;
  public class CheckLeapScanner{
  public static void main (String[] args){
    // initializes input from scanner as variable year
    
    
    Scanner yr = new Scanner(System.in);
    double year = yr.nextInt();

    
    /* checks if year is divisible by 4 and not divisible by 100 or if the
     * year is divisble by 400 and prints significance
     */ 
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0  ){
      System.out.println((int) year + " is a leap year");
    } else{
      System.out.println( (int)year + " is NOT a leap year");
    }
    
    
    
  }
}