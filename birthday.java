import java.util.Scanner;
/** Purpose:
  * @param
  * @author
  * @return
  * 
  */
public class birthday{
  public static void main ( String[] args){
    int age =  promptInt(" How old are you");
    System.out.println("You are " + age + " years old");
  }
  /** Purpose:
  * @param
  * @author
  * @return
  * 
  */
  
  public static int promptInt(String msg){
    Scanner input = new Scanner( System.in);
    while ( true){
    System.out.println(msg); 
    if ( input.hasNextInt()){
      return input.nextInt();
    } else{
        System.out.println( " I don't understand. Enter an Integer.");
        input.next();  // ignore what they typed
    }

}
}
}