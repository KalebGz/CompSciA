/**Purpose : Get highest score possible, as long as it isn't more than 21 
  *            and give advice to player
  * 
  * Date: OCT 2, 2017
  */
public class BlackjackAdvisor{
  public static void main (String[] args){
    /* take a random decimal from 0 to 1
     * miltiplies it by 10 to get an integer with a decimal
     * rounds the int up to avoid geting 0
     * converts double to int
     */
    int firstCard = (int)Math.ceil(Math.random()*13);
    int secondCard = (int)Math.ceil(Math.random()*13);
    
    System.out.println(" Your cards: " + firstCard + ", " + secondCard);
    
    // converts special cards to 10
    if ( firstCard >= 11){
      firstCard = 10;
    } 
    if ( secondCard >= 11){
      secondCard = 10;
    }  
    
    int Score = firstCard + secondCard;
    /* if you have one 1(card) and your score is less than 16, it adds 4 to score(1 becomes a 5)
     * converts two 1's to a 10
     */
    if ( Score <= 16 && (firstCard == 1 || secondCard == 1)){
      Score+=4;
    }
    if ( Score <= 11 && (firstCard == 1 && secondCard == 1)){
      Score+=8;
    }
    
    System.out.println("Score: " + Score);
    /* if after all changes your score is less than 14 you have a 7/13 chance( >50% chance) of picking a number <7 
     * (less likely of score > 21
     */
    if ( Score < 14){
      System.out.println("Take a hit");
    }else {
      System.out.println("Stay");
    }
    
    
    
  }
}