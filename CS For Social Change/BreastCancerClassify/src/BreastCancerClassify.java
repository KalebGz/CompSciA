import java.util.Scanner;

/**
 * Project One: Breast Cancer Classification
 * GROUP MEMBER NAMES:
 *  1)
 *  2)
 *  3) 
 * 
 * BreastCancerClassify contains the core implementation of the 
 * kNearestNeighbors algorithm to classify cell clumps as malignant
 * or benign. 
 * 
 * Work on the functions in the following order:
 *  1) calculateDistance
 *  2) getAllDistances
 *  3) findKClosestEntries
 *  4) classify
 *  5) kNearestNeighbors (use your helpers correctly!)
 *  
 * Note: testing your code is really important! That's why we've included some
 * test cases. After writing each method, run the corresponding test to see 
 * whether you got it right! From here, you'll have to work on some debugging to 
 * iron out your code. 
 */
public class BreastCancerClassify {
  
  static int K = 5;
  static int CLASSIFICATION_INDEX = 10;
  static int BENIGN = 2;
  static int MALIGNANT = 4;
  
  /**
   * calculateDistance computes the distance between the two data
   * parameters. The distance is found by taking the difference in each 
   * "coordinate", squaring it, adding all of those, and then taking the 
   * square root of the result. 
   * 
   * Remember to exclude the first index (the element ID), and the last
   * index (the classification). 
   * 
   * For example: 
   * [12345, 6, 4, 4, MALIGNANT]
   * [22344, 2, 8, 3, BENIGN]
   * 
   * distance = sqrt((6-2)^2 + (4-8)^2 + (4-3)^2)
   */
  public static double calculateDistance(int[] first, int[] second)
  {
    int val = 0;
    for(int i =  1; i < first.length-1; i++){
      val+= Math.pow(first[i] - second[i],2);
    }
    return Math.sqrt(val);
  }
  
  /**
   * getAllDistances creates an array of doubles with the distances
   * to each training instance. The double[] returned should have the 
   * same number of instances as trainData. 
   */
  public static double[] getAllDistances(int[][] trainData, int[] testInstance)
  {
    double[] allDistances = new double[trainData.length]; //Change the initialization!
    
    for(int i = 0; i  <trainData.length; i++){
      allDistances[i]= calculateDistance(trainData[i], testInstance);
    }
    return allDistances;
  }
  
  /**
   * findKClosestEntries finds and returns the indexes of the 
   * K closest distances in allDistances. Return an array of size K, 
   * that is filled with the indexes of the closest distances (not
   * the distances themselves). 
   * 
   * This function can be tricky! You should try and think of different ways
   * you might implement it. Here's one such way:
   *   1) Iterate through the list to find the minimum element. Keep track of its index. 
   *   2) Repeat this to find the next smallest element that hasn't already been saved
   *      in kClosestIndexes. 
   *   3) Do this until you've found the K closest indexes 
   *   
   * It might be useful to have helper variables to keep track of the minimum you've seen 
   * so far in one loop, and a helper variable to keep track of the Kth smallest distance 
   * that you've seen. 
   * 
   * One tricky edge cases to keep in mind are when two elements have the same distance 
   * (you can pick either!). Note that the solution described above isn't the most efficient one. 
   * Impress me even more by coming up with something better, and say why it's faster!
   */
  public static int[] findKClosestEntries(double[] allDistances)
  {
    int[] kClosestIndexes = new int[K];
    double[] distances = new double[allDistances.length];
      System.arraycopy(allDistances, 0, distances, 0,allDistances.length);
    int minIdx = 0;
    int idxAdd = 0;
    double min  = allDistances[0];
    
    for(int j = 0; j < 5; j++){
      for(int i =0; i < allDistances.length; i++){
        if (distances[i] <= min) { min = distances[i]; minIdx = i; distances[i] = 10000; }
      }
      kClosestIndexes[idxAdd] = minIdx;
      idxAdd++;
    }
    return kClosestIndexes;
  }
  
  /**
   * classify makes a decision as to whether an instance of testing 
   * data is BENIGN or MALIGNANT. The function makes this decision based
   * on the K closest train data instances (whose indexes are stored in 
   * kClosestIndexes). If more than half of the closest instances are 
   * malignant, classify the growth as malignant. 
   * 
   * To do this, given the k Closest Indexes, find their corresponding data
   * points in trainData, and keep track of how many are BENIGN and how many
   * are MALIGNANT. Based on whether more are BENIGN or MALIGNANT, return the 
   * corresponding global integer constant (BENIGN or MALIGNANT). In the 
   * case of a tie, you can choose however you'd like. (Impress me by 
   * dealing with ties in a nicer way!)  
   * 
   * Return one of the global integer constants defined in this function. 
   */
  public static int classify(int[][] trainData, int[] kClosestIndexes)
  {
//    int bCount = 0;
    double mCount = 0.0;
    for(int i = 0; i < kClosestIndexes.length; i++){
      if(trainData[kClosestIndexes[i]][trainData[kClosestIndexes[i]].length-1] == MALIGNANT){ mCount++;}
    }
    if( (mCount/kClosestIndexes.length) > .5){ return MALIGNANT;}
    return BENIGN;
  }
  
  /**
   * kNearestNeighbors classifies all the data instances in testData as 
   * BENIGN or MALIGNANT using the helper functions you wrote and the kNN 
   * algorithm. 
   * 
   * For each instance of your test data, use your helpers to find the 
   * K closest points, and classify your result based on that!
   * 
   * @param trainData: all training instances
   * @param testData: all testing instances
   * @return: int array of classifications (BENIGN or MALIGNANT)
   */
  public static int[] kNearestNeighbors(int[][] trainData, int[][] testData){
    
    int[] myResults = new int[testData.length]; //Change this initialization to the right size!
    for(int i = 0; i < testData.length; i++){
      double[] distances = getAllDistances(trainData, testData[i]);
      int[] closestPoints = findKClosestEntries(distances);
      myResults[i] = classify(trainData, closestPoints);
    }

    return myResults;
  }
  
  
  public static void main(String[] args) {
    int[][] trainData = InputHandler.populateData("train_data.csv");
    int[][] testData = InputHandler.populateData("test_data.csv");
    
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("What function would you like to test?");
      System.out.println("Enter the number to test that function, or 'q' to quit");
      System.out.println("1) calculateDistance");
      System.out.println("2) getAllDistances");
      System.out.println("3) run Grapher to plot all pairwise distances");
      System.out.println("4) findKClosestEntries");
      System.out.println("5) classify");
      System.out.println("6) kNearestNeighbors");
      System.out.print(">> ");
      
      String line = sc.nextLine();
      System.out.println("");
      switch(line) {
        case "q": 
          return;
        case "1":
          Tester.calculateDistance();
          break;
        case "2":
          Tester.getAllDistances();
          break;
        case "3":
          //Display the distances between instances of the train data. 
          //Points in the upper left corner (both benign) or in the bottom
          //right (both malignant) should be darker. 
          Grapher.createGraph(trainData);
          break;
        case "4":
          Tester.findKClosestEntries();
          break;
        case "5":
          Tester.classify();
          break;
        case "6":
          int[] myResults = kNearestNeighbors(trainData, testData);
          double acc = InputHandler.printAccuracy(myResults, testData);
          if(Math.abs(acc - 94.37) > 0.1) {
            System.out.println("Expected accuracy: 94.37%");
          } else {
            System.out.println("Congratulations, you've implemented KNN correctly!");
          }
          System.out.println("------------------------------------------------------");
          System.out.println("");
          
          break;     
        default:
          System.out.println("Invalid input.");
          break;
      }
    }
  }
  
}
