/**Purpose : Checks if 1st num is divisible by num 2
  * 
  * Date: OCT 2, 2017
  */
public class divides{
  public static void main (String[] args){
    // initializes variables for input
    
    double num1 = Double.parseDouble( args[0]);
    double num2 = Double.parseDouble( args[1]);
    
    // checks if num 1 is divisvle by num2
    
    if ( num1 % num2 == 0){
      System.out.println(" Divisible");
      
    }else if ( num2 == 0){
            System.out.println(" Can't divide by 0, silly");
    }else{
      System.out.println(" NotDivisible");
    }
    
    
    
  }
}