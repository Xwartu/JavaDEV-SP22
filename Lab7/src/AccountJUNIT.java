import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountJUNIT
{
    @Test
    void Main()
    {
        // Make a savings account object
        Savings SavingsAccount = new Savings(20000, 0.8);

        //Check the deposit function for savings
        assertNotEquals(20000, SavingsAccount.getBalance());

        //Check current account functionality
        Current currentAccount = new Current(20000);
        assertEquals(20000, currentAccount.getBalance());
    }
}