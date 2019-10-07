package piggybank;

// This needs to extend from Coins
public class Dime extends Coins {

    // Passing in the functions from Coins
    public Dime(int numAdded) {

        super(numAdded);
    }

    public Dime() {

        super();
    }

    @Override
    // If Statement - if the numAdded is equal to 1 then return numAdded + a Dime, if not then add the numAdded to Dimes
    public String getNumAdded() {
        if (numAdded == 1)
        {
            return numAdded + " Dime";
        }
        else {
            return numAdded + " Dimes";
        }
    }

    @Override
    public double getTotal() {

        return numAdded * 0.10;
    }
}