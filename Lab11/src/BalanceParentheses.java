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
    int g;
    int leftParenthesesRe = 0;
    int rightParenthesesRe = 0;

    public balanceParenthesesRecursive(String str, )
    {
        if (g == 0)
        {
            Character y = str.charAt(0);
            if(y.equals('('))
            {
                leftParentheses += 1;
            }
            else if(y.equals(')'))
            {
                rightParentheses += 1;
            }
            return leftParentheses;
        }
        else if(g != str)
        {

        }
    }
}
