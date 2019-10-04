package piggybank;

public class Dollar extends Coins {

    public Dollar(int numAdded) {

        super(numAdded);
    }

    public Dollar() {

        super();
    }

    @Override
    public String getNumAdded() {

        return "$" + numAdded;
    }

    @Override
    public double getTotal() {

        return numAdded * 1.00;
    }

}