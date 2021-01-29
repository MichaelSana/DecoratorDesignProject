/**
 * Gives the String representation and price of adding Rims to the VehicleDecorator class
 * @author Michael Sana
 */
public class Rims extends VehicleDecorator {

    Vehicle vehicle;

    /**
     * Initializes the vehicle which will be getting Rims
     * @param vehicle
     */
    public Rims (Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * Gives the string representation of getting Rims on the vehicle
     */
    @Override
    public String toString() {
        return vehicle.toString() + ", cool rims";
    }

    /**
     * Adds the cost of the Rims onto the existing cost of the vehicle
     */
    @Override
    public double getCost() {
        return vehicle.getCost() + 200;
    }
    
}
