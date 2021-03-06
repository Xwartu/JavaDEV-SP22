//  Lab 3
//
//  Released:  9/8/2021
//
//  @Author  Kumar Saurabh (ksaurabh)
//  Last Edited: 1/26/2022
//
//
//  Directions: The given file is not according to java coding guidelines
//              and may have compilation errors to be fixed. 
//              Tasks to be performed:
//              1. Edit the file to make it according to java coding guidelines 
//              and fix the errors if any.
//              2. Include comments to indicate the changes made to the file 
//              to make it according to coding conventions or fix issues.
//
//////////////////////////////////////////////////////////////////////////////

/*

Note: The file is a standalone java file, meaning you can run this file directly without having to set up the other 2 files.

About the java file: The current Program computes Area of different shapes based on user input.

User Input: 
1. choice: User should enter either 1 or 2 depending on which shape the user wants to compute area for.
2. base, height for triangle and radius for circle: The lengths of shapes for which areas must be computed.

Expected Program Output:
The correct result for this program

Eg: 

Find area of 
1 . Triangle 
2 . Circle 
Select a choice : 1
Enter the length of base : 
2
Enter the length of height : 
2
Area of triangle with length of sides 2 and 2 is : 2
*/
import java.io.*;
import java.util.Scanner;

class DebugProgramTwo {
   public void findarea(int a, int b)
   {
      int area = ((a * b)/2);
      System.out.println("\n Area of triangle with length of sides " + a + " and " + b + " is : " + area);
   }

   public void findarea(int a)
   {
      System.out.println("\n Area of circle with  radius " + a + " is :" + 3.14 * a);
   }

   public static void main(String p[]) throws IOException {
      DebugProgramTwo d = new DebugProgramTwo();
      Scanner keyBoard = new Scanner(System.in);
      System.out.print("\n Find area of \n 1 . Triangle \n 2 . Circle \n\nSelect a choice : ");
      int choice = keyBoard.nextInt();

      if (choice == 1)
      {
         System.out.print("\n Enter the length of base : ");
         int x = keyBoard.nextInt();
         System.out.print("\n Enter the length of height : ");
         int y = keyBoard.nextInt();
         d.findarea(x, y);

      } else if (choice == 2) {
         System.out.print("\n Enter the radius : ");
         int r = keyBoard.nextInt();
         d.findarea(r);
      } else
      {

         System.out.println("Invalid choice");
      }

   }
}
