package piggybank;

public class Penny extends Coins {

    public Penny(int numAdded) {

        super(numAdded);
    }

    public Penny() {

        super();
    }

    @Override
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