/**
 * Gives the description and price of a base sportsCar
 * @author Michael Sana
 */
public class SportsCar extends Vehicle{

    /**
     * gives the description of a base SportsCar
     */
    public SportsCar(){
        this.description = "Sports Car";
    }

    /**
     * gives the cost of a base SportsCar
     */
    @Override
    public double getCost() {
        return 30000;
    }
    
}
