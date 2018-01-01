/** Purpose: Allows you to play Mancala
  * @param
  * @author:   
  * @return
  */

public class Mancala{
  
  static boolean waiting = true;
  static boolean playerOneTurn = true;
  static int PlayerOnePit = 7;
  static int PlayerTwoPit = 14;
  
  
  public static void main (String[] args){
    
    int playerNum = 1;
    int[] pits = new int[14];     
    // Gives all the small elipses the value of 4
    for( int i = 1; i<= 13; i++) { pits[i] = 4; } pits[7] = 0;
    StdDraw.setCanvasSize( 1060, 400);
    


    // starts of by drawing the boarding and with it being player 1's turn
    board( pits, playerOneTurn);
    
    // continiously checks if mouse is pressed
    while (waiting) {
      

      
      int IndexClicked = mouseClicked(playerOneTurn);
      if ( gameOver(pits) ){ waiting = false;}
      pits = changedArray(pits, IndexClicked );
      playerOneTurn = !playerOneTurn;
      board( pits, playerOneTurn); 


    }
    winnerScreen ( pits);

  }
  
  public static int mouseClicked(boolean playerOneTurn){
    while ( true ) {
      
      if(StdDraw.isMousePressed() ) {
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();
        int row = (int) Math.ceil(Math.abs(9.5 - y));
        int column =(int) Math.ceil( (x - 3.75)/1.75) +1;
        System.out.println(x+" ,  "+y);
        System.out.println("Column: " +column+" Row:  "+ row);
        // allows me to access the vals of player 1 and player 2
        int playerNum;
        if (playerOneTurn) { playerNum = 1 ;}
        else {playerNum = 2;}
        // 
        if (playerNum == 1 && row > 2 ){ System.out.println( " Index Clicked: " + (14-column));  return (14- column); }
        if (playerNum == 2 && row <= 2  ){ System.out.println( " Index Clicked: " + column); return (column); }
        
        

      }
              StdDraw.pause(200);
    }
  }
  public static boolean capture (int[] pits, int finalIndex  ) {
    
    if (  playerOneTurn && finalIndex < 14 && finalIndex > 7 && pits[finalIndex] == 1 ) { return true;}
    else if (  (!(playerOneTurn)) && finalIndex < 7 && finalIndex > 0 && pits[finalIndex] == 1 ) { return true;}
    else { return false; }
    
  }
  /**  Changes the array based on clicked index */
  public static int[] changedArray ( int[] pits,int indexClicked) {
    
    int finalIndex = indexClicked - pits[indexClicked];

    
    pits[indexClicked] = 0;
    // increments pits for player 2
    for ( int i = indexClicked-1; i >= finalIndex; i--){
      if (i < 0 ){ pits[i+14]++; }
      else pits[i]++;

    }
    // stops the final index from becoming negative
        if (finalIndex < 0 ) { finalIndex += 14; } 
        
        
    // if you can capture or if last bean ends in player pit, you go again
        
    if ( capture( pits, finalIndex) ) {
      if (playerOneTurn) { pits[7] = pits[7] + pits[finalIndex] + pits[14-finalIndex] ;}
      if (!playerOneTurn) { pits[0] = pits[0] + pits[finalIndex] + pits[14-finalIndex] ;}
      pits[14-finalIndex] = 0;
      pits[finalIndex] = 0;

    }
    if ( playerOneTurn && finalIndex == 7) {  playerOneTurn = !playerOneTurn; }      
        if ( (!(playerOneTurn)) && finalIndex == 0) {  playerOneTurn = !playerOneTurn; }             
    return pits;
  }
  
  // return true if players pits are empty
  public static boolean gameOver (int[] pits ) {
    if (  pits[13] == 0 && pits[12] == 0 && pits[11] == 0 && pits[10] == 0 && pits[9] == 0 && pits[8] == 0) return true;
    else if (  pits[1] == 0 && pits[2] == 0 && pits[3] == 0 && pits[4] == 0 && pits[5] == 0 && pits[6] == 0) return true;
    else return false;
    
    
  }
  
  /** Purpose: Draws Mancala Board
    * @param: array for the pits of each ellipse
    */
  public static void board (int[] pits, boolean playerOneTurn ){
    
    // allows me to access the vals of player 1 and player 2
    StdDraw.clear();

// sets the scale so only the board and a bit on top is shown
    StdDraw.setXscale(1,15);
    StdDraw.setYscale(5,12);
    
    int playerNum;
    if ( playerOneTurn) { playerNum = 1; }
    else { playerNum = 2;}
    
// Text for the Player and title of the game
    StdDraw.text ( 8, 11.5 , "Mancala" );
    StdDraw.text(playerNum * 5, 11.5, "Player  " + playerNum );
    
    // draws main board rectangle
    StdDraw.filledRectangle (8,8,7,3);
    //StdDraw.filledEllipse(1,2,1.5,2);
    
    // draws the top row of ellipses
    double eclipseX;
    double eclipseY;
    eclipseX= 3.5;
    eclipseY= 9.5;    
    StdDraw.setPenColor( StdDraw.WHITE);
    
    for ( int i = 1; i < 7; i++){
      StdDraw.setPenColor( StdDraw.WHITE);
      StdDraw.filledEllipse(eclipseX, eclipseY , .5, 1);
      StdDraw.setPenColor( StdDraw.BLACK);
      StdDraw.text(eclipseX, eclipseY, ""+pits[i]);
      
      eclipseX+=1.75;
    }
    eclipseX = 12.25;
    eclipseY = 6.5;
    // draws the bottom 6 row of eclipses
    for ( int i = 0; i < 6; i++){
      StdDraw.setPenColor( StdDraw.WHITE);
      StdDraw.filledEllipse(eclipseX, eclipseY, .5, 1);
      StdDraw.setPenColor( StdDraw.BLACK);
      StdDraw.text(eclipseX, eclipseY,""+ pits[i+8]);
      
      eclipseX-=1.75;
    }
    // draws the left big eclipse
    StdDraw.setPenColor( StdDraw.WHITE);
    StdDraw.filledEllipse(2,8, 0.75, 2.5);
    StdDraw.setPenColor( StdDraw.BLACK);
    StdDraw.text(2, 8, ""+pits[0]);
    // draws the right big eclipse
    StdDraw.setPenColor( StdDraw.WHITE);
    StdDraw.filledEllipse(14,8, 0.75, 2.5);
    StdDraw.setPenColor( StdDraw.BLACK);
    StdDraw.text(14, 8, ""+pits[7]);
    
  //  StdDraw.disableDoubleBuffering();
  }
  
  public static void winnerScreen (int[] pits){
    StdDraw.clear();
    StdDraw.text(2.5, 9,"Player Two score: "+ pits[0]);
    StdDraw.text(12.5, 9,"Player One Score: "+ pits[7]);
    if ( pits[0] > pits[7]) {     StdDraw.text(7, 9,"Player Two Wins!!!");     }
    else{  StdDraw.text(8, 9,"Player One Wins!!!");  }
  }
}




