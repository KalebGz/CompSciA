public class ArrayUtils{
  /** prints contents of vals in one line; [1,3,8] */
  public static void print(int[] vals){
    
    System.out.print("[");
    for (int i = 0; i < vals.length; i++){
      System.out.print(vals[i] );
      if ( i < vals.length-1){System.out.print( ", ");}
    }
    System.out.print("]");
    System.out.println();
  }
  
  
  /** prints out the values inside an array in a new line for each*/
  public static void printOne(int[] vals){
    
    System.out.print("[");
    for (int i = 0; i < vals.length; i++){
      System.out.println(vals[i] );
      if ( i < vals.length ){System.out.print( " ");}
    }
    System.out.print("]");
    System.out.println();
  }
  
  
  
  /** prints out a random array of a given length*/
  public static int[] randomVal(int range, int min , int max){
    int[] randomArray = new int[range];
    
    for (int i = 0; i < range-1; i++){
      randomArray[i] = (int)(Math.random() * max) + min;
    }
    return randomArray;
  }
  
  
  
  /** prints the lowest value in an array*/
  public static void arrayMin(int[] nums){
    int min = nums[0];
    for ( int i = 0; i < nums.length; i++){
      if ( nums[i] < min){ min = nums[i]; }
      
    }
    System.out.println( min);  
  }
  /** prints the highest value in an array*/
  public static int arrayMax(int[] nums){
    int max = nums[0];
    for ( int i = 0; i < nums.length; i++){
      if ( nums[i] > max){ max = nums[i];}
    }
    // System.out.println( max);
    return max;
    
    
    
    
  }
  /** prints the average if the values in an array*/
  public static void arrayAverage( int[] nums){
    int sum = 0;
    for ( int i = 0 ; i < nums.length; i++){
      sum+= nums[i];
    }
    int average = sum/ nums.length;
    System.out.println(average);
    
  }
  
  
  
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
  public static double[] randomVal(int range, double min, double max){
    double[] randomArray = new double[range];
    
    for (int i = 0; i < range; i++){
      randomArray[i] = (Math.random() * max )+min;
    }
    ArrayUtilsDouble.print((randomArray));
    return  randomArray;
  }
  
  
  
  /** prints the lowest value in an array*/
  public static double arrayMin(double[] nums){
    double min = nums[0];
    for ( int i = 0; i < nums.length; i++){
      if ( nums[i] < min){ min = nums[i]; }
      
    }
    return min;
  }
  /** prints the highest value in an array*/
  public static double arrayMax(double[] nums){
    double max = nums[0];
    for ( int i = 0; i < nums.length; i++){
      if ( nums[i] > max){ max = nums[i];}
    }
    
    return max;
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
  
  
  
  /** parses given String 
    public static int parse(String[] nums){
    int[] values = new int[nums.length];
    for ( int i =0; i < nums.length; i++){
    values[i] = Integer.parseInt(nums[i]);
    }
    return int[] values;
    }
    */
  
  /** creates a Histogram of the values given in an array*/
  
  
  
  
  /** draws a bar graph of all values in a double array */
  public static void histogram(double[] nums) {
    
    // sets the x length from -1( for the scale) to the number of values in the array
    StdDraw.setXscale(-1 , nums.length);
    // sets the y value from -1( for the scale) to the largest value in the array
    StdDraw.setYscale(-1 , arrayMax(nums)+ (arrayMax(nums)/(nums.length)));
    
    // Draws the bars
    for(int i = 0; i < nums.length; i++) { 
      StdDraw.filledRectangle(0.5 + i, nums[i] , 0.5, Math.abs(nums[i] / 2));
    }
    // X axis scale
    for(int i = 0; i < nums.length; i++) { 
      StdDraw.text(0.5 + i, -0.5, i + "");
    }
    // Y axis scale
    for(int i = 0; i < arrayMax(nums) + 2; i++) { 
      StdDraw.text(-0.5, i + 1, i+1   + "");
    }
    
  }
  /** draws the X axis */
  public static  void xAxis(double[] nums){
    for(int i = (int)arrayMin(nums)-1; i < nums.length+1; i++) { 
      StdDraw.text(-0.5 + i, -0.5, i + "");
    }
  }
  /** draws the Y axis */
  public static  void yAxis(double[] nums){
    // Y axis scale
    for(int i =(int) arrayMin(nums)-1; i < arrayMax(nums) +1 ; i++) { 
      StdDraw.text(-0.5, i + 0.25, i+1   + "");
    }
  }
  
  
  
  /** draws a scatter plot for given x and y coordinates. */
  public static void scatterPlot(double[] x, double[] y){
    
    
    // sets the x length from the smallest value in array X( for the scale) to the number of values in the array
    StdDraw.setXscale(arrayMin(x) -1 , x.length);
    // sets the y value from the samllest value in array Y( for the scale) to the largest value in the array
    StdDraw.setYscale(arrayMin(y)-1 , arrayMax(y)+ (arrayMax(y)/(y.length)));
    
    // draws the Y axis based on the given array  x
    xAxis(x);
    // draws the Y axis based on the given array  x
    yAxis(y);
    
    // sets the pen radius to 1/ the range of y values
    double penRadius = 1/((arrayMax(y) - arrayMin(y)) *2);
    StdDraw.setPenRadius(penRadius);
    // draws a point at (x[i],y[i])
    for ( int i = 0; i < x.length; i++){
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.point( x[i]-0.5, y[i]-0.75);
    }
  }
  
  
  /** sorts given array */
  
  public static void lineSort(double[] nums){
    
    
  } 
  /** connects consecutive points by line segments. */
  public static void linePlot(double[] x, double[] y){
    
    // draws the sactter plot with given arrays x and y
    scatterPlot(x,y);
    // sets pen radius to half of the points pen radius
    StdDraw.setPenRadius(1/((arrayMax(y) - arrayMin(y)) *4) );
    for ( int i = 0; i < x.length -1 ; i++){
      //line(double x1, double y1, double x2, double y2)
      // draws line from the values at from one point to another
      StdDraw.line(x[i]-.5, y[i]-1, x[i+1]-.5, y[i+1]-1);
    }
    
  }
  
  /** swaps elements at idxA and idxB */
  public static void swap ( int[] vals, int idxA, int idxB){
    
    int temp = vals[idxA];
    vals[idxA] = vals[idxB];
    vals[idxB] = temp;
    //return vals[idxA]; //return vals[idxB];
  }
  
  /* returns true if array contains any dupilicate values*/
  public static boolean hasDups(int vals[]){
    boolean hasDup = false;
    for ( int i = 0; i < vals.length; i++){
      for ( int j = i; i < vals.length; j++){
        if ( vals[i] == vals[j]) { hasDup = true;}
        
      }
    }
    return hasDup;
  }
  /* reverse the order of elements in an array */
  public static void reverse ( int vals[]){
    
    for ( int i = 0; i < vals.length/2; i++){
      swap(vals, i, vals.length-1-i);  
    }
    
  }
  
  /* shuffles the elements in an array */
  public static void shuffle(int[] vals){
    
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}















