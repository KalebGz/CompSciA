public class Random{
  public static void main(String[] args){
    String phrase=args[0];
    int num=Integer.parseInt(args[1]);
    while (num>0){
      System.out.println(phrase);
      num-=1;
    }
  }
}
    