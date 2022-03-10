public class Current extends Account
{
    //Parameterized Constructor
    public Current(double balanceInst)
    {
        deposit(balanceInst);
    }

    //Methods\\

    //Withdraw from balance
    public void withdraw(double amount)
    {
        // Use getters and setters for desired functions
        super.setBalance(super.getBalance() - amount);
    }

    //Deposit towards the balance
    public void deposit(double amount)
    {
        // Use getters and setters for desired functions
        super.setBalance(super.getBalance() + amount);
    }

    //Print the balance from account
    public void printBalance()
    {
        System.out.println("Account Balance: " + super.getBalance());
    }
}
