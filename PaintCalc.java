public class PaintCalc {
  public static void main(String[] args) {
    
    double SQUARE_F = 350;
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int height = Integer.parseInt(args[2]);
    double surfaceA = ( (length * width) + (2 * length * height) + (2 * width * height) );  
    System.out.println("Length = " + length);   
    System.out.println("Width = " + width);  
    System.out.println("Height = " + height);
    System.out.println("Height = " + height);
    System.out.println("Square Footage to be painted(Surface Area) = " + surfaceA);
    
    int cans =  (int) Math.ceil(  surfaceA / SQUARE_F);

    System.out.println("cans Needed " + cans);
   // cans = Math.ceil(cans);
    // System.out.println("Cans needed " + (cans));
    
    
    
    //1. declare a constant and set it to 350 representing the square footage 
    //   that one can of paint can cover.
    
    //2. declare the variables you will need to solve the problem
    
    //3. Prompt the user for the length, width, and height of the room.
    //   and store their answers in the variables you declared.
    
    //4. Compute the total square feet to be painted--think
    //   about the dimensions of each wall
    
    //5. Compute the amount of paint needed. Use your constant
    
    //6. Print the length, width, and height of the room, the
    //   square footage to paint, and number of gallons of paint needed. 
  }
}

/*
 SAMPLE OUTPUT
 What is the length of the room you want to paint in feet?
 10
 What is the width of the room you want to paint in feet?
 12
 What is the height of the room you want to paint in feet?
 8
 
 Length of Room: 10 feet
 Width of Room: 12 feet
 Height of Room: 8 feet
 Square Footage to be Painted: 352 Sq. Feet
 Number of Paint Cans Needed: 2 cans
 */