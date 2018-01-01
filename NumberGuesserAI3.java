import java.util.Scanner;
/*Purpose: Comp Guesses number from 1-100
 * 
 * Date: Oct 16, 2017
 */

public class NumberGuesserAI3 {
  public static void main(String[] args) {
    
    
    Scanner input = new Scanner(System.in);
    
    int max = 100;
    int guess = 50 ;
    int prevGuess = 0;
    double half;
    
    
    
    // pretty  much messed around till i get the i that would work for 1-100(7). its a log function that shows how many tries it would take to represent x numbers
    
    int i = (int) Math.ceil((Math.log(max)/Math.log(2)));
    // gives comp max of 7 questions/tries
    System.out.println(" I = " + i);
    while (i > 0){
      System.out.println(" Is " + guess + " your number");
      System.out.println("-1 =  Guess lower      0 = You got it right!!!!      1 = Guess higher");
      int check = input.nextInt();
      // if num is lower take the distance from the given number and the previous number, divide by 2, then subreact it from guess to find middle of lower range
      if( check == -1){ //  Guess lower
        max = guess;
        half = ((max - prevGuess)/2);
        
        guess = guess - (int) half;
        
        
        // if num is lower take the distance from the given number and the previous number, divide by 2, then add it to guess to find middle of higher range
      }else if ( check == 1){ //  Guess higher
        prevGuess = guess;
        half = ((max- guess)/2);
        guess = guess + (int)half;
        
        
        // if guess was right, Comp wins (always should run)
      }else{
        System.out.println("Whoop Whoop. " +  guess +" is your number");
        break;
      }
      
      i--;
    }
  }
}
