package piggybank;

public class Dime extends Coins {

    public Dime(int numAdded) {

        super(numAdded);
    }

    public Dime() {

        super();
    }

    @Override
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