/*Purpose: Takes 2 values as input and checks iif they are the same
 * 
 * Date: Oct 4, 2017
 */
import java.util.Scanner; // See “Import Statements” below
public class BirthdaySing {
 public static void main(String[] args) {
 System.out.print("Please enter Your name: ");
 Scanner input = new Scanner(System.in); // See “Scanners” below
 // Creates a new Scanner named input which reads from the System input.
 // (System.in usually refers to the keyboard.)
 String name = input.next();
 System.out.println("happy  " + num1 + " birthday!");
 System.out.print("Please enter your age: ");
 int num2 = input.nextInt();
 System.out.println("That number is almost as good!");
 
 if (num1 == num2){
   
   System.out.println("Both Numbers are equal");
 }
 }
}
