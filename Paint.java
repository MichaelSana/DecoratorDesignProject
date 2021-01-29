/**
 * Gives the description and price of paint to the VehicleDecorator class
 * @author Michael Sana
 */
public class Paint extends VehicleDecorator {

    Vehicle vehicle;

    /**
     * Initializes the vehicle that will be getting paint
     * @param vehicle
     */
    public Paint(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /**
     * Gives the string version of what adding paint to the car says
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return vehicle.toString() + ", fancy paint";
    }

    /**
     * Adds the cost of the paint on to the existing vehicle
     */
    @Override
    public double getCost() {
        return vehicle.getCost() + 150;
    }
    
}
