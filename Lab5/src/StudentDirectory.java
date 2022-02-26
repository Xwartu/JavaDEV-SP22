import java.util.Arrays;
import java.util.Scanner;

public class StudentDirectory
{
    public static void main(String[] args)
    {
        //Booleans
        boolean finished = false;
        boolean userSkippedAge = false;
        boolean userSkippedYear = false;
        boolean userSkippedGrade = false;
        boolean ageAnswered = false;
        boolean yearAnswered = false;
        boolean gradeAnswered = false;
        boolean yearImproper = true;

        //Ints
        int minimumAge = 0;
        int minimumYear = 0;
        int minimumGrade = 0;

        Scanner sc = new Scanner(System.in);

        int[][] studentDatabase = {{1, 18, 12, 90}, {2, 16, 10, 24}, {3, 15, 9, 84}, {4, 15, 10, 53}, {5, 16, 11, 98}, {6, 13, 9, 11}, {7, 17, 11, 71}, {8, 16, 10, 65}, {9, 19, 12, 34}, {10, 15, 9, 67}};
        System.out.println("Thank you for accessing the student database");
        while(!finished)
        {
            System.out.println("Enter the desired minimum age, and enter -1 to skip this filter");
            int userInput = sc.nextInt();
            if(!ageAnswered)
            {
                if(userInput != -1)
                {
                    if(userInput >= 0) // Age checks
                    {
                        minimumAge = userInput;
                        ageAnswered = true;
                        userSkippedAge = false;
                    }

                }
                else
                {
                    userSkippedAge = true;
                    ageAnswered = true;
                }
            }
            System.out.println("Enter the desired minimum year, and enter -1 to skip this filter");
            userInput = sc.nextInt();
            if(!yearAnswered)
            {
                if(userInput != -1)
                {
                    if(userInput < 13 && userInput > 8) //Year checks
                    {
                        System.out.println(userInput);
                        minimumYear = userInput;
                        yearAnswered = true;
                        userSkippedYear = false;
                    }
                    else if(userInput <= 8 && userInput >= 0)
                    {
                        //System.out.println(userInput);
                        System.out.println("Invalid input!");
                        yearImproper = false;
                    }
                }
                else
                {
                    userSkippedYear = true;
                    yearAnswered = true;
                }
            }
            System.out.println("Enter the desired minimum grade, and enter -1 to skip this filter");
            userInput = sc.nextInt();
            if(!gradeAnswered)
            {
                if(userInput != -1)
                {
                    System.out.println(userInput);
                    if(userInput < 101 && userInput >= 0) //Grade checks
                    {
                        minimumGrade = userInput;
                        gradeAnswered = true;
                        userSkippedGrade = false;
                    }
                }
                else
                {
                    System.out.println(userInput);
                    userSkippedGrade = true;
                    gradeAnswered = true;
                }
            }
            //Done
            if(yearImproper)
            {
                if(ageAnswered)
                {
                    if(yearAnswered)
                    {
                        if(gradeAnswered)
                        {
                            finished = true;
                        }
                    }
                }
            }
        }

        ///Represent their choices

        int[] studentArray1 = new int[10];
        boolean ageCheck = false;
        boolean yearCheck = false;
        boolean gradeCheck = false;
        for(int i = 0; i < 10; i++)
        {

            if(!userSkippedAge)
            {
                ageCheck = FilterByMinimumAge(studentDatabase, minimumAge, i);
            }
            else
            {
                ageCheck = false;
            }
            if(!userSkippedYear)
            {
                yearCheck = FilterByMinimumYear(studentDatabase, minimumYear, i);
            }
            else
            {
                yearCheck = false;
            }
            if(!userSkippedGrade)
            {
                gradeCheck = FilterByMinimumGrade(studentDatabase, minimumGrade, i);
            }
            else
            {
                gradeCheck = false;
            }

            if(ageCheck && !userSkippedAge)
            {
                if(yearCheck && !userSkippedGrade)
                {
                    if(gradeCheck && !userSkippedYear)
                    {
                        studentArray1[i] += studentDatabase[i][0];
                    }
                    else
                    {
                        studentArray1[i] += studentDatabase[i][0];
                    }
                }
                else
                {
                    if(gradeCheck && !userSkippedYear)
                    {
                        studentArray1[i] += studentDatabase[i][0];
                    }
                }
            }
            else
            {
                if(yearCheck && !userSkippedGrade)
                {
                    if(gradeCheck && !userSkippedYear)
                    {
                        studentArray1[i] += studentDatabase[i][0];
                    }
                    else
                    {
                        studentArray1[i] += studentDatabase[i][0];
                    }
                }
                else
                {
                    if(gradeCheck && !userSkippedYear)
                    {
                        studentArray1[i] += studentDatabase[i][0];
                    }
                }
            }
        }

        for(int i = 0; i < studentArray1.length; i++)
        {
            if(studentArray1[i] != 0)
            {
                System.out.println("Valid ID: " + studentArray1[i]);
            }
        }
    }


    public static boolean FilterByMinimumAge(int[][] array, int minNum, int index)
    {
        if(array[index][1] >= minNum)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static boolean FilterByMinimumYear(int[][] array, int minNum, int index)
    {
        // temp array to return
        if(array[index][2] >= minNum)
        {
           return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean FilterByMinimumGrade(int[][] array, int minNum, int index)
    {
        if(array[index][3] >= minNum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
