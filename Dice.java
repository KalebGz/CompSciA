/**purpose; Dice game
 * 
 * @author: Kaleb Gezahegn
 * Oct 16 2017
 */
public class Dice{
  public static void main (String[] args){
    
    int die1 = (int)Math.ceil(Math.random() * 6);
    int die2 = (int) Math.ceil(Math.random() * 6);    
    System.out.printlan("die 1 = " + die1);
    System.out.println("die 2 = " + die2);    
  }
}