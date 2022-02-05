public class Restaurant
{
    //private instance variables
    private int balance;

    //Methods
    public void setBalance(int _userInput)
    {
        balance = _userInput;
    }

    public void itemPurchase(int _cost)
    {
        balance = balance - _cost;
    }

    public void itemSell(int _profit)
    {
        balance = balance + _profit;
    }

    public int getBalance()
    {
        return balance;
    }
}



