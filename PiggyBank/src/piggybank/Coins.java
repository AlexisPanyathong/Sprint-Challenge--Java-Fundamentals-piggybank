package piggybank;

public abstract class Coins
{
    // int numAdded;
    int numAdded;

    public Coins(int numAdded) {
        this.numAdded = numAdded;
    }
    
    public Coins() {
        numAdded = 1;
    }

    // Creating the functions to be able to add all the coins and getting the total amount.
    public abstract String getNumAdded();
    public abstract double getTotal();

   
}