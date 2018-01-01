public class AddTill13{
public static void main ( String[] args) {
  int sum = 0;
  for ( int i = 0; i< args.length; i++) {
    String s = args[i];
    if ( s.charAt(0) == '-'){continue;}
    int n = Integer.parseInt(s);
    if(n == 13) { break; }
    sum+=n;
  }
  System.out.println(sum);
}
}