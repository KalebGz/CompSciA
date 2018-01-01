/*Purpose: Random Essay Generator
 * 
 * Date: 10/22/17
 */
public class RandomEssay{
  public static void main ( String[] args){
    
    int length = Integer.parseInt(args[0]);
    int printLength = 1;
    // array with 11 random words
    String[] words = {"says ", "The ", "fascinating ","declares ","love " ,"guilt ","pain ", "for "," society ","due to "};
    // Indentation
    System.out.print("     ");
    //prints out words with word count up to given length
    for (int i = 0; i < length; i++){
      // 
      if ( printLength % 8 == 0){
        System.out.print(". ");
      }
      // generates random index to get a random word from the array
      int index = (int) (Math.random()* 10);
      // prints out word from th array with randomly generated index
      System.out.print( words[index]);
      printLength++;
    }
    // prints new line after  program  finishes
    System.out.println();
  }
}