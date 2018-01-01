/*Purpose: Takes 2 values as input and checks iif they are the same
 * 
 * Date: Oct 4, 2017
 */
import java.util.Scanner; // See “Import Statements” below
public class BirthdaySing {
 public static void main(String[] args) {
 System.out.print("Please enter your name: ");
 Scanner input = new Scanner(System.in); // See “Scanners” below
 // Creates a new Scanner named input which reads from the System input.
 // (System.in usually refers to the keyboard.)
 String name = input.next();
 System.out.println("happy birthday!"  +  name);
 System.out.print("Please enter your age: ");
 int age = input.nextInt();
 System.out.println("happy birthday to " + name + " ,Happy birthday to you ," + "happy birthday to " + name + " ,Happy birthday to you ," + " you are now " + age);
  System.out.println("You have been alive for "  +  age * 365 + " days! ");
 

 }
}
