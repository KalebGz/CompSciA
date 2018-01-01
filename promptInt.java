import java.util.Scanner;
/** Purpose:
  * @param
  * @author
  * @return
  * 
  */
public class birthday{
  public static void main ( String[] args){
    int age =  promptInt ( " How old are you");
    
  }
  /** Purpose:
  * @param
  * @author
  * @return
  * 
  */
  
  public static void promptInt(String msg){
    Scanner input = new Scanner( System.in);

    System.out.println(msg); 
    if ( input.hasNextInt()){
      return input.nextInt();
    } else{
        System.out.println( " I don't understand. Enter an Integer.");
        input.next();  // ignore what they typed
    }

}
}
