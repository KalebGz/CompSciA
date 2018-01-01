import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*Purpose: takes a filename, a search string, and a replace string, and prints out the contents of the given file, 
 * replacing ALL instances of the search string with the replace string.
 */
public class ReplaceInFile {
  public static void main(String[] args)  throws FileNotFoundException{
    
    /*testing to see how replaceAll works. Test: Success
     String input = "Hello, My name is bill bill bill";
     String res = input.replaceAll( "bill", "Joe");
     System.out.println(res);
     */
    String fileName = args[0];
    String search = args[1];
    String replace = args[2];
    File file = new File(fileName);
    Scanner input = new Scanner (file);
    
    while ( input.hasNextLine() ) {
      String lineOfText = input.nextLine();
      String res = lineOfText.replaceAll( search, replace);
      System.out.println(res );
    }
    input.close();
    System.out.println(" End of File");
  }
}