/** Purpose: Checks if you get 1 more times from rolling it 6 times rather than 12
  * @param
  * @author
  * @return
  * 
  */
public class Die{
  public static void main ( String[] args){
    
// runs the loop 10 times
    int six = 0;
    int twelve = 0;
    for ( int i = 0; i < 10; i++){
      // rolls dice 6 and 12 times and gets how many times you get 1
      int numOne = roller ( 6);
      int numTwo= roller (12);
      // you should get 1 rwice as much if you roll it 12 times so multiply the times you get 1 from 6 rols by 2 to see what the value would be if rolled 6 more times.
      numOne*=2;
      if ( numOne > numTwo){
        six++;
      }else{
        twelve++;
      }
      
      
    }
    // if the number of time you get 1 when rolling 6 is greater than the number if times you get a 1 from rolling 12 times ( in relation); print out so 
    if ( six > twelve){
      System.out.println("6. You get 1 more times if you role it 6 times");
    }else {
      System.out.println("12. You get 1 more times if you role it 12 times");
    }
  }
  /** Purpose: rolls a dice 
    * @param
    * @author
    * @return Number of times you roll a 1
    * 
    */
  public static int roller(int time){
    int counter = 0;
    for (int i = 0; i < time; i++){
      int random = (int)(Math.random()*6)+1;
      if ( random == 1){ counter++; }                  
      
    }
    return counter;
  }
}