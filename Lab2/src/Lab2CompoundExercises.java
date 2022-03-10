////////////////////////////////////////////////////////////////////////////////////
//  C212
//  Released:  1/19/22
//  Lab 2
//  @Author  Your Name and username
//  Last Edited:
//
//  Directions: See Below
//
//////////////////////////////////////////////////////////////////////////////////

class Lab2CompoundExercises {
    public static void main(String[] args){
        differentOperators();
        //differentOperatorsVersion2();
        //differentOperatorsVersion3();
        question2();
    }
	// 1. Review the following method (differentOperators). You will create two new methods, name them as you see fit,
    //    and implement the following changes:
	// 1a. Change differentOperators() to use ONLY simple-assignment operators and not compound. All printf statements should print the
    //     same values.
	// 1b. Change differentOperators() to use a post-increment operator each time there used to be a pre-increment operator,
    //     and vice versa. Does this change the result?
    //
    //     Since you asked, I guessed yes, but considering they'd cancel each other out in an actual formula, I guess it did not matter. Maybe it would've if they had started on the same side.
     public static void differentOperators(){

          int result = 11; // result is 11
          System.out.println(result);

          --result; // result is now 10
          System.out.println(result);

          result /=- 2; // result is now -5
          System.out.println(result);

          result *=- 20; // result is now 100
          System.out.println(result);

          result %=+ 4; // result is now 0
          System.out.println(result);

          result++; // result is now 1
          System.out.println(result);
     }

    public static void differentOperatorsVersion2(){ // Simple operators

        int result = 11; // result is 11
        System.out.println(result);

        result = result - 1; // result is now 10
        System.out.println(result);

        result = result / -2; // result is now -5
        System.out.println(result);

        result = result * -20; // result is now 100
        System.out.println(result);

        result = result % 4; // result is now 0
        System.out.println(result);

        result = result + 1; // result is now 1
        System.out.println(result);
    }

    public static void differentOperatorsVersion3(){ // Switching pre and post

        int result = 11; // result is 11
        System.out.println(result);

        --result; // result is now 10
        System.out.println(result);

        result /=- 2; // result is now -5
        System.out.println(result);

        result *=- 20; // result is now 100
        System.out.println(result);

        result %=+ 4; // result is now 0
        System.out.println(result);

        ++result; // result is now 1
        System.out.println(result);
    }

// 2. In the following program, using comments in this file, explain why the value "6" is printed thrice in a row:
//    Also, explain why "8" became "6" from line 51 to 52.
     public static void question2() {
        int i = 6; // Start with 6
        ++i; // ++ means you add something to 1, so this is 1 + 6 = 7
        System.out.println(i);    // "7"
        i++; // Now we increment the 1 with i being the first operator, 7 + 1 = 8
        System.out.println(i--);  // "8" // Printing does not stop the local variable from being modified, so i = 7 here having now been subtracted by one
        System.out.println(--i);  // "6" // We subtracted 1 in the manner similar to (-1) + 7 to get 6, which is because again, print is still modifying the variable
        System.out.println(i--);  // "6" // Since code is read left to right, the print statement is printing the state of i before it's then modified by the --; i = 5
        System.out.println(++i);  // "6" // Same logic opposite result for the previous question, 1 was added to 5 before i was read so i = 6
         // So despite our manipulation of i, it was done in a manner that when i was read by the profiler the last 3 times, it happened to be 6 at that moment,
         // but it really wasn't always between the execution of the lines of code.
     }
}