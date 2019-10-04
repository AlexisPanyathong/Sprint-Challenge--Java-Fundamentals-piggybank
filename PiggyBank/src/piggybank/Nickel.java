package piggybank;

public class Nickel extends Coins {

    public Nickel(int numAdded) {

        super(numAdded);
    }

    public Nickel() {

        super();
    }

    @Override
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