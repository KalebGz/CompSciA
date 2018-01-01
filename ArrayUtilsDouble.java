public class ArrayUtilsDouble{
  /** prints contents of vals in one line; [1,3,8] */
  public static void print(double[] vals){
    
    System.out.print("[");
    for (int i = 0; i < vals.length; i++){
      System.out.print(vals[i] );
      if ( i < vals.length-1){System.out.print( ", ");}
    }
    System.out.print("]");
    System.out.println();
  }
  /** prints out the values inside an array in a new line for each*/
  public static void printOne(double[] vals){
    
    System.out.print("[");
    for (int i = 0; i < vals.length; i++){
      System.out.println(vals[i] );
      if ( i < vals.length ){System.out.print( " ");}
    }
    System.out.print("]");
    System.out.println();
  }
  
    /** prints out a random array of a given length*/
  public static void randomVal(int range){
    double[] randomArray = new double[range];
    
    for (int i = 0; i < range-1; i++){
      randomArray[i] = (Math.random() * 6);
    }
    ArrayUtilsDouble.print((randomArray));
  }
  
  /** prints the lowest value in an array*/
public static void arrayMin(double[] nums){
  double min = nums[0];
  for ( int i = 0; i < nums.length; i++){
    if ( nums[i] < min){ min = nums[i]; }

}
    System.out.println( min);  
}
  /** prints the highest value in an array*/
public static void arrayMax(double[] nums){
  double max = nums[0];
  for ( int i = 0; i < nums.length; i++){
    if ( nums[i] > max){ max = nums[i];}
  }
  System.out.println( max);
  
}
  /** prints the average if the values in an array*/
public static void arrayAverage( double[] nums){
  double sum = 0;
    for ( int i = 0 ; i < nums.length; i++){
    sum+= nums[i];
  }
double average = sum/ nums.length;
System.out.println(average);
}
}
