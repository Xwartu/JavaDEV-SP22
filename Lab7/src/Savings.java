public class Savings extends Account
{
    //Instance Variables\\
    private double interestRate;

    //Parameterized Constructor
    public Savings(double balanceInst, double interestRateInst)
    {
        //Instance variables
        setInterestRate(interestRateInst);
        deposit(balanceInst);
    }

    //Setters\\
    public void setInterestRate(double newInterestRate)
    {
        interestRate = newInterestRate;
    }

    //Getters\\

    public double getInterestRate()
    {
        return interestRate;
    }

    //Methods\\
    //Savings version of Withdraw
    public void withdraw(double amount)
    {
        super.setBalance((super.getBalance() - amount) * getInterestRate());
    }

    //Savings version of Deposit
    public void deposit(double amount)
    {
        super.setBalance((super.getBalance() + amount) * getInterestRate());
    }

    //Print the balance from account
    public void printBalance()
    {
        System.out.println("Account Balance: " + super.getBalance());
    }


}
