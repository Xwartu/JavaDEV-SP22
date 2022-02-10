import java.util.Random;
import java.util.Scanner;

public class MultiplicationGame
{
    public static void main(String[] args)
    {
        boolean guessedCorrect = false;
        int correctAnswer = randomNum1() * randomNum2();
        //System.out.println(correctAnswer);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nCan you guess the product correctly?\n");
        while (!guessedCorrect)
        {
            int userInput = sc.nextInt();
            if (userInput == correctAnswer)
            {
                System.out.println("\n\nGuessed correctly!\n");
                guessedCorrect = true;
            }
            else
            {
                System.out.println("\n\nWrong! Guess again\n");
            }
        }

    }

    public static int randomNum1()
    {
        Random rand = new Random();
        int returnInt = rand.nextInt(1,13);
        //System.out.println(returnInt);
        return returnInt;
    }

    public static int randomNum2()
    {
        Random rand = new Random();
        int returnInt = rand.nextInt(1,13);
        //System.out.println(returnInt);
        return returnInt;
    }
}
