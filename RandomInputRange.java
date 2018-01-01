import java.util.Scanner;
  
public class RandomInputRange{
  public static void main(String[] args){
    
    Scanner rg = new Scanner (System.in);
    int range = rg.nextInt();

    System.out.println("Number From 1-" + range +": " + (int)(Math.random()*range));

  }
}
