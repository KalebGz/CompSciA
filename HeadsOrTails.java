public class HeadsOrTails{
  public static void main(String[] args){
    
    double value = Math.random();
    if (value < 0.5){
      // art courtesy of http://www.chris.com/ascii/index.php?art=objects/money with minor changes
      System.out.println("                            ");
      System.out.println("               .nnnnn.        ");
      System.out.println("      L       / `-    )      Y ");
      System.out.println("    ;        />  `.  -.|        ;");
      System.out.println("    |       /_     '-.__)       |");
      System.out.println("    |        |-  _.'  ) |        |");
      System.out.println("    ;        `~~;     \\        ;");
      System.out.println("     ;  INGODWE /      \\)P    ;");
      System.out.println("      ^  TRUST '.___.-'`     ");
      System.out.println("       `                   /`");
      System.out.println("         '._   1 9 9 7   _.'");
      
    }else {
      System.out.println("Tails :<" );  
    }
    
  }
}

