import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PatientReader
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // Menu Variables
        boolean finished = false;
        Scanner sc = new Scanner(System.in);

        // File
        File inputFile = new File("Lab10/patients.txt");

        while(!finished)
        {
            System.out.println("Please select from the following options:");
            System.out.println("1 - Add a patient to the file");
            System.out.println("2 - Delete a patient record");
            System.out.println("3 - Count the total number of sick and recovered patients");
            System.out.println("4 - Find the average age of all patients");
            System.out.println("5 - Sort patients by age");
            System.out.println("6 - Sort patients by first name or last name");
            System.out.println("7 - Shuffle patients");
            System.out.println("8 - Exit the Menu");

            int userInput = sc.nextInt();
            if(userInput == 1) // Writing
            {
                System.out.println("Enter patient's first name");
                String patientName1 = sc.next();
                System.out.println("Enter patient's last name");
                String patientName2 = sc.next();
                String patientName = patientName1 + " " + patientName2;
                System.out.println("Enter patient's month of birth");
                int patientMonth = sc.nextInt();
                System.out.println("Enter patient's day of birth");
                int patientDay = sc.nextInt();
                System.out.println("Enter patient's year of birth");
                int patientYear = sc.nextInt();
                String patientBirth = isBirthValid(patientDay, patientMonth, patientYear);
                if(patientBirth.equals("Given birthdate is not valid."))
                {
                    System.out.println("Date values entered were not valid!");
                    System.out.println("Patient not added");
                }
                else
                {
                    addPatient(patientName, patientBirth, inputFile.getName());
                    System.out.println("Patient added");
                }

            }
            else if(userInput == 2) // Writing
            {
                System.out.println("Enter patient's first name");
                String patientName1 = sc.next();
                System.out.println("Enter patient's last name");
                String patientName2 = sc.next();
                String patientName = patientName1 + " " + patientName2;
                deletePatient(patientName, inputFile.getName());
                System.out.println("Patient deleted");
            }
            else if(userInput == 3) // Reading
            {
                int patientCountSick = countPatients("sick", inputFile.getName());
                int patientCountRecovered = countPatients("recover", inputFile.getName());
                System.out.println("# of Sick Patients: " + patientCountSick);
                System.out.println("# of Recovered Patients: " + patientCountRecovered);
            }
            else if(userInput == 4) // Reading
            {
                averageAge(inputFile.getName());
            }
            else if(userInput == 5) // Writing
            {
                sortPatientsByAge(inputFile.getName());
                System.out.println("Patients sorted");
            }
            else if(userInput == 6) // Writing
            {
                System.out.println("Enter 1 for sorting by First, 2 sorting for by Last");
                int userInput2 = sc.nextInt();
                String sortingString = new String();
                if(userInput2 == 1)
                {
                    sortingString = "first";
                }
                else
                {
                    sortingString = "last";
                }
                sortPatientsByName(sortingString, inputFile.getName());
                System.out.println("Patients sorted");
            }
            else if(userInput == 7) // Writing
            {
                shufflePatients(inputFile.getName());
                System.out.println("Patients Shuffled");
            }
            else if(userInput == 8)
            {
                finished = true;
            }
        }
    }


    public static String isBirthValid(int day, int month, int year)
    {
        String birthString = new String();
        boolean valid = true;
        //System.out.println(month);
        if(month < 13)
        {
            if(month < 10)
            {
                birthString += "0" + month + "/";
            }
            else
            {
                birthString += month + "/";
            }
        }
        else
        {
            valid = false;
            System.out.println("Month False");
        }
        if(day < 32)
        {
            if(day < 10)
            {
                birthString += "0" + day + "/";
            }
            else
            {
                birthString += day + "/";
            }

        }
        else
        {
            valid = false;
        }

        if(year < 2023 && year > 1922)
        {
            birthString += year;
        }
        else
        {
            valid = false;
            System.out.println("Year false");
        }

        // Now check length
        if(birthString.length() != 10)
        {
            valid = false;
            System.out.println("Length false");
        }

        if(valid == true)
        {
            return birthString;
        }
        else
        {
            return "Given birthdate is not valid.";
        }
    }

    public static void addPatient(String name, String birth, String fileName) throws IOException
    {
        File inputFile = new File(fileName);
        Scanner file = new Scanner(inputFile);

        // Build new patient
        String newPatient = new String();
        newPatient += name + " ";
        newPatient += birth + " ";
        newPatient += "sick";

        ArrayList<String> currentContent = new ArrayList<>();
        // Reading
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            currentContent.add(line);
        }

        // Writing
        PrintWriter out = new PrintWriter(fileName);

        //System.out.println("Size " + i);
        for (int i = 0; i < currentContent.size() - 1; i++)
        {
            out.println(currentContent.get(i));
        }
        out.println(newPatient);

        file.close();
        out.close();
    }

    // Can't be any spaces in the text file, but works
    public static void deletePatient(String name, String fileName) throws IOException
    {
        File inputFile = new File(fileName);
        Scanner file = new Scanner(inputFile);

        ArrayList<String> currentContent = new ArrayList<>();
        ArrayList<String> exactNames = new ArrayList<>();

        // Reading
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            currentContent.add(line);
            int i = 0;
            while (!Character.isDigit(line.charAt(i)))
            {
                i++;
            }
            exactNames.add(line.substring(0, i));
            System.out.println("Exact Name: " + line.substring(0, i));
        }

        // Find index
        int index = 0;
        int count = 0;
        for (String exactNameTemp: exactNames)
        {
            count += 1;
            if(exactNameTemp.equals(name))
            {
                index = count;
            }
        }

        // Writing
        PrintWriter out = new PrintWriter(fileName);

        //System.out.println("Size " + i);
        for (int i = 0; i < currentContent.size() - 1; i++)
        {
            if (i != index)
            {
                out.println(currentContent.get(i));
            }
        }

        file.close();
        out.close();
    }

    public static int countPatients(String status, String fileName) throws FileNotFoundException
    {
        File inputFile = new File(fileName);
        Scanner file = new Scanner(inputFile);
        //Reading
        int lineCount = 0;
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            if(status.equals("sick"))
            {
                String statusFromLine = line.substring(line.length() - 4, line.length());
                //System.out.println(statusFromLine);
                if(statusFromLine.equals("sick"))
                {
                    lineCount += 1;
                }
            }
            if(status.equals("recover"))
            {
                String statusFromLine = line.substring(line.length() - 7, line.length());
                //System.out.println(statusFromLine);
                if(statusFromLine.equals("recover"))
                {
                    lineCount += 1;
                }
            }
        }
        return lineCount;
    }

    public static void averageAge(String fileName) throws FileNotFoundException
    {
        File inputFile = new File(fileName);
        Scanner file = new Scanner(inputFile);

        //Reading
        ArrayList<String> stringArrayList = new ArrayList<String>();
        ArrayList<Integer> ageArr = new ArrayList<>();
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            int i = 0;
            while (!Character.isDigit(line.charAt(i)))
            {
                i++;
            }
            String age = line.substring(i + 6, i + 10);
            stringArrayList.add(age);
        }

        // Calculate age
        for (String age :stringArrayList)
        {
            Integer tempAge1 = Integer.parseInt(age);
            Integer tempAge2 = 2022 - tempAge1;
            ageArr.add(tempAge2);
        }

        // Average age
        int totalAge = 0;
        int size = 0;
        for (int i = 0; i < stringArrayList.size(); i++)
        {
            totalAge += ageArr.get(i);
            size += 1;
        }
        double averageAge = (double) totalAge / size;
        System.out.println("The average age is: " + Math.round(averageAge));
    }

    // Always sorts young to old
    public static void sortPatientsByAge(String fileName) throws FileNotFoundException
    {
        Scanner file = new Scanner(fileName);
        // Reading
        
        // Writing
        PrintWriter out = new PrintWriter(fileName);
        file.close();
        out.close();
    }

    public static void sortPatientsByName(String firstOrLast, String fileName) throws FileNotFoundException
    {
        File inputFile = new File(fileName);
        Scanner file = new Scanner(inputFile);

        // Reading
        ArrayList<String> stringArrayList = new ArrayList<String>();
        while (file.hasNextLine())
        {
            String line = file.nextLine();
            int i = 0;
            while (!Character.isDigit(line.charAt(i)))
            {
                i++;
            }
            String name = line.substring(0, i);
            stringArrayList.add(name);
        }

        // Sorting
        if(firstOrLast.equals("first"))
        {
            int i = 0;
            char temp;
        }
        else if(firstOrLast.equals("last"))
        {

        }
        
        // Writing
        PrintWriter out = new PrintWriter(fileName);

        file.close();
        out.close();
    }

    public static void shufflePatients(String fileName) throws FileNotFoundException
    {
        File inputFile = new File(fileName);
        Scanner file = new Scanner(inputFile);
        // Reading
        
        // Writing
        PrintWriter out = new PrintWriter(fileName);

        file.close();
        out.close();
    }
}
