package piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        // Created an ArrayList of piggybank
	    ArrayList<Coins> piggyBank = new ArrayList<Coins>();

        // I added the new list
	    piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        // Prints out each coin values
        piggyBank.forEach(c -> System.out.println(c.getNumAdded()));
        System.out.println("\n");

        // A For Loop - if the number is less than the piggybank size than add onto it.
	    double bankTotal = 0.00;
	    for(int i = 0; i < piggyBank.size(); i++)
        {
            bankTotal += piggyBank.get(i).getTotal();
        }

        System.out.println("The piggy bank holds " + fp.format(bankTotal));
        System.out.println("\n");
    }
}