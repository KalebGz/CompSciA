public class LargestPrimeFactor{
  public static void main( String args[]){
    
    Long num = Long.parseLong(args[0]);
    
    for (Long i = num/2 ; i < num; i++){
      int factorCount  = 0;
      if ( num % i == 0){
        for ( int j = 1 ; j <= i ; j++){
          if ( i % j == 0 ){ factorCount++; }
        }
        // checks if the factor is prime
        if ( factorCount == 2){ System.out.println( " Largest Prime factor " + i ); break;}
      }
  }
}
}
