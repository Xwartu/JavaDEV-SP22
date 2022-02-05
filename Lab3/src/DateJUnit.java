import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateJUnit {

    @Test
    void Main()
    {

    }
}

////////////////////////////////////
//                                //
// ANSWER THE FOLLOWING QUESTIONS //
//                                //
////////////////////////////////////

/*
* Answer the following questions as comments below your class file or submit a text file:
*    a. Give the type and value for each of the following expressions:
*       i. 7.8 == 78
*       ii. 2.3+5*7.01
*       iii. N*4 (treat C as character or ‘N’)
*       iv.9+8+”21”
*    b. Without compiling/running the code or looking at any documentation, predict the
*    value printed by each of the following code fragments. Now compile/run (you may
*    have to write that in your main method) and see if your answer was correct. Report
*    the output and whether you were initially correct. If incorrect, explain in one
*    sentence what was the error you missed:
*
*      i. See the following separate code fragments (assume a main if not present):
        public class Main {
            public static void main (String[] args) {
                double num = 9.78;
                int newNum = (int) num;
                String newStr = String.valueOf(newNum);
                System.out.println(num);
                System.out.println(newNum);
                System.out.println(newStr);
                System.out.println(num+newNum);
                System.out.println(newStr+num);
            }
         }

        ii. System.out.printf(“%03d”,7);

        iii. String s = “Bye ByeBye”;
        s = String.replace(‘y’, ‘e’);
        System.out.println(s);
*
*      c. How are Strings immutable in Java? Explain in a few sentences. What alternatives do you
       have for manipulating Strings?
*
* Answers:
*       ai: bool, false
*       aii: double, 37.35
*       aiii: int, 92
*       aiv:
*
*/