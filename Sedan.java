/**
 * Gives the descriptuon and cost of a Sedan to Vehicle
 * @author Michael Sana
 */
public class Sedan extends Vehicle {

    /**
     * Gives the string description of a Sedan
     */
    public Sedan(){
        this.description = "Sedan";
    }

    /**
     * Gives the cost of a Sedan
     */
    @Override
    public double getCost() {
        return 20000;
    }
    
}
