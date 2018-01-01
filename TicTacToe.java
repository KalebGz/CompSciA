public class TicTacToe {
  static boolean playerOneTurn = true;
  static String playerOne = "X";
  static String playerTwo = "O";
  static boolean gameOver =  false;
  static String winner = "";
  static int COUNT = 0;
  static int firstBoard = 1;
  static boolean finalPlayWin = false;

  public static void main (String[] args) {
   // declare  char 2d array
    char[][] boxes = new char[3][3];
    // draws blank board
    
    drawBoard(boxes);
    firstBoard = 0;
    // while game is not over, keep getting the box that user clicks and depending on whether or not it is player one's turn, 
    // change the char arry to 'X' or 'O' and redraw the board with the updated char array
    while ( !gameOver){
      int boxClicked = squareClicked(boxes);
      boxes = changeArray(  boxClicked, boxes );
      drawBoard(boxes);

      playerOneTurn = !playerOneTurn;
      // Counter for how many times player's have turned.If click is invalid count is incremented down 1

    
      StdDraw.pause(100);
      // checks if game is over 
      gameOver =  gameOver(boxes);
       COUNT++;
     System.out.println("Count" + COUNT );
      //if counter = 9 and nobody has won, game is a tie. 
      if ( COUNT == 9 ) { gameOver = true; }
    }
    // if game is over, Draw the End screen
    winnerScreen(COUNT, boxes);
  }
  /** Draws the board with the given char array */
  public static void drawBoard (char[][] boxes){
    
    StdDraw.clear();
    StdDraw.setScale(0,3);
    StdDraw.setPenRadius ( .025);
    if ( playerOneTurn ) {       StdDraw.setPenColor( StdDraw.BLUE); }
    else {       StdDraw.setPenColor( StdDraw.RED); }
    if ( firstBoard == 1) {  StdDraw.setPenColor( StdDraw.RED); }
    StdDraw.line ( 1,0, 1, 3);
    StdDraw.line ( 2,0, 2, 3);
    StdDraw.line (0,1,3,1);
    StdDraw.line ( 0,2,3,2);
    
         // StdDraw.setPenColor( StdDraw.BLACK);
        
    double xPos = 0.5;
    double yPos = 0.5;
    for ( int i = 0; i < 3; i++ ){
      for ( int j = 0; j < 3; j++ ){
        if ( boxes[i][j] == 'X') { StdDraw.setPenColor(StdDraw.RED); }
        if ( boxes[i][j] == 'O') { StdDraw.setPenColor(StdDraw.BLUE); }
        StdDraw.text( xPos, yPos, "" + boxes[i][j] );
                 xPos++;
              }
      xPos = .5;
      yPos++;
      
}
  }
    

  /** checks what box the player clicked */
  public static int squareClicked ( char[][] boxes){

    while ( true){
      if (StdDraw.isMousePressed()) {
        int x = (int)StdDraw.mouseX();
        int y = (int)StdDraw.mouseY();
        
        if ( y == 1){ System.out.println(" Box Clicked:" +( 3+ x));return ( 3+ x); }
          else if ( y == 2) { System.out.println(" Box Clicked:" + ( 6 + x));  return ( 6 + x);  }
          else if (y == 0)  { System.out.println(" Box Clicked:" + ( x));return x ; }
          else { return -1; }

        }
                        StdDraw.pause(90);
        
      }
      
      
    }
  /** updates thec hat array based on what box is clicked and who's turn it is */
  public static char[][] changeArray ( int boxClicked, char[][] boxes ){
    
    int row;
    if ( boxClicked > 2 && boxClicked < 6 ){ row = 1;}
    else if (boxClicked > 5 ) { row = 2; }
    else { row = 0; }
    int column = boxClicked % 3;
    
    if ( isAvailable ( row , column, boxes ) ){
    
    if ( playerOneTurn ) { boxes[row][column]  = 'X' ;}
    else { boxes[row][column]  = 'O'; }

    }
    else {   COUNT--; playerOneTurn= !playerOneTurn;  System.out.println( " INVALID CLICK " ); }
    
    return boxes;
    
  }
  /** checks if there is a given location in the char array is already occupies */
       public static boolean isAvailable(int row, int column, char[][] boxes){
     
         if ( boxes[row][column] == 'X' ||  boxes[row][column]  == 'O' ) { return false; }
           else  return true; 
     
     }
       
       
       /** draws the Winner/ Tie screen */
     public static boolean gameOver(char[][] boxes){
       
       boolean gameover = false;
       for ( int i = 0; i < 3 ; i++){
         if ( boxes[i][0] == 'X' && boxes[i][1] == 'X' && boxes[i][2] == 'X') { gameOver = true; }
         if ( boxes[0][i] == 'X' && boxes[1][i] == 'X' && boxes[2][i] == 'X') { gameOver = true; }
       }
     if (boxes[2][0]  == 'X' && boxes[1][1] == 'X' && boxes[0][2] == 'X') { gameOver = true; }
     if (boxes[2][2]  == 'X' && boxes[1][1] == 'X' && boxes[0][0] == 'X') { gameOver = true; }
            return gameOver;
       }

     public static void winnerScreen (int count, char[][] boxes){
       
       StdDraw.clear();
       String Winner = "Player One";
       StdDraw.setPenRadius(12);
       StdDraw.setPenColor ( StdDraw.BLACK );
         StdDraw.line( 1,1,2,2);
              StdDraw.setPenColor ( StdDraw. WHITE) ;
       if ( count == 9) {  Winner = "Cat's Game. Nobody"; }
       
        else if (playerOneTurn) {Winner = " Player Two"; }
         
        //Font font = new Font("Arial", Font.BOLD, 60);
       // StdDraw.setFont( font);


       StdDraw.text ( 1.5,2, Winner + " Wins" );
       StdDraw.text ( 1.5,0.5,  " Click Screen to see board" );
       while ( true ){
         
         if ( StdDraw.isMousePressed() ) {       drawBoard(boxes); }
     }
     }
     }
    