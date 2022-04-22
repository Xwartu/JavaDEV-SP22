public class BalanceParentheses
{
    // Iterative function
    Character x;
    int leftParentheses = 0;
    int rightParentheses = 0;

    public boolean balanceParenthesesIterative(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            x = str.charAt(i);
            System.out.println(x);
            if (x.equals('('))
            {
                leftParentheses += 1;
            }
            else if(x.equals(')'))
            {
                rightParentheses += 1;
            }
        }

        if(leftParentheses == rightParentheses)
        {
            System.out.println("Balanced");
            System.out.println(leftParentheses);
            System.out.println(rightParentheses);
            return true;
        }
        else
        {
            return false;
        }
    }

    // Recursive function
    public boolean balanceParenthesesRecursive(String str)
    {
        return true;
    }
}
