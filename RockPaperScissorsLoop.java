import java.util.Scanner;
/* Purpose: Play rock paper scissor with computer
 * 
 * Author:Kaleb Gezahegn
 * Date: Oct 10 2017
 */

public class RockPaperScissorsLoop{
  public static void main(String[] args){
    int i = 0;
    while( i == 0){
    
    String hand = "";
    String comp = "";
    // 
    System.out.println(  " Rock = 0       Paper = 1       Scissors= 2 "  );
    
    Scanner input = new Scanner (System.in);
    
    System.out.println(  " Enter value"  );
    int handnum = input.nextInt();
    int compnum = (int) (Math.random() *2 +1);  
    
    // assigns value generated for comp Rock Paper or scissors
    if ( handnum == 0){
      hand = "Rock";                        
    }
    if ( handnum== 1){
      hand = "Paper";                        
    }
    if ( handnum == 2){
      hand = "Scissors";     
      
      // assigns value entered by user Rock Paper or scissors
    }
    if ( compnum == 0){
      comp = "Rock";                        
    }
    if ( compnum == 1){
      comp = "Paper";                        
    }
    if ( compnum == 2){
      comp = "Scissors";                        
    }
    // Diagnostic - prinst generatetd and inputed value
    System.out.println( "You played " + hand + ". The computer played " + comp);
    
    // checks if you have won
    if ( ( handnum == 0) && ( compnum == 1) || (( handnum == 1) && ( compnum == 2) )  || (( handnum == 2) && ( compnum == 0) ) ){
      System.out.println( "Computer wins");
    } else if ( handnum == compnum){
      System.out.println( "You tie");
    }else{
      System.out.println( "You win");
    }
    
    
    
    // allows you to play the game again
     Scanner replay = new Scanner (System.in);
    
    System.out.println(  " Input    0 - Play again            1- End game"  );
    i = replay.nextInt();
    
    }
  }
}