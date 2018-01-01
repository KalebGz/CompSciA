/** Purpose: Plays the cowpie game
  * @param
  * @author
  * @return
  * 
  */
public class CowPie{
  public static void main ( String[] args){
    boolean correctAnswer = false;
    //generate cow pie vals
    int row = (int)(Math.random()* 10)+1;
    int column = (int)(Math.random()* 10)+1;
    while (!correctAnswer){
      int rowGuess = birthday.promptInt("row?");
      int columnGuess = birthday.promptInt("Column");
      if ( row == rowGuess && column == columnGuess){ correctAnswer = true; System.out.println("Congragulations! You won"); break; }
      if ( row == rowGuess && !(column == columnGuess)){ System.out.println(" Row was Correct");}
      if ( !(row == rowGuess )&& (column == columnGuess)){ System.out.println(" Column was Correct");}
      if ( Math.abs( rowGuess- row)  ==1){ System.out.println(" Row was close");}
      if ( Math.abs( columnGuess- column) ==1){ System.out.println(" Column was close");}
      if (Math.abs( rowGuess- row)  !=1 &&Math.abs( columnGuess- column) !=1){ System.out.println(" Nope, Guess Again");}
      
      
    }
  }
}