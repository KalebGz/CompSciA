/*Purpose: Prints given string to fill n characters
 * 
 * Date: 10/22/17
 */
public class LoremIpsum{
  public static void main ( String[] args){
    
    // length of sentence starts of at 0. user 
    int length = 0;
    int n = Integer.parseInt(args[0]);
    // array with strings of words to fill essay 
    String[] words = {"says ", "The ", "fascinating ","declares ","love " ,"guilt ","pain ", "for ",". ","because ","society ",};
    runs 50 times
    for (; length <=n ;){ 
      int index = (int) (Math.random()* 11);
      String printStr = words[index];
      length+= printStr.length();
    }
    
    
    /*
      if ( length <= 50){
        
        System.out.print(printStr);
      }else{
                System.out.println("length:" + length );
        int extra = length -50;
        printStr = printStr.substring( 0, extra-1) ;
        String printStrNew = printStr.substring( extra+1, printStr.length()-1) ;
        System.out.print(printStr );
        System.out.println(printStrNew );
       */ 
      }
      
    }
  }
}