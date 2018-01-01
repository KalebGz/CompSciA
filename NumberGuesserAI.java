import java.util.Scanner;
/*Purpose: Guesses number from 1-x that user picks based on whether comp guesses are higher/lower
 * 
 * Date: Oct 16, 2017
 */

public class NumberGuesserAI {
  public static void main(String[] args) {
    
    /boolean numberFound = false;
    System.out.println("Give me a range of the number that you are thinking of");
    Scanner input = new Scanner(System.in);
    int range = input.nextInt;
    int guess = range;
    
    While (numberFound == false){
      guess/=2;
      System.out.println(" Is " + guess + "your number");
      System.out.println("-1 = No Guess lower      0 = You got it right!!!!      1 = Guess higher");
      int check = input.nextInt;
      if( check == -1){
        guess/=2;
      }else if ( check == 1){
        guess =(int) guess + (0.5 * guess);
      }else{
      numberfound = true;
      break;
      }
      
    }
      System.out.println(" You win");
  }
}
