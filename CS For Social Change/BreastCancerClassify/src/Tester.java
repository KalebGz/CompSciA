import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tester {
	
	// Test data 
	private static int[][] points = {{1000025,5,1,1,1,2,1,3,1,1,2}, 
		{1002945,5,4,4,5,7,10,3,2,1,2},
		{1017122,8,10,10,8,7,10,9,7,1,4}};
	
	private static int[][] pointsForClassify = {{1000025,5,1,1,1,2,1,3,1,1,2}, 
			{1002945,5,4,4,5,7,10,3,2,1,2},
			{1017122,8,10,10,8,7,10,9,7,1,4},
			{1017122,8,10,10,8,7,10,9,7,1,4},
			{1017122,8,10,6,8,7,10,9,7,1,2},
			{1017122,8,5,10,8,7,10,9,7,1,4},
			{1017122,8,10,10,8,7,10,3,7,1,4},
			{1017122,8,10,10,8,7,5,9,7,1,4},
			{1017122,8,10,10,8,7,10,9,7,1,2},
			{1017122,8,10,10,8,7,10,9,7,1,4}};
	
	private static double[] calcDistOutputs = {11.874342087037917, 19.949937343260004, 12.288205727444508};
	
	//Test data for findKClosestEntries
	private static double[][] distances = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			{10, 1, 8, 3, 6, 5, 4, 7, 2, 9},
			{10, 2, 2, 7, 3, 6, 3, 1, 7, 10}};
	private static int[][] kClosestOutputs = {{0, 1, 2, 3, 4},
			{1, 3, 5, 6, 8},
			{1, 2, 4, 6, 7}};
	
	private static double THRESHOLD = 0.001;
	
	private static void passed(int testNum) {
		System.out.printf("Test %d passed!\n", testNum);
	}
	
	private static void error(int testNum, String testCase, String expectedOut, String actualOut) {
		System.out.printf("Test %d failed\n", testNum);
		System.out.printf("Test case: %s\n", testCase);
		System.out.printf("Expected output: %s\n", expectedOut);
		System.out.printf("Actual output: %s\n", actualOut);
	}
	
	private static void calcDistTest(int[] pt1, int[] pt2, int testNum) {
		double actualOut = BreastCancerClassify.calculateDistance(pt1, pt2);
		if(Math.abs(actualOut - calcDistOutputs[testNum-1]) < THRESHOLD) {
			passed(testNum);
		}
		else {
			String testCase = String.format("Point 1: %s\nPoint 2: %s", 
					Arrays.toString(pt1), Arrays.toString(pt2));
			error(testNum, testCase, String.valueOf(calcDistOutputs[testNum - 1]), String.valueOf(actualOut));
		}
		
	}
	
	public static void calculateDistance() {
		System.out.println("======================================================");
		System.out.println("Testing calculateDistance");
		System.out.println("======================================================");
		
		calcDistTest(points[0], points[1], 1);		
		System.out.println("------------------------------------------------------");
		calcDistTest(points[0], points[2], 2);
		System.out.println("------------------------------------------------------");
		calcDistTest(points[1], points[2], 3);
		System.out.println("------------------------------------------------------");
		System.out.println("");
	}
	
	private static void getAllDistTest(int[][] pts, int[] testpt, int testNum) {
		double[] actualOut = BreastCancerClassify.getAllDistances(pts, testpt);
		if(actualOut.length == 3 && Math.abs(actualOut[0] - 0) < THRESHOLD && 
				Math.abs(actualOut[1] - calcDistOutputs[0]) < THRESHOLD && 
				Math.abs(actualOut[2] - calcDistOutputs[1]) < THRESHOLD ) {
			passed(testNum);
		}
		else {
			String testCase = String.format("All points from test case 1");
			String expected_out = String.format("[%g, %g, %g]", 0.0, calcDistOutputs[0], calcDistOutputs[1]);
			String actual_out = String.format("[%g, %g, %g]", actualOut[0], actualOut[1], actualOut[2]);
			if(actualOut.length != 3) {
				actual_out = String.format("Length of output is %d", actualOut.length);
			}
			
			error(testNum, testCase, expected_out, actual_out);
		}
		
	}

	
	public static void getAllDistances() {
		System.out.println("======================================================");
		System.out.println("Testing getAllDistances");
		System.out.println("======================================================");
		
		getAllDistTest(points, points[0], 1);		
		System.out.println("------------------------------------------------------");
		System.out.println("");
	}

	
	private static boolean contains(int[] arr, int val) {
		for(int i: arr) {
			if (i == val) {
				return true;
			}
		}
		return false;
	}
	
	private static void kClosestTest(double[] dist, int testNum) {
		int[] actualOut = BreastCancerClassify.findKClosestEntries(dist);
		boolean passed = true;
		for(int item: actualOut) {
			if(!contains(kClosestOutputs[testNum-1],item)) {
				passed = false;
			}
		}
		if (actualOut.length != kClosestOutputs[testNum-1].length) {
			passed = false;
		}
		
		if(passed) {
			passed(testNum);
		}

		else {
			String testCase = String.format("Distances: %s", 
					Arrays.toString(dist));
			String expectedOut = String.format("Any ordering of %s", 
					Arrays.toString(kClosestOutputs[testNum-1]));
			error(testNum, testCase, expectedOut, Arrays.toString(actualOut));
		}
		
	}
	
	public static void findKClosestEntries() {
		System.out.println("======================================================");
		System.out.println("Testing KClosestEntries");
		System.out.println("======================================================");
		
		kClosestTest(distances[0], 1);		
		System.out.println("------------------------------------------------------");
		kClosestTest(distances[1], 2);		
		System.out.println("------------------------------------------------------");
		kClosestTest(distances[2], 3);		
		System.out.println("------------------------------------------------------");
		System.out.println("");
	}
	
	private static void classifyTest(int[][] pts, int[] kclosest, int testNum) {
		int actualOut = BreastCancerClassify.classify(pts, kclosest);
		if(actualOut == 4) {
			passed(testNum);
		}
		else {
			String testCase = String.format("See Tester.java for list of 10 points and kclosest indexes");			
			error(testNum, testCase, "4 (MALIGNANT)", String.valueOf(actualOut));
		}
		
	}

	public static void classify() {
		System.out.println("======================================================");
		System.out.println("Testing classify");
		System.out.println("======================================================");
		
		int[] kclosest = {9, 8, 6, 7, 1}; // Ordering of kclosest for fake data point
		classifyTest(pointsForClassify, kclosest, 1);		
		System.out.println("------------------------------------------------------");
		System.out.println("");
	}

}
