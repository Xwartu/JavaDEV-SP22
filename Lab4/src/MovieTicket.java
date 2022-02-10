import java.util.Scanner;

public class MovieTicket
{
    public static void main(String[] args)
    {
        boolean doneWithTickets = false;
        Scanner sc = new Scanner(System.in);
        int totalTicketCost = 0;
        int totalTicketNum = 0;
        String ratingCheck = "";
        boolean buyerTooYoung = false;
        boolean ratingAnswered = false;
        boolean ticketNumAnswered = true;
        boolean ageChecked = false;

        System.out.println("Welcome to the ticket buying menu: \n\n");

        while(!doneWithTickets)
        {
            if(!ratingAnswered)
            {
                System.out.println("What movie rating would you like to see?\n\n");
                System.out.println("Options: G, PG, PG13, R\n\n");
                String rating = sc.next();
                ratingCheck = rating;
                ratingAnswered = true;
                ticketNumAnswered = false;
            }
            if(!ticketNumAnswered)
            {
                System.out.println("How many tickets do you want to buy?\n\n");
                int ticketNum = sc.nextInt();
                totalTicketNum = ticketNum;
                ticketNumAnswered = true;
            }
            if(ratingAnswered && ticketNumAnswered)
            {
                if (!ageChecked)
                {
                    for(int i = 0; i < totalTicketNum; i++)
                    {
                        System.out.println("Please enter the the age for customer " + (i + 1) + "\n\n");
                        int age = sc.nextInt();
                        int ticketPrice = getPrice(age);
                        boolean ageCheck = ageRestricted(age, ratingCheck);
                        if(ageCheck == true)
                        {
                            buyerTooYoung = true;
                        }
                        totalTicketCost += ticketPrice;
                    }
                    ageChecked = true;
                }
                else
                {
                    if(buyerTooYoung == true)
                    {
                        System.out.println("Age Restricted");
                        doneWithTickets = true;
                    }
                    else
                    {
                        System.out.println("Total ticket price for the given movie is: $" +totalTicketCost);
                        doneWithTickets = true;
                    }
                }
            }
        }

    }

    //Methods, like main at the top
    public static boolean ageRestricted(int age, String rating)
    {
        if(rating.equalsIgnoreCase("PG"))
        {
            return false; // Everyone can see
        }
        else if(rating.equalsIgnoreCase("PG13"))
        {
            if (age >= 0 && age <=12)
            {
                return true;
            }
            else if (age >= 13 && age <= 17)
            {
                return false;
            }
            else // 18+
            {
                return false;
            }
        }
        else if(rating.equalsIgnoreCase("R"))
        {
            if (age >= 0 && age <=12)
            {
                return true;
            }
            else if (age >= 13 && age <= 17)
            {
                return true;
            }
            else // 18+
            {
                return false;
            }
        }
        else // G movies
        {
            return false; // Everyone can see
        }
    }

    public static int getPrice(int age)
    {
        if (age >= 0 && age <=12)
        {
            return 5;
        }
        else if (age >= 13 && age <= 17)
        {
            return 9;
        }
        else // 18+
        {
            return 12;
        }
    }
}
