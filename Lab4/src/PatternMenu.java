import java.util.Scanner;
import java.util.Random;

public class PatternMenu
{
    public static void main(String[] args)
    {
        boolean finished = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Pattern Menu\n");
        System.out.println("Please select a pattern from the following: ");
        System.out.println("For Pattern A: Enter A");
        System.out.println("For Pattern B: Enter B");
        System.out.println("For Pattern C: Enter C");
        System.out.println("For Pattern D: Enter D");
        System.out.println("\n\nTo exit the menu: Enter E\n\n");

        while(!finished)
        {
            String userInput = sc.next();
            if(userInput.equalsIgnoreCase("E"))
            {
                System.out.println("\n\nExiting Selection");
                finished = true;
            }
            else if(userInput.equalsIgnoreCase("A"))
            {
                System.out.println("Selected Pattern A\n");
                PatternA();
            }
            else if(userInput.equalsIgnoreCase("B"))
            {
                System.out.println("Selected Pattern B\n");
                PatternB();
            }
            else if(userInput.equalsIgnoreCase("C"))
            {
                System.out.println("Selected Pattern C\n");
                PatternC();
            }
            else if(userInput.equalsIgnoreCase("D"))
            {
                System.out.println("Selected Pattern D\n");
                PatternD();
            }
            else
            {
                System.out.println("Selection failed. Please re-enter your selection!");
            }
        }
    }

    //Methods\\

    //Follows Pattern 1
    public static void PatternA()
    {
        int size = RandomInteger();
        System.out.println("Number selected was: " + size +"\n\n");
        int count = size;
        int spacing = 0;
        String spacingStr = "\s";
        for(int i = 0; i <= size; i++)
        {
            String temp = "*";
            String temp2 = temp.repeat(count);
            String temp3 = spacingStr.repeat(spacing);
            String temp4 = temp3 + temp2;
            System.out.println(temp4);
            count--;
            spacing++;
        }
        System.out.println("\n\nSelect again or enter E to exit\n\n");
    }

    //Follows Pattern 2
    public static void PatternB()
    {
        int size = RandomInteger();
        String patternPiece = "" + size;
        int size2 = 2 * size;
        int spacing = 0;
        boolean maxReached = false;
        String spacing2 = "\s";
        int maxSpacing = size - 1;
        System.out.println("Number selected was: " + size +"\n\n");
        for(int i = 0; i < size2; i++)
        {
            if(!maxReached) // Ignoring correction for my sake
            {
                String temp = spacing2.repeat(spacing);
                String temp2 = temp + patternPiece;
                System.out.print(temp2 + "\n");
                spacing++;
                if(spacing == maxSpacing){
                    maxReached = true;
                }
            }
            else
            {
                String temp = spacing2.repeat(spacing);
                String temp2 = temp + patternPiece;
                System.out.print(temp2 + "\n");
                spacing--;
                if(spacing <= 0)
                {
                    System.out.print(patternPiece);
                    break;
                }
            }
        }
        System.out.println("\n\nSelect again or enter E to exit\n\n");
    }

    //Follows Pattern 3
    public static void PatternC()
    {
        int size = RandomInteger();
        System.out.println("Number selected was: " + size +"\n\n");
        for(int i = 1; i <= size; i++)
        {
            String temp = "" + i;
            String temp2 = temp.repeat(i);
            System.out.println(temp2);
        }
        System.out.println("\n\nSelect again or enter E to exit\n\n");
    }

    //Follows my own pattern
    public static void PatternD()
    {
        int size = RandomInteger();
        System.out.println("Number selected was: " + size +"\n\n");
        for(Double i = 1.0; i <= size; i += 1.0)
        {
            String temp = "#";
            Double temp2 = Math.pow(i, 2.0);
            int temp3 = temp2.intValue();
            String temp4 = temp.repeat(temp3);

            System.out.println(temp4);
            System.out.println("\n");
        }
        System.out.println("\n\nSelect again or enter E to exit\n\n");
    }

    public static int RandomInteger()
    {
        Random rand = new Random();
        int returnInt = rand.nextInt(3,11);
        return returnInt;
    }
}
