/**
 * Gives the description and price to the Vehicle Class for a Compact Car
 * @author Michael Sana
 */
public class Compact extends Vehicle{

    /**
     * Gives the description for a Compact car
     */
    public Compact(){
        this.description = "Compact";
    }

    /**
     * Gives the price of a Compact Car
     */
    @Override
    public double getCost() {
        return 15000;
    }

    
}
