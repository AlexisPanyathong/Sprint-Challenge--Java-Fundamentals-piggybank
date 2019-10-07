package piggybank;

// This needs to extend from Coins
public class Nickel extends Coins {

    // Passing in the functions from Coins
    public Nickel(int numAdded) {

        super(numAdded);
    }

    public Nickel() {

        super();
    }

    @Override
    // If Statement - if the numAdded is equal to 1 then return numAdded + a Nickel, if not then add the numAdded to Nickels
    public String getNumAdded() {

        if (numAdded == 1) 
        {
            return numAdded + " Nickel";
        }
        else {
            return numAdded + " Nickels";
        }
    }

    @Override
    public double getTotal() {
        
        return numAdded * 0.05;
    }
}