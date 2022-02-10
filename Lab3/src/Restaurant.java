public class Restaurant
{
    //private instance variable
    private int balance;

    //Methods\\

    //Set the balance provided to you by the user
    public void setBalance(int _userInput)
    {
        balance = _userInput;
    }

    //Subtract the cost of purchasing new materials from balance
    public void itemPurchase(int _cost)
    {
        balance = balance - _cost;
    }

    //Sell items to gain money for profit
    public void itemSell(int _profit)
    {
        balance = balance + _profit;
    }

    //Return the state of balance
    public int getBalance()
    {
        return balance;
    }
}



