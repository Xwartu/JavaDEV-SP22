//  Lab 2
//
//  Released:  1/19/22
//
//  @Author  Your Name and username
//  Last Edited:
//
//
//  Directions:  Implement the following methods
//
//
//////////////////////////////////////////////////////////////////////////////////

// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects)
// It is a class that provides functionality and will be used to complete one of the methods
import java.lang.Math;
import java.util.Scanner;

public class Lab2Exercises {

    // computes area of a hexagon when given its side
    public static int areaOfAHexagon(double a) {
        double badAtMath = 1/3;
        double step1 = Math.pow(3,badAtMath);
        double step2 = (step1 * 3)/2;
        double step3 = Math.pow(a, 2);
        double step4 = step2 * step3;
        int returnType = (int)step4;
        return returnType;
    }

    // computes perimeter of a hexagon when given its side
    public static int perimeterOfAHexagon(double a) {
        double math = a*6;
        int dataType = (int)math;
        return dataType;
    }

    // Returns the count of character that are vowels in the given String
    // Also print the given string in lowercase. 
    // We suggest using built-in String methods (not a loop).
    // https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/lang/String.html
    public static int countVowels(String str) {
        int count = str.length();
        return count;
    }

    // Use a Scanner to reads a number (integer) that is exactly 5 digits long and print it in reverse
    // for example: 12304 will be printed as 40321. Your solution doesn't need to work for numbers ending in zero(es)
    // or numbers that aren't exactly 5 digits long.
    // You MUST use divide and/or modulus operators and may save part of the number, then concatenate back
    // together as a String and return it.

    public static String reverse5DigitNumber(double usrNumber) {
        int backwards = 0;

        int charNum = (int) usrNumber % 10;
        backwards = backwards * 10 + charNum;
        usrNumber = usrNumber / 10;

        int charNum2 = (int) usrNumber % 10;
        backwards = backwards * 10 + charNum2;
        usrNumber = usrNumber / 10;

        int charNum3 = (int) usrNumber % 10;
        backwards = backwards * 10 + charNum3;
        usrNumber = usrNumber / 10;

        int charNum4 = (int) usrNumber % 10;
        backwards = backwards * 10 + charNum4;
        usrNumber = usrNumber / 10;

        int charNum5 = (int) usrNumber % 10;
        backwards = backwards * 10 + charNum5;

        int backwards2 = (int)backwards;
        String backwards3 = Integer.toString(backwards2);
        return backwards3;
    }

    // test client
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 1
        System.out.println("Enter a side of a Hexagon: \n");
        double userIn = sc.nextDouble();
        int result = areaOfAHexagon(userIn);
        System.out.println(result);

        //Problem 2
        System.out.println("Enter a side of a Hexagon: (x2) \n");
        double userIn2 = sc.nextDouble();
        int result2 = perimeterOfAHexagon(userIn2);
        System.out.println(result2);

        //Problem 3
        System.out.println("Enter a string: \n");
        String userIn3 = sc.next();
        int result3 = countVowels(userIn3);
        System.out.println(result3);

        //Problem 4
        System.out.println("Enter a 5 digit number: \n");
        int userNumber = sc.nextInt();
        String result4 = reverse5DigitNumber(userNumber);
        System.out.println(result4);
    }
}

////////////////////////////////////
//                                //
// ANSWER THE FOLLOWING QUESTIONS //
//                                //
////////////////////////////////////

/*
 * Questions 1 and 2 are on explicit and implicit casting of some numerical types
 *
 * 1.  What happens if you multipy an int with a char?
 *
 * It treats char like an int, and multiplies the two together.
 *
 * 2.  What happens if you square a char?
 *
 * It acts like if it were an int in the same situation.
 *
 * 3.  What happens if a method has a paramater of type int, but you pass it a char?
 *
 * It acts like an int were passed to it.
 *
 * 4. What happens if a method has a paramater of type int, but you pass it a float?
 *
 * TypeError.
 * 
 * 5.  What is the difference between float and double in the Java?
 *
 * A double is a more accurate representation of particularly irrational numbers because it has more numbers places in the data type.
 *
 * 6.  Consider the following code snippet.
 *     int i = 25;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 *
 *     Without Compiling the Program:
 *          What {do you think} are the values of i and n if the code is executed? 26, 27
 *          What is the final value printed? 4 - no remainder
 *          Now Compile and Run the Program to check your answers. If they are different, explain why
 *          and provide updated code!
 *          There's actually an error because the type for n isn't defined. It is a code *snippet* after all.
 *
 * 7.  If I define a class as below:
 *     class addnumbers {
 *            public static int addOperation(int FirstOperand, int sop){
 *                   return firstOperand+sop;
 *            }
 *            ...
 *     }
 *     Looking at Java Coding Conventions, what suggestions would you give for code refactoring?
 *     Instead of abbreviating, you could call it secondOperand, and the F in FirstOperand should be lowercase.
 *     I'd also probably just call the function add()
 *
 * 8.  int i = 10000000 * 100000000;
 *	   System.out.println(i);
 *
 *     Why does the code above print a weird answer? How will you fix it (for same computation)?
 *     I'd imagine Java is indicative of the classic sci-fi answer of integer overflow, meaning the data type storage limit for int was exceeded causing it to rebound at the bottom of the potential storage.
 *     This would make sense as to why Int is called a "primitive" data type.
 *     I would make them doubles to fix the computation, and then you could always cast them back as ints
 */
