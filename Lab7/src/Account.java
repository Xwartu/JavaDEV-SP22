public class Account
{
    //Instance Variables\\
    protected double balance;

    //Setters\\

    //Set Balance
    public void setBalance(double newBalance)
    {
        balance = newBalance;
    }

    //Getters\\
    public double getBalance()
    {
        return balance;
    }

    //Methods\\

    // Withdraw from balance
    public void Withdraw(double amount)
    {
        // Use getters and setters for desired functions
        setBalance(getBalance() - amount);
    }


    //Deposit towards the balance
    public void Deposit(double amount)
    {
        // Use getters and setters for desired functions
        setBalance(getBalance() + amount);
    }

    // Print out the balance
    public void printBalance()
    {
        System.out.println("Account Balance: " + getBalance());
    }
}
