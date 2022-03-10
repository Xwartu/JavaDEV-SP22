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

    //Withdraw from balance
    public void withdraw(double amount)
    {

    }


    //Deposit towards the balance
    public void deposit(double amount)
    {

    }

    //Print out the balance
    public void printBalance()
    {

    }
}

/*
* 2. Can we override the final method, True or False? Briefly explain the reason.
* This is false, because in declaring the method as final, we are declaring the method itself for all intents and purpose as immutable.
* To then override the method would be paradoxical to the usage of the final keyword in the first place, hence it's not allowed.
* This also prevents any potential overwriting of the method final is used with.
 */
