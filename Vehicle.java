/**
 * The base vehicle class which gives the description and price of a created vehicle
 * @author Michael Sana
 */
public abstract class Vehicle{

    protected String description;

    /**
     * returns the vehicle description
     * @return vehicle description
     */
    public String toString(){
        return description;
    }
    public abstract double getCost();
}