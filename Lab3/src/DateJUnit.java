import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateJUnit {

    @Test
    void Main()
    {
        //Prove that after instancing an object, having an empty object template is different from being null altogether.
        Date d_dateObj = new Date();
        assertNotNull(d_dateObj);

        // After setting a date, double check that the day is being grabbed properly.
        d_dateObj.setDate("10-11-2000");
        assertEquals("11", d_dateObj.getDay());

        //Create a second date object, set its date, and then have it compare to the original date object with getDifferent()
        Date d2 = new Date();
        d2.setDate("10-11-2001");
        assertEquals(365, d_dateObj.getDifferent(d2));

        // Set the year and then check it's changed properly
        d_dateObj.setYear(2020);
        assertEquals("2020", d_dateObj.getYear());

        // Homework questions code, IGNORE
        //double num = 9.78;
        //int newNum = (int) num;
        //String newStr = String.valueOf(newNum);
        //System.out.println(num);
        //.out.println(newNum);
        //System.out.println(newStr);
        //System.out.println(num+newNum);
        //System.out.println(newStr+num);

        //System.out.printf("%03d",7);

        //tring s = "Bye ByeBye";
        //s = String.replace('y', 'e');
        //System.out.println(s);
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
*       a i: bool, false
*       a ii: double, 37.35
*       a iii: int, 92
*       aiv: Error, you can't combine int and string types with +, it would error at the 17 + "21" part of the process
*
*       b i: What really surprised me about this one, is that I thought it would round up,but rather it seems to be based off a round.floor() type method,
*       and so I expected 10 somewhere in the rounding process. Nothing else was off my assumption.
*       9.78 - G
*       9 - X
*       9 - X
*       18.78 - G
*       99.78 - G

*       b ii: I had no clue what the operation in the expression operator, I just assumed it had something to do with decimal points which was correct.
*       007 - X, it seems this is syntax for creating a "decimal number" for which 7 is then stored in the one's place after 3 decimal points to the left are initialized.
*
*       b iii: I expect "Bee BeeBee",
*       well there was no output because the call from the class String wouldn't allow the code to run,
*       since it's not actually inheriting any string or anything to manipulate it's just an empty template.
*
*       c. To manipulate strings, you need to grab new sections of them and make a new string object.
*       You can't directly manipulate the data itself in the string object once it's set, that's the definition of immutability, and strings are thus unable to have their data manipulated within the object itself
* .
*       To get around this you can create new objects with the built-in string options
*       such as getting parts of strings with substring() or concat() or using length() to replace with one of the same length,
*       whatever the purpose is for manipulating the string, there are ways be breaking the previous string object as needed.
*/