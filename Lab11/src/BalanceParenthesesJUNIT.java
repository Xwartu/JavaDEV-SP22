import static org.junit.jupiter.api.Assertions.*;

class BalanceParenthesesJUNIT
{
    public static void main(String[] args)
    {
        BalanceParentheses balanceTest = new BalanceParentheses();

        // Normal and expected
        assertEquals(true, balanceTest.balanceParenthesesIterative("()()()"));
    }
}