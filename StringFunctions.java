public class StringFunctions{
  public static String substitute (String original, String find, String replace){
 
    int replaceVal = original.indexOf(find);
    if ( replaceVal < 0 ) { return " String was not found"; }
    String beg= original.substring ( 0, replaceVal);
    String replaced = replace;
    String end = original.substring ( replaceVal + find.length(), original.length() );
   
    return beg + replaced + end;

   
  }
  /** replaces all given strings */
  public static String substituteAll ( String original, String find, String replace ) {
    
        String  res = "";
    
        
    for ( int i = 0; i <=  (original.length()-find.length() +1); i++) {
      
      String check = original.substring( i, i + find.length());
      if ( !(check.equals(find) ) ) { res+= original.substring(i,i+1); }
          else{  res += replace; i += find.length() -1;}
      
  }
   /* if ( !(original.substring( original.length() - find.length() +1, original.length()).equals(find) )) {
          res += original.substring( original.length() - find.length() , original.length());
    }
    */
    return res;
   
  }
}
    
  