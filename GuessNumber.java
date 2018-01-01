import java.util.Scanner;
/**Purpose: Number guessing game. tells you if guess is higher or lower
  * 
  * Date: Oct 13, 2017
  */


public class GuessNumber {
  public static void main ( String[] args){
    
    // generates random value from 1-100
    int generate = (int) Math.ceil(Math.random() * 100);
    System.out.println("Generated num: " + generate );
    /**
    int i = 5;
    // lets you guess 5 times
    while (i >=0){
      System.out.println(" Guess here");
      Scanner input = new Scanner ( System.in);
      int guess = input.nextInt();
              
      
      // tells you relation of guess to generated num
      if ( guess > generate){
        System.out.println(" Guess lower. You have " + (i) + " Tries left");
      } else if ( guess < generate){
        System.out.println(" Guess higher. You have " + (i) + " Tries left");
      } else{
        System.out.println(" You win. Points : " + ((i+1)* 20));
        break;
      }
      
      i--;
    }
    */
  }
}
