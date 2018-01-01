public class Add2DArray {
  public static void main ( String[] args){
    
    
    double [][] a = {{ 1 , 2 ,3 }, {2,3,4} , {4,5,7}};
    double [][] b = {{ 1 , 2 ,3 }, {2,3,4} , {4,5,7}};  
    double [][] c = add( a , b);
  //  System.out.println(java.util.Arrays.toInt[][](c));
  }
    public static double [][] add( double[][] a, double [][] b){
      final int N = a.length;
      double [][] c = new double [N][N];
      for ( int row = 0; row < N; row++) {
        for ( int col = 0; col < N; col++){
          
          c[row][col] = a [row][col] + b [row][col];
        }
      }
    
    return c;
  }
}