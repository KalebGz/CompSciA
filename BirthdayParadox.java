/** Purpose: Gives you the chance that 2 people of a given pold of people have the same birthday
  * @param
  * @author
  * @return; Percentage
  * 
  */
public class BirthdayParadox{
  public static void main (String[] args){
    
    
    int pool = 2;
    double percentage = 0;
    while ( percentage <50){
      pool++;
      percentage = minRequired ( pool);
      // System.out.println("pool:" + pool + "  Percentage: " + percentage);
    }
    System.out.println("Pool of people:" + pool);
  }
  public static double minRequired ( int given ){
    
    double trial = 0;
    double correct = 0;
    // checks in how many cases did atleast two people have  the same birthday
    while ( trial < 10000){
      
      // if two pepole have the same birthday increment cases by 1
      if ( sameBirthday (given)) { correct++;}
      trial++;
    }
    // percentage equals number of times you got the same birthday over the total number of trials
    double percentage = (correct /trial) * 100;
    return percentage;
  }
  
  
  
  /** Purpose: Gives you the chance that 2 people of a given pold of people have the same birthday
    * @param: Number of people
    * @author
    * @return: boolean based on whether or not atleast two people have the same birthday
    * 
    */
  public static boolean sameBirthday (int people){
    int count = 0;
    boolean hasSameBirthday = false;
    
    
    
    int day[] = new int [people]; 
    
    
    for ( int i = 0; i < people; i++){
      // assigns each index a random day of the year for birthday
      day[i] =(int) (Math.random() * 364) +1;
    }
    // compares birthday's in each array to one another
    for ( int i = 0; i < people; i++){
      for ( int j = i+1; j < people; j++){
        // if atleast 2 peple have the same birthday, boolean hasSameBirthdat becomes true
        if ( day[i] == day [j] ) {  count++; hasSameBirthday  = true; }  
      }
    }
    
    
    //if (!hasSameBirthday) {System.out.println( " NO. None of them are equal. People:" + people );}
    //else{ System.out.println( " YES. They have the same birthday. People:" + people);}
    
    return hasSameBirthday;
    
  }
}