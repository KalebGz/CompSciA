public class LargestPalindrome {
  public static void main (String[] args){
    
  }
  // test if local var can have same name as paramater
  public static boolean isPalindrome(int val){
   String numStr = ""+ val;
   String begin = numStr.substring(0,numStr.length()/2);
   
   String end = "";
   for(int i = numStr.length-1; i > numStr.length()/2; i++){
     end+= numStr.charAt(i);
     return false;
  }
}