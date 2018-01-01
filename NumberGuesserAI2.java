import java.util.Scanner;
/*Purpose: Guesses number from 1-x that user picks based on whether comp guesses are higher/lower
 * 
 * Date: Oct 16, 2017
 */

public class NumberGuesserAI2 {
  public static void main(String[] args) {
    
    
    System.out.println("Give me a range of the number that you are thinking of");
    Scanner input = new Scanner(System.in);
    int max = input.nextInt();
    int guess = max/2 ;
    double added;
    
    // pretty  much messed around till i get the i that would work for 1-100(7)
    
    int i = (int) Math.ceil((Math.log(max)/Math.log(2)));
    
    System.out.println(" I = " + i);
    while (i > 0){
      System.out.println(" Is " + guess + " your number");
      System.out.println("-1 = No Guess lower      0 = You got it right!!!!      1 = Guess higher");
      int check = input.nextInt();
      
      if( check == -1){
        
        added = ( int) Math.ceil(max-guess)/2;
        max = guess;
        guess =  max - (int)added;
        System.out.println("max - added = " + max + " + " + added );
        
      }else if ( check == 1){
        added = (max-guess)/2;
        max = guess;
        guess = guess + (int)added;
        System.out.println("max + added = " + max + " + " + added );
      }else{
        System.out.println("Whoop Whoop. " +  " is your number");
        break;
      }
      
      i--;
    }
  }
}
