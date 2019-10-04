package piggybank;

// This needs to extend from Coins
public class Dollar extends Coins {

    // Passing in the functions from Coins
    public Dollar(int numAdded) {

        super(numAdded);
    }

    public Dollar() {

        super();
    }

    @Override
    // If Statement - if the numAdded is equal to 1 then return numAdded + a Dollar, if not then add the numAdded to Dollars
    public String getNumAdded() {

        return "$" + numAdded;
    }

    @Override
    public double getTotal() {

        return numAdded * 1.00;
    }

}