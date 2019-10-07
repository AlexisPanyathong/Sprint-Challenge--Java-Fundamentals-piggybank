package piggybank;

// This needs to extend from Coins
public class Penny extends Coins {

    // This needs to extend from Coins
    public Penny(int numAdded) {

        super(numAdded);
    }

    public Penny() {

        super();
    }

    @Override
    // If Statement - if the numAdded is equal to 1 then return numAdded + a Penny, if not then add the numAdded to Pennies
    public String getNumAdded() {

        if (numAdded == 1) 
        {
            return numAdded + " Penny";
        }
        else {

            return numAdded + " Pennies";
        }
    }

    @Override
    public double getTotal() {

        return numAdded * 0.01;
    }
}