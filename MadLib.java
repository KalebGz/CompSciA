import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class MadLib{
  static String res = "";
  public static void main (String[] args) throws FileNotFoundException{
    
    
    String fileName = (args.length > 0)? args[0] : "madlib.txt";      
    File file = new File(fileName);
    Scanner input = new Scanner (file);
    int length = Integer.parseInt(input.nextLine()) ;
    // two arrays: One for word type name and one for actual value
    String[] wordType = new String[length];
    String[] wordVariables = new String[length];
     String fullText = "";
    
    
    
    // prints out the values of the next (length) Lines
    for ( int i = 0; i < length; i++){
      wordType[i] = input.nextLine();
      //System.out.println(wordType[i]);
    }
    
    
    // Ask Player to enter a Wordtype and saves it into the wordVariables array
    Scanner gameInput = new Scanner (System.in);
    for ( int i = 0; i < length; i++ ) {
      // a or an
      String typeAsked = wordType[i];
      String grammar = typeAsked.substring(0,1);
                                     
      if( grammar.equals("A") || grammar.equals("a")) { grammar = "an "; }
      else { grammar = "a ";}
            // tells you the last 

      String end = typeAsked. substring(typeAsked.length()-1, typeAsked.length() );
      if ( isInteger(end) )  { typeAsked = typeAsked.substring(0, typeAsked.length()-1);}
      System.out.println("Enter " + grammar +  typeAsked);    
      wordVariables[i] = gameInput.nextLine();;
    }
    
    
    /* Diagnososds
    System.out.println("wordType" + ":  " + Arrays.toString(wordType) );
    System.out.println("wordVariables" + ":  "+ Arrays.toString(wordVariables) );
    gameInput.close(); 
    */
  
    // saves the text of the Madlibs file into a new String
    while   (input.hasNextLine())   {  
       fullText += input.nextLine() + System.lineSeparator();
    }
    
    // replaces the full text string for each value in the array
         res = fullText;

            for (int i = 0; i < wordVariables.length; i++) {

      res = res.replaceAll(  "<" + wordType[i] + ">"  ,   wordVariables[i]); 

     if ( i == wordVariables.length -1) { System.out.println(res); }
            }

    input.close();

    System.out.println(" End of File");   
  }
  public static boolean isInteger ( String input) {
    boolean valid = false;
    try {
      Integer.parseInt(input);
      valid = true;
    }
    catch( NumberFormatException e){
      
    }
    return valid;
  }
        
}
