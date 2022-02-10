import java.util.Scanner;

///Just could not figure out spacing calculation, but not good enough reason

public class PyramidPrinting
{
    public static void main(String[] args)
    {
        /*boolean finished2 = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd base for the Asterisk Pyramid: \n\n");
        while(!finished2)
        {
            int userInput = sc.nextInt();
            if (userInput % 2 == 0)
            {
                System.out.println("Invalid input. No evens! Try again!\n\n");
            }
            else
            {
                System.out.println("Printing... \n\n\n");
                pyramidPrinting(userInput);
                finished2 = true;
            }
        }*/

        //Didn't realize we didn't have to have an input system till end, here to use if wanted

        //Example 1:
        pyramidPrinting(9);
        System.out.println("\n\n\n\n");
        pyramidPrinting(5);
        System.out.println("\n\n\n\n");
        pyramidPrinting(89);
    }

    //Method
    public static void pyramidPrinting(int pyramidBase)
    {
        int spacing;
        String spacing2 = "\s";
        int size = pyramidBase;
        int size2 = pyramidBase;
        int count = 0;
        //Couldn't think how else to reverse this
        String[] array = new String[100];

        for (int i = array.length - 1; i > 0; i--)
        {
            array[i] = "0";
        }

        for (int i = 1; i < size2 + 2; i +=2)
        {
            if(size <= 1)
            {
                spacing = size/2*(size2-1/size2);
                String temp3 = "*";
                String spacing3 = spacing2.repeat(pyramidBase - spacing);
                array[i] = spacing3 + temp3;
                //System.out.println(array[i]);
                size -=2;
            }
            else
            {
                spacing = size/2;
                String temp = "*";
                String temp2 = temp.repeat((size));
                String spacing3 = spacing2.repeat(pyramidBase - spacing);
                array[i] = spacing3 + temp2;
                size -= 2;
                //System.out.println(array[i]);
            }
            count++;
        }
        for(int i = array.length - 1; i > 0; i--){
            if (!array[i].equals("0"))
            {
                System.out.println(array[i]);
            }
        }
    }
}
