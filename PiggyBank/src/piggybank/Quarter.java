package piggybank;

// This needs to extend from Coins
public class Quarter extends Coins {

    // Passing in the functions from Coins
    public Quarter(int numAdded) {

        super(numAdded);
    }

    public Quarter() {

        super();
    }

    @Override
    // If Statement - if the numAdded is equal to 1 then return numAdded + a Quarter, if not then add the numAdded to Quarters
    public String getNumAdded() {
        if (numAdded == 1) 
        {
            return numAdded + " Quarter";
        }
        else {

            return numAdded + " Quarters";
        }
    }

    @Override
    public double getTotal() {

        return numAdded * 0.25;
    }
}