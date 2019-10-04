package piggybank;

public class Quarter extends Coins {

    public Quarter(int numAdded) {

        super(numAdded);
    }

    public Quarter() {

        super();
    }

    @Override
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