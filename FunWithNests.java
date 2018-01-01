public class FunWithNests {
  public static void main (String[] args){
    int count = 0;
    for ( byte a = 0; a < 3; a++){
      for ( byte b= 0; b < 3; b++){
        for ( byte c = 0; c< 3; c++){
          System.out.println("A: " + a + " B: " + b + " C: " + c + "count:" + count);
          count++;
        }
      }
    }
  }
}